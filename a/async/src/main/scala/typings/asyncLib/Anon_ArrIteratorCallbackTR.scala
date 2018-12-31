package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrIteratorCallbackTR extends js.Object {
  def apply[T, R, E](arr: asyncLib.asyncMod.Dictionary[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: asyncLib.asyncMod.Dictionary[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: js.Array[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: stdLib.IterableIterator[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: stdLib.IterableIterator[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
}

