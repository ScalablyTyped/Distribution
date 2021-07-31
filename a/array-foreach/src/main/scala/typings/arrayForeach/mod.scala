package typings.arrayForeach

import typings.std.Node
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](
    arr: js.Array[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
  * Performs the specified action for each element in an array.
  * @param arr Nodelist of items to iterate over
  * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
  * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
  */
  @scala.inline
  def apply[T /* <: Node */](
    arr: NodeListOf[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[T, U](
    arr: js.Array[T],
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: U
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[T /* <: Node */, U](
    arr: NodeListOf[T],
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: U
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("array-foreach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
