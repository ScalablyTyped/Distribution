package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "ClonedIterator")
@js.native
class ClonedIterator[T] () extends TransformIterator[T, T] {
  def this(source: AsyncIterator[T]) = this()
  var _readPosition: scala.Double = js.native
}

