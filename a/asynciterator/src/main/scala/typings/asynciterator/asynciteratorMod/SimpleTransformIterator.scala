package typings.asynciterator.asynciteratorMod

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
  var _filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.native
  var _limit: Double = js.native
  var _map: js.UndefOr[js.Function1[/* item */ S, T]] = js.native
  var _offset: Double = js.native
  var _prepender: js.UndefOr[ArrayIterator[T]] = js.native
  def _insert(inserter: AsyncIterator[S], done: js.Function0[Unit]): Unit = js.native
}

