package typings
package arrayDashForeachLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-foreach", JSImport.Namespace)
@js.native
object arrayDashForeachMod extends js.Object {
  def apply[T](
    arr: js.Array[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  /**
  * Performs the specified action for each element in an array.
  * @param arr Nodelist of items to iterate over
  * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
  * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
  */
  def apply[T /* <: stdLib.Node */](
    arr: stdLib.NodeListOf[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  def apply[T, U](
    arr: js.Array[T],
    callbackfn: js.ThisFunction3[
      /* this */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      scala.Unit
    ],
    thisArg: U
  ): scala.Unit = js.native
  def apply[T /* <: stdLib.Node */, U](
    arr: stdLib.NodeListOf[T],
    callbackfn: js.ThisFunction3[
      /* this */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      scala.Unit
    ],
    thisArg: U
  ): scala.Unit = js.native
}

