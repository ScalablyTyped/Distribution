package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ObjLimit extends js.Object {
  def apply[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
}

