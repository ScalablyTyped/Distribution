package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ArrCallbackIteratorAsyncIterator extends js.Object {
  def apply[T, E](arr: asyncLib.asyncMod.IterableCollection[T], iterator: asyncLib.asyncMod.AsyncIterator[T, E]): scala.Unit = js.native
  def apply[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
}

