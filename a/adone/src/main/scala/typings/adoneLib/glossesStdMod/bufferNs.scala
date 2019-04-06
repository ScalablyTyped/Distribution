package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "buffer")
@js.native
object bufferNs extends js.Object {
  @js.native
  class Buffer protected ()
    extends nodeLib.bufferMod.Buffer {
    def this(arrayBuffer: nodeLib.SharedArrayBuffer) = this()
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: stdLib.ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: stdLib.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: nodeLib.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: scala.Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: java.lang.String) = this()
  }
  
  @js.native
  class BufferCls protected ()
    extends nodeLib.Buffer {
    def this(arrayBuffer: nodeLib.SharedArrayBuffer) = this()
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: stdLib.ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: stdLib.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: nodeLib.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: scala.Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: java.lang.String) = this()
  }
  
  @js.native
  class SlowBuffer protected ()
    extends nodeLib.bufferMod.SlowBuffer {
    /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
    def this(size: scala.Double) = this()
  }
  
  @js.native
  class SlowBufferCls protected ()
    extends nodeLib.Buffer {
    /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
    def this(size: scala.Double) = this()
  }
  
  val Buffer: nodeLib.Anon_Alloc = js.native
  val INSPECT_MAX_BYTES: scala.Double = js.native
  val SlowBuffer: nodeLib.Anon_Size = js.native
  def transcode(
    source: nodeLib.Buffer,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
  def transcode(
    source: stdLib.Uint8Array,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
}

