
import java.util.*;

import javax.swing.JOptionPane;




public class Go {
	
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);int w=0;
		System.out.println("How many numbers do u need?");
		int k=in.nextInt();
		System.out.println("Which is the highest ?");
		int n=in.nextInt();
		int[]numbers=new int[n];
		int[]result=new int[k];
		int[]need=new int[k];
		int[]right=new int[k];
		for(int i=0;i<need.length;i++)
			need[i]=in.nextInt();
		Arrays.sort(need);
		for(int i=0;i<numbers.length;i++)
			numbers[i]=i+1;
		for(int i=0;i<result.length;i++)
			{int r ;
			r= (int)(Math.random()*n);
			result[i]=numbers[r];
			numbers[r]=numbers[n-1];
			}
		Arrays.sort(result);
		System.out.println("the number is :");
		for(int r:result)
			{System.out.println(r);}
		for(int i=0;i<need.length;i++)
		{	
			for(int j=0;j<result.length;j++)
			{
				if(need[i]==result[j]) 
						{right[w]=result[j];w++;}
			}
		}
		System.out.print("恭喜猜中"+w+"个数字,它们分别是：");
		for(int g=0;g<right.length;g++)
			System.out.print(right[g]);
		
		
		
	}
	
	
	

}
