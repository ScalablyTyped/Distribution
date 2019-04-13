package typings
package adoneLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "eachOfSeries")
@js.native
object eachOfSeries extends js.Object {
  def apply[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
}

