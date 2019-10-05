package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "mapLimit")
@js.native
object mapLimit extends js.Object {
  def apply[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def apply[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
}

