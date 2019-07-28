package typings.async.asyncMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "mapSeries")
@js.native
object mapSeries extends js.Object {
  def apply[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  def apply[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def apply[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
}

