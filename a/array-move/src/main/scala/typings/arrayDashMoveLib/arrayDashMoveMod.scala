package typings
package arrayDashMoveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-move", JSImport.Namespace)
@js.native
object arrayDashMoveMod extends js.Object {
  /**
    * Move an array item to a different position.
    *
    * @param from Index of item to move. If negative, it will begin that many elements from the end.
    * @param to Index of where to move the item. If negative, it will begin that many elements from the end.
    * @returns A new array with the item moved to the new position.
    */
  def apply[T /* <: js.Array[_] */](input: T, from: scala.Double, to: scala.Double): T = js.native
  /**
    * Moves the item to the new position in the input array.
    *
    * Useful for huge arrays where absolute performance is needed.
    *
    * @param from Index of item to move. If negative, it will begin that many elements from the end.
    * @param to Index of where to move the item. If negative, it will begin that many elements from the end.
    */
  def mut(input: js.Array[_], from: scala.Double, to: scala.Double): scala.Unit = js.native
}

