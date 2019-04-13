package typings
package adoneLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "reduceRight")
@js.native
object reduceRight extends js.Object {
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

