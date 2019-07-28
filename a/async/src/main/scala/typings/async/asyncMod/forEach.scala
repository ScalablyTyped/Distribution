package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "forEach")
@js.native
object forEach extends js.Object {
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}

