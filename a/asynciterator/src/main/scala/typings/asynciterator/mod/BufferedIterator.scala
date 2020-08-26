package typings.asynciterator.mod

import typings.asynciterator.anon.MaxBufferSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "BufferedIterator")
@js.native
/**
  Creates a new `BufferedIterator`.
  @param {object} [options] Settings of the iterator
  @param {integer} [options.maxBufferSize=4] The number of items to preload in the internal buffer
  @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
  */
class BufferedIterator[T] () extends AsyncIterator[T] {
  def this(hasMaxBufferSizeAutoStart: MaxBufferSize) = this()
  var _buffer: js.Any = js.native
  var _maxBufferSize: js.Any = js.native
  var _pushedCount: Double = js.native
  var _reading: Boolean = js.native
  /**
    Writes beginning items and opens iterator resources.
    Should never be called before {@link BufferedIterator#_init};
    typically, `_init` is responsible for calling `_begin`.
    @protected
    @param {function} done To be called when initialization is complete
    */
  /* protected */ def _begin(done: js.Function0[Unit]): Unit = js.native
  /**
    Stops the iterator from generating new items,
    switching from `CLOSING` state into `CLOSED` state.
    @protected
    @emits module:asynciterator.AsyncIterator.end
    */
  /* protected */ def _completeClose(): Unit = js.native
  /**
    Fills the internal buffer until `this._maxBufferSize` items are present.
    This method calls {@link BufferedIterator#_read} to fetch items.
    @protected
    @emits module:asynciterator.AsyncIterator.readable
    */
  /* protected */ def _fillBuffer(): Unit = js.native
  /**
    Schedules `_fillBuffer` asynchronously.
    */
  /* protected */ def _fillBufferAsync(): Unit = js.native
  /**
    Writes terminating items and closes iterator resources.
    Should never be called before {@link BufferedIterator#close};
    typically, `close` is responsible for calling `_flush`.
    @protected
    @param {function} done To be called when termination is complete
    */
  /* protected */ def _flush(done: js.Function0[Unit]): Unit = js.native
  /**
    Initializing the iterator by calling {@link BufferedIterator#_begin}
    and changing state from INIT to OPEN.
    @protected
    @param {boolean} autoStart Whether reading of items should immediately start after OPEN.
    */
  /* protected */ def _init(autoStart: Boolean): Unit = js.native
  /**
    Adds an item to the internal buffer.
    @protected
    @param {object} item The item to add
    @emits module:asynciterator.AsyncIterator.readable
    */
  /* protected */ def _push(item: T): Unit = js.native
  /**
    Tries to generate the given number of items.
    Implementers should add `count` items through {@link BufferedIterator#_push}.
    @protected
    @param {integer} count The number of items to generate
    @param {function} done To be called when reading is complete
    */
  /* protected */ def _read(count: Double, done: js.Function0[Unit]): Unit = js.native
  /**
    The maximum number of items to preload in the internal buffer.
    A `BufferedIterator` tries to fill its buffer as far as possible.
    Set to `Infinity` to fully drain the source.
    @type number
    */
  def maxBufferSize: Double = js.native
  def maxBufferSize_=(maxBufferSize: Double): Unit = js.native
}

