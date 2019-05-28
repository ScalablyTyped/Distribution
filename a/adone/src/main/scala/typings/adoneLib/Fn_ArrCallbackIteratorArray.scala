package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ArrCallbackIteratorArray extends js.Object {
  def apply[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
}

