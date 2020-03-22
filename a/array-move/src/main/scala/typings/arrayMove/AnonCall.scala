package typings.arrayMove

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  /**
  	Move an array item to a different position.
  	@param array - The array to move the item in.
  	@param from - Index of item to move. If negative, it will begin that many elements from the end.
  	@param to - Index of where to move the item. If negative, it will begin that many elements from the end.
  	@returns A new array with the item moved to the new position.
  	@example
  	```
  	import arrayMove = require('array-move');
  	const input = ['a', 'b', 'c'];
  	arrayMove(input, 1, 2);
  	//=> ['a', 'c', 'b']
  	arrayMove(input, -1, 0);
  	//=> ['c', 'a', 'b']
  	arrayMove(input, -2, -3);
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

