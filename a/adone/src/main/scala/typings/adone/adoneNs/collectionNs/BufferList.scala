package typings.adone.adoneNs.collectionNs

import typings.adone.adoneNs.collectionNs.INs.BufferListNs.Appendable
import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.node.Buffer
import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Node.js Buffer list collector, reader and streamer with callback/promise interface support
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("adone.collection.BufferList")
@js.native
/**
  * Creates a new buffer list
  */
class BufferList () extends PromiseLike[Buffer] {
  /**
    * Creates a new buffer list and initiates with the given value
    */
  def this(buffer: Appendable) = this()
  /**
    * Creates a new buffer list and subscribes the given callback on the end/error event
    */
  def this(callback: js.Function2[/* err */ js.Any, /* data */ Buffer, Unit]) = this()
  /**
    * Adds an additional buffer or BufferList to the internal list
    */
  def append(buf: Appendable): this.type = js.native
  def `catch`[T](): js.Thenable[T | Buffer] = js.native
  def `catch`[T](onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): js.Thenable[T | Buffer] = js.native
  /**
    * Shifts bytes off the start of the list
    */
  def consume(bytes: Double): this.type = js.native
  /**
    * Copies the content of the list in the dest buffer
    * starting from destStart and containing the bytes within the range specified with srcStart to srcEnd
    *
    * @param dstStart writes from this position
    * @param srcStart reads bytes from this position
    * @param srcEnd  read bytes to this position
    */
  def copy[T /* <: Buffer */](dst: T): T = js.native
  def copy[T /* <: Buffer */](dst: T, dstStart: Double): T = js.native
  def copy[T /* <: Buffer */](dst: T, dstStart: Double, srcStart: Double): T = js.native
  def copy[T /* <: Buffer */](dst: T, dstStart: Double, srcStart: Double, srcEnd: Double): T = js.native
  /**
    * Destroys the stream
    */
  def destroy(): Unit = js.native
  /**
    * Performs a shallow-copy of the list.
    */
  def duplicate(): BufferList = js.native
  /**
    * Ends the stream
    */
  def end(): Unit = js.native
  def end(chunk: String): Unit = js.native
  def end(chunk: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer): Unit = js.native
  /**
    * Returns the byte at the specified index
    */
  def get(idx: Double): Double = js.native
  /**
    * Returns a new BufferList object containing the bytes within the range specified.
    * No copies will be performed. All buffers in the result share memory with the original list.
    *
    * @param start slice from
    * @param end slice to
    */
  def shallowSlice(): BufferList = js.native
  def shallowSlice(start: Double): BufferList = js.native
  def shallowSlice(start: Double, end: Double): BufferList = js.native
  /**
    * Returns a new Buffer object containing the bytes within the range specified.
    */
  def slice(): Buffer = js.native
  def slice(start: Double): Buffer = js.native
  def slice(start: Double, end: Double): Buffer = js.native
  def toString(encoding: Encoding): String = js.native
  def toString(encoding: Encoding, start: Double): String = js.native
  def toString(encoding: Encoding, start: Double, end: Double): String = js.native
}

