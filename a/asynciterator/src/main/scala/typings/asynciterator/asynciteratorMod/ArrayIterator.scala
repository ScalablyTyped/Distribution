package typings.asynciterator.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "ArrayIterator")
@js.native
class ArrayIterator[T] () extends AsyncIterator[T] {
  def this(items: js.Array[T]) = this()
}

