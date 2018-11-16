package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "TransformIterator")
@js.native
class TransformIterator[S, T] () extends BufferedIterator[T] {
  def this(source: AsyncIterator[S]) = this()
  def this(source: TransformIteratorOptions[S]) = this()
  def this(source: AsyncIterator[S], options: TransformIteratorOptions[S]) = this()
  def this(source: TransformIteratorOptions[S], options: TransformIteratorOptions[S]) = this()
  var _optional: scala.Boolean = js.native
  var source: AsyncIterator[S] = js.native
  def _closeWhenDone(): scala.Unit = js.native
  def _transform(item: S, done: js.Function1[/* result */ T, scala.Unit]): scala.Unit = js.native
  def _validateSource(source: AsyncIterator[S]): scala.Unit = js.native
  def _validateSource(source: AsyncIterator[S], allowDestination: scala.Boolean): scala.Unit = js.native
}

