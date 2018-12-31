package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrMemo extends js.Object {
  def apply[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
}

