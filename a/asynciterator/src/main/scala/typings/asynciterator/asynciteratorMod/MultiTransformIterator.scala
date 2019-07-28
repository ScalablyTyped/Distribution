package typings.asynciterator.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "MultiTransformIterator")
@js.native
class MultiTransformIterator[S, T] () extends TransformIterator[S, T] {
  def this(source: AsyncIterator[S]) = this()
  def this(source: TransformIteratorOptions[S]) = this()
  def this(source: AsyncIterator[S], options: TransformIteratorOptions[S]) = this()
  def this(source: TransformIteratorOptions[S], options: TransformIteratorOptions[S]) = this()
  var _transformerQueue: js.Array[S] = js.native
  def _createTransformer(element: S): AsyncIterator[T] = js.native
}

