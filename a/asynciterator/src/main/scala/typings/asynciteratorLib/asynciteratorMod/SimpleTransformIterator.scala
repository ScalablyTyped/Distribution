package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "SimpleTransformIterator")
@js.native
class SimpleTransformIterator[S, T] () extends TransformIterator[S, T] {
  def this(source: AsyncIterator[S]) = this()
  def this(source: SimpleTransformIteratorOptions[S, T]) = this()
  def this(source: AsyncIterator[S], options: SimpleTransformIteratorOptions[S, T]) = this()
  def this(source: SimpleTransformIteratorOptions[S, T], options: SimpleTransformIteratorOptions[S, T]) = this()
  var _appender: js.UndefOr[ArrayIterator[T]] = js.native
  var _filter: js.UndefOr[js.Function1[/* item */ S, scala.Boolean]] = js.native
  var _limit: scala.Double = js.native
  var _map: js.UndefOr[js.Function1[/* item */ S, T]] = js.native
  var _offset: scala.Double = js.native
  var _prepender: js.UndefOr[ArrayIterator[T]] = js.native
  def _insert(inserter: AsyncIterator[S], done: js.Function0[scala.Unit]): scala.Unit = js.native
}

