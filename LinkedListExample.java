package link;
//here we cretaed package as link which that organizes a set of related classes and interfaces.
import java.util.*;

public class LinkedListExample { //created class as LinkedListExample
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	public static void main(String[] args) { 
        LinkedList<String> employeename = new LinkedList<>();      //created an interface for student namelist of type string for linkedList
        
		  employeename.add("ankit"); //initializing elements and creating the student namelist objects for the list
		  employeename.add("anuj");
		  employeename.addLast("sony");
		  employeename.addFirst("nawazia");
		  employeename.add("pushpa");
		  System.out.println("The elements of linked list are : " ); 
               Iterator<String> iterator=employeename.iterator(); //traversing the elements of the object list  by using iterator method
		  
               //while loop is used to iterate a part of the program several times
               while(iterator.hasNext()){       //implementing the for each loop to traverse the elements
			  
		   System.out.println(iterator.next());  
		
		  }
		 
		         List<String> list = new ArrayList<>();   // adding the arrayList objects at the end of the linked list 
		
		  list.add("ansari");
		  list.add("ram");
		  employeename.addAll(list); //here list.addAll() this method add  the two objects list elements and prints the values
		
		  System.out.println("The elements after joining the arraylist are : " +list); 
		  
		    ListIterator<String> listIterator=employeename.listIterator();    //here it shows all the elements which are also added 
	        while(listIterator.hasNext()){                      //and displays the elements by the iterator
	        
		   System.out.println(listIterator.next());  

		  }
		 
		    System.out.println("Traversing elements in backward direction...");    //here iterating the by reverse direction 
		  while( listIterator.hasPrevious()){   //this method will displays the elements in the backward direction 
			  
			   System.out.println( listIterator.previous());   //and prints the values

		  }
		  }  
}