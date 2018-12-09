package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents an array of bytes, enhanced Node.js Buffer
     */
@JSGlobal("adone.collection.ByteArray")
@js.native
class ByteArray () extends js.Object {
  /**
           * Constructs a new ByteArray
           *
           * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def this(capacity: scala.Double) = this()
  /**
           * Constructs a new ByteArray
           *
           * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def this(capacity: scala.Double, noAssert: scala.Boolean) = this()
  val buffer: nodeLib.Buffer = js.native
  val noAssert: scala.Boolean = js.native
  val roffset: scala.Double = js.native
  val woffset: scala.Double = js.native
  /**
           * Appends this ByteArray's contents to another ByteArray.
           * This will overwrite any contents behind the specified offset up to the length of this ByteArray's data
           *
           * @param offset Offset to append to
           */
  def appendTo(target: ByteArray): this.type = js.native
  /**
           * Appends this ByteArray's contents to another ByteArray.
           * This will overwrite any contents behind the specified offset up to the length of this ByteArray's data
           *
           * @param offset Offset to append to
           */
  def appendTo(target: ByteArray, offset: scala.Double): this.type = js.native
  /**
           * Enables or disables assertions of argument types and offsets.
           * Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid
           */
  def assert(): this.type = js.native
  /**
           * Enables or disables assertions of argument types and offsets.
           * Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid
           */
  def assert(assert: scala.Boolean): this.type = js.native
  /**
           * Gets the capacity of this ByteArray's backing buffer
           */
  def capacity(): scala.Double = js.native
  /**
           * Clears this ByteArray's offsets by setting offset to 0 and limit to the backing buffer's capacity
           */
  def clear(): this.type = js.native
  /**
           * Creates a cloned instance of this ByteArray,
           * preset with this ByteArray's values for offset, markedOffset and limit
           *
           * @param copy Whether to copy the backing buffer or to return another view on the same, false by default
           */
  def clone(copy: scala.Boolean): ByteArray = js.native
  /**
           * Compacts this ByteArray to be backed by a buffer of its contents' length.
           * Will set offset = 0 and limit = capacity and adapt markedOffset to the same relative position if set
           *
           * @param begin Offset to start at, buffer offset by default
           * @param end Offset to end at, buffer limit by default
           */
  def compact(): this.type = js.native
  /**
           * Compacts this ByteArray to be backed by a buffer of its contents' length.
           * Will set offset = 0 and limit = capacity and adapt markedOffset to the same relative position if set
           *
           * @param begin Offset to start at, buffer offset by default
           * @param end Offset to end at, buffer limit by default
           */
  def compact(begin: scala.Double): this.type = js.native
  /**
           * Compacts this ByteArray to be backed by a buffer of its contents' length.
           * Will set offset = 0 and limit = capacity and adapt markedOffset to the same relative position if set
           *
           * @param begin Offset to start at, buffer offset by default
           * @param end Offset to end at, buffer limit by default
           */
  def compact(begin: scala.Double, end: scala.Double): this.type = js.native
  /**
           * Creates a copy of this ByteArray's contents.
           *
           * @param begin Begin offset, buffer offset by default
           * @param end End offset, buffer limit by default
           */
  def copy(): ByteArray = js.native
  /**
           * Creates a copy of this ByteArray's contents.
           *
           * @param begin Begin offset, buffer offset by default
           * @param end End offset, buffer limit by default
           */
  def copy(begin: scala.Double): ByteArray = js.native
  /**
           * Creates a copy of this ByteArray's contents.
           *
           * @param begin Begin offset, buffer offset by default
           * @param end End offset, buffer limit by default
           */
  def copy(begin: scala.Double, end: scala.Double): ByteArray = js.native
  /**
           * Copies this ByteArray's contents to another ByteArray.
           *
           * @param targetOffset Offset to copy to. Will use and increase the target's offset by the number of bytes copied if omitted
           * @param sourceOffset Offset to start copying from. Will use and increase offset by the number of bytes copied if omitted
           * @param sourceLimit Offset to end copying from, defaults to the buffer limit
           */
  def copyTo(target: ByteArray): this.type | ByteArray = js.native
  /**
           * Copies this ByteArray's contents to another ByteArray.
           *
           * @param targetOffset Offset to copy to. Will use and increase the target's offset by the number of bytes copied if omitted
           * @param sourceOffset Offset to start copying from. Will use and increase offset by the number of bytes copied if omitted
           * @param sourceLimit Offset to end copying from, defaults to the buffer limit
           */
  def copyTo(target: ByteArray, targetOffset: scala.Double): this.type | ByteArray = js.native
  /**
           * Copies this ByteArray's contents to another ByteArray.
           *
           * @param targetOffset Offset to copy to. Will use and increase the target's offset by the number of bytes copied if omitted
           * @param sourceOffset Offset to start copying from. Will use and increase offset by the number of bytes copied if omitted
           * @param sourceLimit Offset to end copying from, defaults to the buffer limit
           */
  def copyTo(target: ByteArray, targetOffset: scala.Double, souceOffset: scala.Double): this.type | ByteArray = js.native
  /**
           * Copies this ByteArray's contents to another ByteArray.
           *
           * @param targetOffset Offset to copy to. Will use and increase the target's offset by the number of bytes copied if omitted
           * @param sourceOffset Offset to start copying from. Will use and increase offset by the number of bytes copied if omitted
           * @param sourceLimit Offset to end copying from, defaults to the buffer limit
           */
  def copyTo(
    target: ByteArray,
    targetOffset: scala.Double,
    souceOffset: scala.Double,
    sourceLimit: scala.Double
  ): this.type | ByteArray = js.native
  /**
           * Makes sure that this ByteArray is backed by a ByteArray#buffer of at least the specified capacity.
           * If the current capacity is exceeded, it will be doubled.
           * If double the current capacity is less than the required capacity, the required capacity will be used instead
           */
  def ensureCapacity(capacity: scala.Double): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: java.lang.String): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: java.lang.String, begin: scala.Double): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: java.lang.String, begin: scala.Double, end: scala.Double): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: scala.Double): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: scala.Double, begin: scala.Double): this.type = js.native
  /**
           * Overwrites this ByteArray's contents with the specified value.
           *
           * @param value Byte value to fill with. If given as a string, the first character is used
           * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
           * @param end End offset, defaults to limit.
           */
  def fill(value: scala.Double, begin: scala.Double, end: scala.Double): this.type = js.native
  /**
           * Makes this ByteArray ready for a new sequence of write or relative read operations.
           * Sets limit = offset and offset = 0.
           * Make sure always to flip a ByteArray when all relative read or write operations are complete
           */
  def flip(): this.type = js.native
  /**
           * Marks an offset on this ByteArray to be used later
           *
           * @param offset Offset to mark. Defaults to offset.
           */
  def mark(): this.type = js.native
  /**
           * Marks an offset on this ByteArray to be used later
           *
           * @param offset Offset to mark. Defaults to offset.
           */
  def mark(offset: scala.Double): this.type = js.native
  /**
           * Prepends some data to this ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param source Data to prepend
           * @param encoding Encoding if data is a string
           * @param offset Offset to prepend at. Will use and decrease offset by the number of bytes prepended if omitted.
           */
  def prepend(source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): this.type = js.native
  /**
           * Prepends some data to this ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param source Data to prepend
           * @param encoding Encoding if data is a string
           * @param offset Offset to prepend at. Will use and decrease offset by the number of bytes prepended if omitted.
           */
  def prepend(source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, encoding: java.lang.String): this.type = js.native
  /**
           * Prepends some data to this ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param source Data to prepend
           * @param encoding Encoding if data is a string
           * @param offset Offset to prepend at. Will use and decrease offset by the number of bytes prepended if omitted.
           */
  def prepend(
    source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable,
    encoding: java.lang.String,
    offset: scala.Double
  ): this.type = js.native
  /**
           * Prepends some data to this ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param source Data to prepend
           * @param offset Offset to prepend at. Will use and decrease offset by the number of bytes prepended if omitted.
           */
  def prepend(source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, offset: scala.Double): this.type = js.native
  /**
           * Prepends this ByteArray to another ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param offset Offset to prepend at
           */
  def prependTo(target: ByteArray): this.type = js.native
  /**
           * Prepends this ByteArray to another ByteArray.
           * This will overwrite any contents before the specified offset up to the prepended data's length.
           * If there is not enough space available before the specified offset,
           * the backing buffer will be resized and its contents moved accordingly
           *
           * @param offset Offset to prepend at
           */
  def prependTo(target: ByteArray, offset: scala.Double): this.type = js.native
  /**
           * Reads the specified number of bytes.
           *
           * @param length Number of bytes to read
           * @param offset Offset to read from. Will use and increase offset by length if omitted.
           */
  def read(length: scala.Double): ByteArray = js.native
  /**
           * Reads the specified number of bytes.
           *
           * @param length Number of bytes to read
           * @param offset Offset to read from. Will use and increase offset by length if omitted.
           */
  def read(length: scala.Double, offset: scala.Double): ByteArray = js.native
  /**
           * Reads a BitSet as an array of booleans.
           *
           * @param offset Offset to read from. Will use and increase offset by length if omitted.
           */
  def readBitSet(): js.Array[scala.Boolean] = js.native
  /**
           * Reads a BitSet as an array of booleans.
           *
           * @param offset Offset to read from. Will use and increase offset by length if omitted.
           */
  def readBitSet(offset: scala.Double): js.Array[scala.Boolean] = js.native
  /**
           * Reads a NULL-terminated UTF8 encoded string.
           * For this to work the string read must not contain any NULL characters itself
           */
  def readCString(): java.lang.String = js.native
  /**
           * Reads a NULL-terminated UTF8 encoded string.
           * For this to work the string read must not contain any NULL characters itself
           *
           * @param offset Offset to read from
           */
  def readCString(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
           * Reads a 64bit be float
           *
           * @param offset Offset to read from
           */
  def readDoubleBE(): scala.Double = js.native
  /**
           * Reads a 64bit be float
           *
           * @param offset Offset to read from
           */
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 64bit le float
           *
           * @param offset Offset to read from
           */
  def readDoubleLE(): scala.Double = js.native
  /**
           * Reads a 64bit le float
           *
           * @param offset Offset to read from
           */
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit be float
           *
           * @param offset Offset to read from
           */
  def readFloatBE(): scala.Double = js.native
  /**
           * Reads a 32bit be float
           *
           * @param offset Offset to read from
           */
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit le float
           *
           * @param offset Offset to read from
           */
  def readFloatLE(): scala.Double = js.native
  /**
           * Reads a 32bit le float
           *
           * @param offset Offset to read from
           */
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 16bit signed be integer
           *
           * @param offset Offset to read from
           */
  def readInt16BE(): scala.Double = js.native
  /**
           * Reads a 16bit signed be integer
           *
           * @param offset Offset to read from
           */
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 16bit signed le integer
           *
           * @param offset Offset to read from
           */
  def readInt16LE(): scala.Double = js.native
  /**
           * Reads a 16bit signed le integer
           *
           * @param offset Offset to read from
           */
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit signed be integer
           *
           * @param offset Offset to read from
           */
  def readInt32BE(): scala.Double = js.native
  /**
           * Reads a 32bit signed be integer
           *
           * @param offset Offset to read from
           */
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit signed le integer
           *
           * @param offset Offset to read from
           */
  def readInt32LE(): scala.Double = js.native
  /**
           * Reads a 32bit signed le integer
           *
           * @param offset Offset to read from
           */
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 64bit signed be integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readInt64BE(): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit signed be integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readInt64BE(offset: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit signed le integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readInt64LE(): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit signed le integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readInt64LE(offset: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads an 8bit signed integer
           *
           * @param offset Offset to read from
           */
  def readInt8(): scala.Double = js.native
  /**
           * Reads an 8bit signed integer
           *
           * @param offset Offset to read from
           */
  def readInt8(offset: scala.Double): scala.Double = js.native
  /**
           * Reads an UTF8 encoded string
           *
           * @param length Number of characters or bytes to read
           * @param metrics Metrics specifying what n is meant to count. Defaults to ByteArray.METRICS_CHARS("c")
           */
  def readString(length: scala.Double): java.lang.String = js.native
  /**
           * Reads an UTF8 encoded string
           *
           * @param length Number of characters or bytes to read
           * @param metrics Metrics specifying what n is meant to count. Defaults to ByteArray.METRICS_CHARS("c")
           */
  def readString(length: scala.Double, metrics: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Metrics): java.lang.String = js.native
  /**
           * Reads an UTF8 encoded string
           *
           * @param length Number of characters or bytes to read
           * @param metrics Metrics specifying what n is meant to count. Defaults to ByteArray.METRICS_CHARS("c")
           * @param offset Offset to read from
           */
  def readString(
    length: scala.Double,
    metrics: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Metrics,
    offset: scala.Double
  ): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
           * Reads an UTF8 encoded string
           *
           * @param length Number of characters or bytes to read
           * @param offset Offset to read from
           */
  def readString(length: scala.Double, offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
           * Reads a 16bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt16BE(): scala.Double = js.native
  /**
           * Reads a 16bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 16bit unsigned le integer
           *
           * @param offset Offset to read from
           */
  def readUInt16LE(): scala.Double = js.native
  /**
           * Reads a 16bit unsigned le integer
           *
           * @param offset Offset to read from
           */
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 24bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt24BE(): scala.Double = js.native
  /**
           * Reads a 24bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt24BE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt32BE(): scala.Double = js.native
  /**
           * Reads a 32bit unsigned be integer
           *
           * @param offset Offset to read from
           */
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 32bit unsigned le integer
           *
           * @param offset Offset to read from
           */
  def readUInt32LE(): scala.Double = js.native
  /**
           * Reads a 32bit unsigned le integer
           *
           * @param offset Offset to read from
           */
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a 64bit unsigned be integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readUInt64BE(): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit unsigned be integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readUInt64BE(offset: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit unsigned le integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readUInt64LE(): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a 64bit unsigned le integer as math.Long
           *
           * @param offset Offset to read from
           */
  def readUInt64LE(offset: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads an 8bit unsigned integer
           *
           * @param offset Offset to read from
           */
  def readUInt8(): scala.Double = js.native
  /**
           * Reads an 8bit unsigned integer
           *
           * @param offset Offset to read from
           */
  def readUInt8(offset: scala.Double): scala.Double = js.native
  /**
           * Reads a length as varint32 prefixed UTF8 encoded string
           */
  def readVString(): java.lang.String = js.native
  /**
           * Reads a length as varint32 prefixed UTF8 encoded string
           *
           * @param offset Offset to read from
           */
  def readVString(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
           * Reads a 32bit base 128 variable-length integer
           */
  def readVarint32(): scala.Double = js.native
  /**
           * Reads a 32bit base 128 variable-length integer
           *
           * @param offset Offset to read from
           */
  def readVarint32(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Varint32 = js.native
  /**
           * Reads a zig-zag encoded 32bit base 128 variable-length integer
           */
  def readVarint32ZigZag(): scala.Double = js.native
  /**
           * Reads a zig-zag encoded 32bit base 128 variable-length integer
           *
           * @param offset Offset to read from
           */
  def readVarint32ZigZag(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Varint32 = js.native
  /**
           * Reads a 64bit base 128 variable-length integer
           */
  def readVarint64(): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Reads a 64bit base 128 variable-length integer
           *
           * @param offset Offset to read from
           */
  def readVarint64(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Varint64 = js.native
  /**
           * Reads a zig-zag encoded 64bit base 128 variable-length integer
           */
  def readVarint64ZigZag(): adoneLib.adoneNs.mathNs.Long = js.native
  /**
           * Reads a zig-zag encoded 64bit base 128 variable-length integer
           *
           * @param offset Offset to read from
           */
  def readVarint64ZigZag(offset: scala.Double): adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Varint64 = js.native
  /**
           * Gets the number of remaining readable bytes
           */
  def remaining(): scala.Double = js.native
  /**
           * Resets this ByteArray's offset.
           * If an offset has been marked through mark before, offset will be set to markedOffset, which will then be discarded.
           * If no offset has been marked, sets offset = 0
           */
  def reset(): this.type = js.native
  /**
           * Resizes this ByteArray to be backed by a buffer of at least the given capacity.
           * Will do nothing if already that large or larger.
           *
           * @param capacity	Capacity required
           */
  def resize(capacity: scala.Double): this.type = js.native
  /**
           * Reverses this ByteArray's contents.
           *
           * @param begin Offset to start at, defaults to offset
           * @param end Offset to end at, defaults to limit
           */
  def reverse(): this.type = js.native
  /**
           * Reverses this ByteArray's contents.
           *
           * @param begin Offset to start at, defaults to offset
           * @param end Offset to end at, defaults to limit
           */
  def reverse(begin: scala.Double): this.type = js.native
  /**
           * Reverses this ByteArray's contents.
           *
           * @param begin Offset to start at, defaults to offset
           * @param end Offset to end at, defaults to limit
           */
  def reverse(begin: scala.Double, end: scala.Double): this.type = js.native
  /**
           * Skips the next length bytes. This will just advance
           */
  def skip(length: scala.Double): this.type = js.native
  /**
           * Slices this ByteArray by creating a cloned instance with offset = begin and limit = end
           *
           * @param begin Begin offset, defaults to offset
           * @param end End offset, defaults to limit
           */
  def slice(): ByteArray = js.native
  /**
           * Slices this ByteArray by creating a cloned instance with offset = begin and limit = end
           *
           * @param begin Begin offset, defaults to offset
           * @param end End offset, defaults to limit
           */
  def slice(begin: scala.Double): ByteArray = js.native
  /**
           * Slices this ByteArray by creating a cloned instance with offset = begin and limit = end
           *
           * @param begin Begin offset, defaults to offset
           * @param end End offset, defaults to limit
           */
  def slice(begin: scala.Double, end: scala.Double): ByteArray = js.native
  /**
           * Returns a raw buffer compacted to contain this ByteArray's contents
           */
  def toArrayBuffer(): stdLib.ArrayBuffer = js.native
  /**
           * Encodes this ByteArray's contents to a base64 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBase64(): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to a base64 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBase64(begin: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to a base64 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBase64(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray to a binary encoded string, that is using only characters 0x00-0xFF as bytes
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBinary(): java.lang.String = js.native
  /**
           * Encodes this ByteArray to a binary encoded string, that is using only characters 0x00-0xFF as bytes
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBinary(begin: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray to a binary encoded string, that is using only characters 0x00-0xFF as bytes
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBinary(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
           * Returns a copy of the backing buffer that contains this ByteArray's contents.
           *
           * @param forceCopy If true returns a copy, otherwise returns a view referencing the same memory if possible, false by default
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
           * Returns a copy of the backing buffer that contains this ByteArray's contents.
           *
           * @param forceCopy If true returns a copy, otherwise returns a view referencing the same memory if possible, false by default
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBuffer(forceCopy: scala.Boolean): nodeLib.Buffer = js.native
  /**
           * Returns a copy of the backing buffer that contains this ByteArray's contents.
           *
           * @param forceCopy If true returns a copy, otherwise returns a view referencing the same memory if possible, false by default
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBuffer(forceCopy: scala.Boolean, begin: scala.Double): nodeLib.Buffer = js.native
  /**
           * Returns a copy of the backing buffer that contains this ByteArray's contents.
           *
           * @param forceCopy If true returns a copy, otherwise returns a view referencing the same memory if possible, false by default
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toBuffer(forceCopy: scala.Boolean, begin: scala.Double, end: scala.Double): nodeLib.Buffer = js.native
  /**
           * Encodes this ByteArray to a hex encoded string with marked offsets
           *
           * @param columns If true returns two columns hex + ascii, defaults to false
           */
  def toDebug(): java.lang.String = js.native
  /**
           * Encodes this ByteArray to a hex encoded string with marked offsets
           *
           * @param columns If true returns two columns hex + ascii, defaults to false
           */
  def toDebug(columns: scala.Boolean): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to a hex encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toHex(): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to a hex encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toHex(begin: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to a hex encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toHex(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
           * Converts the ByteArray's contents to a string
           *
           * @param encoding Output encoding
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toString(encoding: java.lang.String): java.lang.String = js.native
  /**
           * Converts the ByteArray's contents to a string
           *
           * @param encoding Output encoding
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toString(encoding: java.lang.String, begin: scala.Double): java.lang.String = js.native
  /**
           * Converts the ByteArray's contents to a string
           *
           * @param encoding Output encoding
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toString(encoding: java.lang.String, begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to an UTF8 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toUTF8(): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to an UTF8 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toUTF8(begin: scala.Double): java.lang.String = js.native
  /**
           * Encodes this ByteArray's contents to an UTF8 encoded string
           *
           * @param begin Begin offset, offset by default
           * @param end End offset, limit by default
           */
  def toUTF8(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
           * Appends some data to this ByteArray.
           * This will overwrite any contents behind the specified offset up to the appended data's length.
           *
           * @param source The source write from
           * @param offset Offset to write at
           * @param length length to read from the source
           * @param encoding encoding to use for wrapping the source in bytearray
           */
  def write(source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): this.type = js.native
  /**
           * Appends some data to this ByteArray.
           * This will overwrite any contents behind the specified offset up to the appended data's length.
           *
           * @param source The source write from
           * @param offset Offset to write at
           * @param length length to read from the source
           * @param encoding encoding to use for wrapping the source in bytearray
           */
  def write(source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, offset: scala.Double): this.type = js.native
  /**
           * Appends some data to this ByteArray.
           * This will overwrite any contents behind the specified offset up to the appended data's length.
           *
           * @param source The source write from
           * @param offset Offset to write at
           * @param length length to read from the source
           * @param encoding encoding to use for wrapping the source in bytearray
           */
  def write(
    source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable,
    offset: scala.Double,
    length: scala.Double
  ): this.type = js.native
  /**
           * Appends some data to this ByteArray.
           * This will overwrite any contents behind the specified offset up to the appended data's length.
           *
           * @param source The source write from
           * @param offset Offset to write at
           * @param length length to read from the source
           * @param encoding encoding to use for wrapping the source in bytearray
           */
  def write(
    source: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable,
    offset: scala.Double,
    length: scala.Double,
    encoding: java.lang.String
  ): this.type = js.native
  /**
           * Writes the array as a bitset.
           * @param value Array of booleans to write
           */
  def writeBitSet(value: js.Array[scala.Double]): this.type = js.native
  /**
           * Writes the array as a bitset.
           * @param value Array of booleans to write
           * @param offset Offset to write at
           */
  def writeBitSet(value: js.Array[scala.Double], offset: scala.Double): scala.Double = js.native
  /**
           * Writes a buffer at the given offset
           * @param buf Buffer to write
           * @param offset Offset to write at
           */
  def writeBuffer(buf: nodeLib.Buffer): this.type = js.native
  /**
           * Writes a buffer at the given offset
           * @param buf Buffer to write
           * @param offset Offset to write at
           */
  def writeBuffer(buf: nodeLib.Buffer, offset: scala.Double): this.type = js.native
  /**
           * Writes a NULL-terminated UTF8 encoded string.
           * For this to work the specified string must not contain any NULL characters itself
           */
  def writeCString(str: java.lang.String): this.type = js.native
  /**
           * Writes a NULL-terminated UTF8 encoded string.
           * For this to work the specified string must not contain any NULL characters itself
           *
           * @param offset Offset to write at
           */
  def writeCString(str: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 64bit be float
           *
           * @param offset Offset to write at
           */
  def writeDoubleBE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit be float
           *
           * @param offset Offset to write at
           */
  def writeDoubleBE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit le float
           *
           * @param offset Offset to write at
           */
  def writeDoubleLE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit le float
           *
           * @param offset Offset to write at
           */
  def writeDoubleLE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit be float
           *
           * @param offset Offset to write at
           */
  def writeFloatBE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit be float
           *
           * @param offset Offset to write at
           */
  def writeFloatBE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit le float
           *
           * @param offset Offset to write at
           */
  def writeFloatLE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit le float
           *
           * @param offset Offset to write at
           */
  def writeFloatLE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 16bit signed be integer
           *
           * @param offset Offset to write at
           */
  def writeInt16BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 16bit signed be integer
           *
           * @param offset Offset to write at
           */
  def writeInt16BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 16bit signed le integer
           *
           * @param offset Offset to write at
           */
  def writeInt16LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 16bit signed le integer
           *
           * @param offset Offset to write at
           */
  def writeInt16LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit signed be integer
           *
           * @param offset Offset to write at
           */
  def writeInt32BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit signed be integer
           *
           * @param offset Offset to write at
           */
  def writeInt32BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit signed le integer
           *
           * @param offset Offset to write at
           */
  def writeInt32LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit signed le integer
           *
           * @param offset Offset to write at
           */
  def writeInt32LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: java.lang.String): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: java.lang.String, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed be long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: java.lang.String): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: java.lang.String, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit signed le long integer
           *
           * @param offset Offset to write at
           */
  def writeInt64LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes an 8bit signed integer
           *
           * @param offset Offset to write at
           */
  def writeInt8(value: scala.Double): this.type = js.native
  /**
           * Writes an 8bit signed integer
           *
           * @param offset Offset to write at
           */
  def writeInt8(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes an UTF8 encoded string
           */
  def writeString(str: java.lang.String): this.type = js.native
  /**
           * Writes an UTF8 encoded string
           *
           * @param offset Offset to write at
           */
  def writeString(str: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 16bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt16BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 16bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt16BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 16bit unsigned le integer
           *
           * @param offset Offset to write at
           */
  def writeUInt16LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 16bit unsigned le integer
           *
           * @param offset Offset to write at
           */
  def writeUInt16LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 24bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt24BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 24bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt24BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt32BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit unsigned be integer
           *
           * @param offset Offset to write at
           */
  def writeUInt32BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 32bit unsigned le integer
           *
           * @param offset Offset to write at
           */
  def writeUInt32LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit unsigned le integer
           *
           * @param offset Offset to write at
           */
  def writeUInt32LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: java.lang.String): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: java.lang.String, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned be long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: java.lang.String): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: java.lang.String, offset: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit unsigned le long integer
           *
           * @param offset Offset to write at
           */
  def writeUInt64LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes an 8bit unsigned integer
           *
           * @param offset Offset to write at
           */
  def writeUInt8(value: scala.Double): this.type = js.native
  /**
           * Writes an 8bit unsigned integer
           *
           * @param offset Offset to write at
           */
  def writeUInt8(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
           * Writes a length as varint32 prefixed UTF8 encoded string
           */
  def writeVString(str: java.lang.String): this.type = js.native
  /**
           * Writes a length as varint32 prefixed UTF8 encoded string
           *
           * @param offset Offset to read from
           */
  def writeVString(str: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 32bit base 128 variable-length integer
           */
  def writeVarint32(value: scala.Double): this.type = js.native
  /**
           * Writes a 32bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint32(value: scala.Double, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a zig-zag encoded 32bit base 128 variable-length integer
           */
  def writeVarint32ZigZag(value: scala.Double): this.type = js.native
  /**
           * Writes a zig-zag encoded 32bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint32ZigZag(value: scala.Double, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           */
  def writeVarint64(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           */
  def writeVarint64(value: java.lang.String): this.type = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64(value: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           */
  def writeVarint64(value: scala.Double): this.type = js.native
  /**
           * Writes a 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64(value: scala.Double, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           */
  def writeVarint64ZigZag(value: adoneLib.adoneNs.mathNs.Long): this.type = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64ZigZag(value: adoneLib.adoneNs.mathNs.Long, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           */
  def writeVarint64ZigZag(value: java.lang.String): this.type = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64ZigZag(value: java.lang.String, offset: scala.Double): scala.Double = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           */
  def writeVarint64ZigZag(value: scala.Double): this.type = js.native
  /**
           * Writes a zig-zag encoded 64bit base 128 variable-length integer
           *
           * @param offset Offset to write at
           */
  def writeVarint64ZigZag(value: scala.Double, offset: scala.Double): scala.Double = js.native
}

/**
     * Represents an array of bytes, enhanced Node.js Buffer
     */
@JSGlobal("adone.collection.ByteArray")
@js.native
object ByteArray extends js.Object {
  /**
           * Default initial capacity
           */
  var DEFAULT_CAPACITY: scala.Double = js.native
  /**
           * Default no assertions flag
           */
  var DEFAULT_NOASSERT: scala.Boolean = js.native
  /**
           * Maximum number of bytes required to store a 32bit base 128 variable-length integer
           */
  var MAX_VARINT32_BYTES: scala.Double = js.native
  /**
           * Maximum number of bytes required to store a 64bit base 128 variable-length integer
           */
  var MAX_VARINT64_BYTES: scala.Double = js.native
  /**
           * Metrics representing number of bytes. Evaluates to `b`.
           */
  var METRICS_BYTES: java.lang.String = js.native
  /**
           * Metrics representing number of UTF8 characters. Evaluates to `c`.
           */
  var METRICS_CHARS: java.lang.String = js.native
  def accessor(): adoneLib.Anon_IsEncoding = js.native
  /**
           * Allocates a new ByteArray backed by a buffer of the specified capacity.
           *
           * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def allocate(): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Allocates a new ByteArray backed by a buffer of the specified capacity.
           *
           * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def allocate(capacity: scala.Double): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Allocates a new ByteArray backed by a buffer of the specified capacity.
           *
           * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def allocate(capacity: scala.Double, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a base64 encoded string to binary like window.atob does
           */
  def atob(b64: java.lang.String): java.lang.String = js.native
  /**
           * Encodes a binary string to base64 like window.btoa does
           */
  def btoa(str: java.lang.String): java.lang.String = js.native
  /**
           *  Calculates the number of UTF8 bytes of a string.
           */
  def calculateString(str: java.lang.String): scala.Double = js.native
  /**
           * Calculates the number of UTF8 characters of a string.
           * JavaScript itself uses UTF-16,
           * so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF
           */
  def calculateUTF8Chars(str: java.lang.String): scala.Double = js.native
  /**
           * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer
           */
  def calculateVarint32(value: scala.Double): scala.Double = js.native
  /**
           * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer
           */
  def calculateVarint64(value: java.lang.String): scala.Double = js.native
  /**
           * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer
           */
  def calculateVarint64(value: scala.Double): scala.Double = js.native
  /**
           * Concatenates multiple ByteArrays into one
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def concat(buffers: js.Array[adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable]): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Concatenates multiple ByteArrays into one
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def concat(
    buffers: js.Array[adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable],
    encoding: java.lang.String
  ): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Concatenates multiple ByteArrays into one
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def concat(
    buffers: js.Array[adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable],
    encoding: java.lang.String,
    noAssert: scala.Boolean
  ): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a base64 encoded string to a ByteArray
           */
  def fromBase64(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteArray
           */
  def fromBinary(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a hex encoded string with marked offsets to a ByteArray
           */
  def fromDebug(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a hex encoded string with marked offsets to a ByteArray
           */
  def fromDebug(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a hex encoded string to a ByteArray
           */
  def fromHex(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a hex encoded string to a ByteArray
           */
  def fromHex(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes an UTF8 encoded string to a ByteArray
           */
  def fromUTF8(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes an UTF8 encoded string to a ByteArray
           */
  def fromUTF8(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def `type`(): adoneLib.Anon_IsEncoding = js.native
  /**
           * Wraps a buffer or a string.
           * Sets the allocated ByteArray's offset to 0 and its limit to the length of the wrapped data
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def wrap(buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Wraps a buffer or a string.
           * Sets the allocated ByteArray's offset to 0 and its limit to the length of the wrapped data
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def wrap(buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, encoding: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Wraps a buffer or a string.
           * Sets the allocated ByteArray's offset to 0 and its limit to the length of the wrapped data
           *
           * @param encoding Encoding for strings
           * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
           */
  def wrap(
    buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable,
    encoding: java.lang.String,
    noAssert: scala.Boolean
  ): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
           * Decodes a zigzag encoded signed 32bit integer
           */
  def zigZagDecode32(n: scala.Double): scala.Double = js.native
  /**
           * Decodes a zigzag encoded signed 64bit integer.
           */
  def zigZagDecode64(value: adoneLib.adoneNs.collectionNs.INs.Long): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Decodes a zigzag encoded signed 64bit integer.
           */
  def zigZagDecode64(value: java.lang.String): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Decodes a zigzag encoded signed 64bit integer.
           */
  def zigZagDecode64(value: scala.Double): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding
           */
  def zigZagEncode32(n: scala.Double): scala.Double = js.native
  /**
           * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
           */
  def zigZagEncode64(value: adoneLib.adoneNs.collectionNs.INs.Long): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
           */
  def zigZagEncode64(value: java.lang.String): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
           * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
           */
  def zigZagEncode64(value: scala.Double): adoneLib.adoneNs.collectionNs.INs.Long = js.native
}

