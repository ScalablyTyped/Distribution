package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "forEachOfSeries")
@js.native
object forEachOfSeries extends js.Object {
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}

