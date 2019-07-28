package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "concatSeries")
@js.native
object concatSeries extends js.Object {
  def apply[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  def apply[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
}

