package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "union")
@js.native
object union extends js.Object {
  def apply[T](sources: AsyncIteratorOrArray[AsyncIterator[T]]): UnionIterator[T] = js.native
}

