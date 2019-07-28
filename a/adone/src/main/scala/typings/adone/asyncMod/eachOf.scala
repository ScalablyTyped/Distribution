package typings.adone.asyncMod

import typings.async.asyncMod.AsyncForEachOfIterator
import typings.async.asyncMod.ErrorCallback
import typings.async.asyncMod.IterableCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "eachOf")
@js.native
object eachOf extends js.Object {
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}

