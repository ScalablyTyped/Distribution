package typings.asynciterator.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "SingletonIterator")
@js.native
class SingletonIterator[T] () extends AsyncIterator[T] {
  def this(item: T) = this()
}

