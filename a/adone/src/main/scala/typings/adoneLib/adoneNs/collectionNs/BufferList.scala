package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Node.js Buffer list collector, reader and streamer with callback/promise interface support
  */
/* RemoveDifficultInheritance: 
- Dropped any */ @JSGlobal("adone.collection.BufferList")
@js.native
/**
  * Creates a new buffer list
  */
class BufferList ()
  extends stdLib.PromiseLike[nodeLib.Buffer] {
  /**
    * Creates a new buffer list and initiates with the given value
    */
  def this(buffer: adoneLib.adoneNs.collectionNs.INs.BufferListNs.Appendable) = this()
  /**
    * Creates a new buffer list and subscribes the given callback on the end/error event
    */
  def this(callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]) = this()
  /**
    * Adds an additional buffer or BufferList to the internal list
    */
  def append(buf: adoneLib.adoneNs.collectionNs.INs.BufferListNs.Appendable): this.type = js.native
  def `catch`[T](): js.Thenable[T | nodeLib.Buffer] = js.native
  def `catch`[T](onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): js.Thenable[T | nodeLib.Buffer] = js.native
  /**
    * Shifts bytes off the start of the list
    */
  def consume(bytes: scala.Double): this.type = js.native
  /**
    * Copies the content of the list in the dest buffer
    * starting from destStart and containing the bytes within the range specified with srcStart to srcEnd
    *
    * @param dstStart writes from this position
    * @param srcStart reads bytes from this position
    * @param srcEnd  read bytes to this position
    */
  def copy[T /* <: nodeLib.Buffer */](dst: T): T = js.native
  def copy[T /* <: nodeLib.Buffer */](dst: T, dstStart: scala.Double): T = js.native
  def copy[T /* <: nodeLib.Buffer */](dst: T, dstStart: scala.Double, srcStart: scala.Double): T = js.native
  def copy[T /* <: nodeLib.Buffer */](dst: T, dstStart: scala.Double, srcStart: scala.Double, srcEnd: scala.Double): T = js.native
  /**
    * Destroys the stream
    */
  def destroy(): scala.Unit = js.native
  /**
    * Performs a shallow-copy of the list.
    */
  def duplicate(): BufferList = js.native
  /**
    * Ends the stream
    */
  def end(): scala.Unit = js.native
  def end(chunk: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Returns the byte at the specified index
    */
  def get(idx: scala.Double): scala.Double = js.native
  /**
    * Returns a new BufferList object containing the bytes within the range specified.
    * No copies will be performed. All buffers in the result share memory with the original list.
    *
    * @param start slice from
    * @param end slice to
    */
  def shallowSlice(): BufferList = js.native
  def shallowSlice(start: scala.Double): BufferList = js.native
  def shallowSlice(start: scala.Double, end: scala.Double): BufferList = js.native
  /**
    * Returns a new Buffer object containing the bytes within the range specified.
    */
  def slice(): nodeLib.Buffer = js.native
  def slice(start: scala.Double): nodeLib.Buffer = js.native
  def slice(start: scala.Double, end: scala.Double): nodeLib.Buffer = js.native
  def toString(encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def toString(encoding: adoneLib.adoneNs.fsNs.INs.Encoding, start: scala.Double): java.lang.String = js.native
  def toString(encoding: adoneLib.adoneNs.fsNs.INs.Encoding, start: scala.Double, end: scala.Double): java.lang.String = js.native
}

