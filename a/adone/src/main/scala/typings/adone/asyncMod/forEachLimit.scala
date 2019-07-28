package typings.adone.asyncMod

import typings.async.asyncMod.AsyncIterator
import typings.async.asyncMod.ErrorCallback
import typings.async.asyncMod.IterableCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "forEachLimit")
@js.native
object forEachLimit extends js.Object {
  def apply[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

