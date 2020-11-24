package typings.arrayMove

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("array-move", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Clones the given `array`, moves the item to a new position in the new array, and then returns the new array. The given `array` is not mutated.
  	@param array - The array with the item to move.
  	@param from - Index of item to move. If negative, it will begin that many elements from the end.
  	@param to - Index of where to move the item. If negative, it will begin that many elements from the end.
  	@returns A new array with the item moved to the new position.
  	@example
  	```
  	import arrayMove = require('array-move');
  	const input = ['a', 'b', 'c'];
  	const array1 = arrayMove(input, 1, 2);
  	console.log(array1);
  	//=> ['a', 'c', 'b']
  	const array2 = arrayMove(input, -1, 0);
  	console.log(array2);
  	//=> ['c', 'a', 'b']
  	const array3 = arrayMove(input, -2, -3);
  	console.log(array3);
  	//=> ['b', 'a', 'c']
  	```
  	*/
  def apply[ValueType](array: js.Array[ValueType], from: Double, to: Double): js.Array[ValueType] = js.native
  
  /**
  	Moves the item to the new position in the input array. Useful for huge arrays where absolute performance is needed.
  	@param array - The array to modify.
  	@param from - Index of item to move. If negative, it will begin that many elements from the end.
  	@param to - Index of where to move the item. If negative, it will begin that many elements from the end.
  	*/
  def mutate(array: js.Array[_], from: Double, to: Double): Unit = js.native
}
