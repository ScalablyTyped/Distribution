package typings.adone.asyncMod

import typings.async.asyncMod.AsyncBooleanIterator
import typings.async.asyncMod.AsyncBooleanResultCallback
import typings.async.asyncMod.IterableCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "anyLimit")
@js.native
object anyLimit extends js.Object {
  def apply[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
}

