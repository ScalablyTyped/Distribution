package typings.asynciterator.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "BufferedIterator")
@js.native
class BufferedIterator[T] () extends AsyncIterator[T] {
  def this(options: BufferedIteratorOptions) = this()
  var _buffer: js.Array[T] = js.native
  var _pushedCount: Double = js.native
  var maxBufferSize: Double = js.native
  def _begin(done: js.Function0[Unit]): Unit = js.native
  def _completeClose(): Unit = js.native
  def _fillBuffer(): Unit = js.native
  def _flush(done: js.Function0[Unit]): Unit = js.native
  def _init(autoStart: Boolean): Unit = js.native
  def _push(item: T): Unit = js.native
  def _read(count: Double, done: js.Function0[Unit]): Unit = js.native
}

