package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "BufferedIterator")
@js.native
class BufferedIterator[T] () extends AsyncIterator[T] {
  def this(options: BufferedIteratorOptions) = this()
  var _buffer: js.Array[T] = js.native
  var _pushedCount: scala.Double = js.native
  var maxBufferSize: scala.Double = js.native
  def _begin(done: js.Function0[scala.Unit]): scala.Unit = js.native
  def _completeClose(): scala.Unit = js.native
  def _fillBuffer(): scala.Unit = js.native
  def _flush(done: js.Function0[scala.Unit]): scala.Unit = js.native
  def _init(autoStart: scala.Boolean): scala.Unit = js.native
  def _push(item: T): scala.Unit = js.native
  def _read(count: scala.Double, done: js.Function0[scala.Unit]): scala.Unit = js.native
}

