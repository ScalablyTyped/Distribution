package typings.async.asyncMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "reduceRight")
@js.native
object reduceRight extends js.Object {
  def apply[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def apply[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
}

