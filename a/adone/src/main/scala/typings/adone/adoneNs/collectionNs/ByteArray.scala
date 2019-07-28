package typings.adone.adoneNs.collectionNs

import typings.adone.TypeofClassBufferAlloc
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Metrics
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Varint32
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Varint64
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.adone.adoneNs.mathNs.Long
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an array of bytes, enhanced Node.js Buffer
  */
@JSGlobal("adone.collection.ByteArray")
@js.native
/**
  * Constructs a new ByteArray
  *
  * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
  * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
  */
class ByteArray () extends js.Object {
  def this(capacity: Double) = this()
  def this(capacity: Double, noAssert: Boolean) = this()
  val buffer: Buffer = js.native
  val noAssert: Boolean = js.native
  val roffset: Double = js.native
  val woffset: Double = js.native
  /**
    * Appends this ByteArray's contents to another ByteArray.
    * This will overwrite any contents behind the specified offset up to the length of this ByteArray's data
    *
    * @param offset Offset to append to
    */
  def appendTo(target: ByteArray): this.type = js.native
  def appendTo(target: ByteArray, offset: Double): this.type = js.native
  /**
    * Enables or disables assertions of argument types and offsets.
    * Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid
    */
  def assert(): this.type = js.native
  def assert(assert: Boolean): this.type = js.native
  /**
    * Gets the capacity of this ByteArray's backing buffer
    */
  def capacity(): Double = js.native
  /**
    * Clears this ByteArray's offsets by setting offset to 0 and limit to the backing buffer's capacity
    */
  def clear(): this.type = js.native
  def clone(copy: Boolean): ByteArray = js.native
  /**
    * Compacts this ByteArray to be backed by a buffer of its contents' length.
    * Will set offset = 0 and limit = capacity and adapt markedOffset to the same relative position if set
    *
    * @param begin Offset to start at, buffer offset by default
    * @param end Offset to end at, buffer limit by default
    */
  def compact(): this.type = js.native
  def compact(begin: Double): this.type = js.native
  def compact(begin: Double, end: Double): this.type = js.native
  /**
    * Creates a copy of this ByteArray's contents.
    *
    * @param begin Begin offset, buffer offset by default
    * @param end End offset, buffer limit by default
    */
  def copy(): ByteArray = js.native
  def copy(begin: Double): ByteArray = js.native
  def copy(begin: Double, end: Double): ByteArray = js.native
  /**
    * Copies this ByteArray's contents to another ByteArray.
    *
    * @param targetOffset Offset to copy to. Will use and increase the target's offset by the number of bytes copied if omitted
    * @param sourceOffset Offset to start copying from. Will use and increase offset by the number of bytes copied if omitted
    * @param sourceLimit Offset to end copying from, defaults to the buffer limit
    */
  def copyTo(target: ByteArray): this.type | ByteArray = js.native
  def copyTo(target: ByteArray, targetOffset: Double): this.type | ByteArray = js.native
  def copyTo(target: ByteArray, targetOffset: Double, souceOffset: Double): this.type | ByteArray = js.native
  def copyTo(target: ByteArray, targetOffset: Double, souceOffset: Double, sourceLimit: Double): this.type | ByteArray = js.native
  /**
    * Makes sure that this ByteArray is backed by a ByteArray#buffer of at least the specified capacity.
    * If the current capacity is exceeded, it will be doubled.
    * If double the current capacity is less than the required capacity, the required capacity will be used instead
    */
  def ensureCapacity(capacity: Double): this.type = js.native
  /**
    * Overwrites this ByteArray's contents with the specified value.
    *
    * @param value Byte value to fill with. If given as a string, the first character is used
    * @param begin Begin offset. Will use and increase offset by the number of bytes written if omitted. defaults to offset
    * @param end End offset, defaults to limit.
    */
  def fill(value: String): this.type = js.native
  def fill(value: String, begin: Double): this.type = js.native
  def fill(value: String, begin: Double, end: Double): this.type = js.native
  def fill(value: Double): this.type = js.native
  def fill(value: Double, begin: Double): this.type = js.native
  def fill(value: Double, begin: Double, end: Double): this.type = js.native
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
  def mark(offset: Double): this.type = js.native
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
  def prepend(source: Wrappable): this.type = js.native
  def prepend(source: Wrappable, encoding: String): this.type = js.native
  def prepend(source: Wrappable, encoding: String, offset: Double): this.type = js.native
  /**
    * Prepends some data to this ByteArray.
    * This will overwrite any contents before the specified offset up to the prepended data's length.
    * If there is not enough space available before the specified offset,
    * the backing buffer will be resized and its contents moved accordingly
    *
    * @param source Data to prepend
    * @param offset Offset to prepend at. Will use and decrease offset by the number of bytes prepended if omitted.
    */
  def prepend(source: Wrappable, offset: Double): this.type = js.native
  /**
    * Prepends this ByteArray to another ByteArray.
    * This will overwrite any contents before the specified offset up to the prepended data's length.
    * If there is not enough space available before the specified offset,
    * the backing buffer will be resized and its contents moved accordingly
    *
    * @param offset Offset to prepend at
    */
  def prependTo(target: ByteArray): this.type = js.native
  def prependTo(target: ByteArray, offset: Double): this.type = js.native
  /**
    * Reads the specified number of bytes.
    *
    * @param length Number of bytes to read
    * @param offset Offset to read from. Will use and increase offset by length if omitted.
    */
  def read(length: Double): ByteArray = js.native
  def read(length: Double, offset: Double): ByteArray = js.native
  /**
    * Reads a BitSet as an array of booleans.
    *
    * @param offset Offset to read from. Will use and increase offset by length if omitted.
    */
  def readBitSet(): js.Array[Boolean] = js.native
  def readBitSet(offset: Double): js.Array[Boolean] = js.native
  /**
    * Reads a NULL-terminated UTF8 encoded string.
    * For this to work the string read must not contain any NULL characters itself
    */
  def readCString(): String = js.native
  /**
    * Reads a NULL-terminated UTF8 encoded string.
    * For this to work the string read must not contain any NULL characters itself
    *
    * @param offset Offset to read from
    */
  def readCString(offset: Double): typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
    * Reads a 64bit be float
    *
    * @param offset Offset to read from
    */
  def readDoubleBE(): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  /**
    * Reads a 64bit le float
    *
    * @param offset Offset to read from
    */
  def readDoubleLE(): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  /**
    * Reads a 32bit be float
    *
    * @param offset Offset to read from
    */
  def readFloatBE(): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  /**
    * Reads a 32bit le float
    *
    * @param offset Offset to read from
    */
  def readFloatLE(): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  /**
    * Reads a 16bit signed be integer
    *
    * @param offset Offset to read from
    */
  def readInt16BE(): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  /**
    * Reads a 16bit signed le integer
    *
    * @param offset Offset to read from
    */
  def readInt16LE(): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  /**
    * Reads a 32bit signed be integer
    *
    * @param offset Offset to read from
    */
  def readInt32BE(): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  /**
    * Reads a 32bit signed le integer
    *
    * @param offset Offset to read from
    */
  def readInt32LE(): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  /**
    * Reads a 64bit signed be integer as math.Long
    *
    * @param offset Offset to read from
    */
  def readInt64BE(): Long = js.native
  def readInt64BE(offset: Double): Long = js.native
  /**
    * Reads a 64bit signed le integer as math.Long
    *
    * @param offset Offset to read from
    */
  def readInt64LE(): Long = js.native
  def readInt64LE(offset: Double): Long = js.native
  /**
    * Reads an 8bit signed integer
    *
    * @param offset Offset to read from
    */
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  /**
    * Reads an UTF8 encoded string
    *
    * @param length Number of characters or bytes to read
    * @param metrics Metrics specifying what n is meant to count. Defaults to ByteArray.METRICS_CHARS("c")
    */
  def readString(length: Double): String = js.native
  def readString(length: Double, metrics: Metrics): String = js.native
  /**
    * Reads an UTF8 encoded string
    *
    * @param length Number of characters or bytes to read
    * @param metrics Metrics specifying what n is meant to count. Defaults to ByteArray.METRICS_CHARS("c")
    * @param offset Offset to read from
    */
  def readString(length: Double, metrics: Metrics, offset: Double): typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
    * Reads an UTF8 encoded string
    *
    * @param length Number of characters or bytes to read
    * @param offset Offset to read from
    */
  def readString(length: Double, offset: Double): typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
    * Reads a 16bit unsigned be integer
    *
    * @param offset Offset to read from
    */
  def readUInt16BE(): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  /**
    * Reads a 16bit unsigned le integer
    *
    * @param offset Offset to read from
    */
  def readUInt16LE(): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  /**
    * Reads a 24bit unsigned be integer
    *
    * @param offset Offset to read from
    */
  def readUInt24BE(): Double = js.native
  def readUInt24BE(offset: Double): Double = js.native
  /**
    * Reads a 32bit unsigned be integer
    *
    * @param offset Offset to read from
    */
  def readUInt32BE(): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  /**
    * Reads a 32bit unsigned le integer
    *
    * @param offset Offset to read from
    */
  def readUInt32LE(): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  /**
    * Reads a 64bit unsigned be integer as math.Long
    *
    * @param offset Offset to read from
    */
  def readUInt64BE(): Long = js.native
  def readUInt64BE(offset: Double): Long = js.native
  /**
    * Reads a 64bit unsigned le integer as math.Long
    *
    * @param offset Offset to read from
    */
  def readUInt64LE(): Long = js.native
  def readUInt64LE(offset: Double): Long = js.native
  /**
    * Reads an 8bit unsigned integer
    *
    * @param offset Offset to read from
    */
  def readUInt8(): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  /**
    * Reads a length as varint32 prefixed UTF8 encoded string
    */
  def readVString(): String = js.native
  /**
    * Reads a length as varint32 prefixed UTF8 encoded string
    *
    * @param offset Offset to read from
    */
  def readVString(offset: Double): typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.String = js.native
  /**
    * Reads a 32bit base 128 variable-length integer
    */
  def readVarint32(): Double = js.native
  /**
    * Reads a 32bit base 128 variable-length integer
    *
    * @param offset Offset to read from
    */
  def readVarint32(offset: Double): Varint32 = js.native
  /**
    * Reads a zig-zag encoded 32bit base 128 variable-length integer
    */
  def readVarint32ZigZag(): Double = js.native
  /**
    * Reads a zig-zag encoded 32bit base 128 variable-length integer
    *
    * @param offset Offset to read from
    */
  def readVarint32ZigZag(offset: Double): Varint32 = js.native
  /**
    * Reads a 64bit base 128 variable-length integer
    */
  def readVarint64(): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Reads a 64bit base 128 variable-length integer
    *
    * @param offset Offset to read from
    */
  def readVarint64(offset: Double): Varint64 = js.native
  /**
    * Reads a zig-zag encoded 64bit base 128 variable-length integer
    */
  def readVarint64ZigZag(): Long = js.native
  /**
    * Reads a zig-zag encoded 64bit base 128 variable-length integer
    *
    * @param offset Offset to read from
    */
  def readVarint64ZigZag(offset: Double): Varint64 = js.native
  /**
    * Gets the number of remaining readable bytes
    */
  def remaining(): Double = js.native
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
  def resize(capacity: Double): this.type = js.native
  /**
    * Reverses this ByteArray's contents.
    *
    * @param begin Offset to start at, defaults to offset
    * @param end Offset to end at, defaults to limit
    */
  def reverse(): this.type = js.native
  def reverse(begin: Double): this.type = js.native
  def reverse(begin: Double, end: Double): this.type = js.native
  /**
    * Skips the next length bytes. This will just advance
    */
  def skip(length: Double): this.type = js.native
  /**
    * Slices this ByteArray by creating a cloned instance with offset = begin and limit = end
    *
    * @param begin Begin offset, defaults to offset
    * @param end End offset, defaults to limit
    */
  def slice(): ByteArray = js.native
  def slice(begin: Double): ByteArray = js.native
  def slice(begin: Double, end: Double): ByteArray = js.native
  /**
    * Returns a raw buffer compacted to contain this ByteArray's contents
    */
  def toArrayBuffer(): ArrayBuffer = js.native
  /**
    * Encodes this ByteArray's contents to a base64 encoded string
    *
    * @param begin Begin offset, offset by default
    * @param end End offset, limit by default
    */
  def toBase64(): String = js.native
  def toBase64(begin: Double): String = js.native
  def toBase64(begin: Double, end: Double): String = js.native
  /**
    * Encodes this ByteArray to a binary encoded string, that is using only characters 0x00-0xFF as bytes
    *
    * @param begin Begin offset, offset by default
    * @param end End offset, limit by default
    */
  def toBinary(): String = js.native
  def toBinary(begin: Double): String = js.native
  def toBinary(begin: Double, end: Double): String = js.native
  /**
    * Returns a copy of the backing buffer that contains this ByteArray's contents.
    *
    * @param forceCopy If true returns a copy, otherwise returns a view referencing the same memory if possible, false by default
    * @param begin Begin offset, offset by default
    * @param end End offset, limit by default
    */
  def toBuffer(): Buffer = js.native
  def toBuffer(forceCopy: Boolean): Buffer = js.native
  def toBuffer(forceCopy: Boolean, begin: Double): Buffer = js.native
  def toBuffer(forceCopy: Boolean, begin: Double, end: Double): Buffer = js.native
  /**
    * Encodes this ByteArray to a hex encoded string with marked offsets
    *
    * @param columns If true returns two columns hex + ascii, defaults to false
    */
  def toDebug(): String = js.native
  def toDebug(columns: Boolean): String = js.native
  /**
    * Encodes this ByteArray's contents to a hex encoded string
    *
    * @param begin Begin offset, offset by default
    * @param end End offset, limit by default
    */
  def toHex(): String = js.native
  def toHex(begin: Double): String = js.native
  def toHex(begin: Double, end: Double): String = js.native
  def toString(encoding: String): String = js.native
  def toString(encoding: String, begin: Double): String = js.native
  def toString(encoding: String, begin: Double, end: Double): String = js.native
  /**
    * Encodes this ByteArray's contents to an UTF8 encoded string
    *
    * @param begin Begin offset, offset by default
    * @param end End offset, limit by default
    */
  def toUTF8(): String = js.native
  def toUTF8(begin: Double): String = js.native
  def toUTF8(begin: Double, end: Double): String = js.native
  /**
    * Appends some data to this ByteArray.
    * This will overwrite any contents behind the specified offset up to the appended data's length.
    *
    * @param source The source write from
    * @param offset Offset to write at
    * @param length length to read from the source
    * @param encoding encoding to use for wrapping the source in bytearray
    */
  def write(source: Wrappable): this.type = js.native
  def write(source: Wrappable, offset: Double): this.type = js.native
  def write(source: Wrappable, offset: Double, length: Double): this.type = js.native
  def write(source: Wrappable, offset: Double, length: Double, encoding: String): this.type = js.native
  /**
    * Writes the array as a bitset.
    * @param value Array of booleans to write
    */
  def writeBitSet(value: js.Array[Double]): this.type = js.native
  /**
    * Writes the array as a bitset.
    * @param value Array of booleans to write
    * @param offset Offset to write at
    */
  def writeBitSet(value: js.Array[Double], offset: Double): Double = js.native
  /**
    * Writes a buffer at the given offset
    * @param buf Buffer to write
    * @param offset Offset to write at
    */
  def writeBuffer(buf: Buffer): this.type = js.native
  def writeBuffer(buf: Buffer, offset: Double): this.type = js.native
  /**
    * Writes a NULL-terminated UTF8 encoded string.
    * For this to work the specified string must not contain any NULL characters itself
    */
  def writeCString(str: String): this.type = js.native
  /**
    * Writes a NULL-terminated UTF8 encoded string.
    * For this to work the specified string must not contain any NULL characters itself
    *
    * @param offset Offset to write at
    */
  def writeCString(str: String, offset: Double): Double = js.native
  /**
    * Writes a 64bit be float
    *
    * @param offset Offset to write at
    */
  def writeDoubleBE(value: Double): this.type = js.native
  def writeDoubleBE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 64bit le float
    *
    * @param offset Offset to write at
    */
  def writeDoubleLE(value: Double): this.type = js.native
  def writeDoubleLE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit be float
    *
    * @param offset Offset to write at
    */
  def writeFloatBE(value: Double): this.type = js.native
  def writeFloatBE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit le float
    *
    * @param offset Offset to write at
    */
  def writeFloatLE(value: Double): this.type = js.native
  def writeFloatLE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 16bit signed be integer
    *
    * @param offset Offset to write at
    */
  def writeInt16BE(value: Double): this.type = js.native
  def writeInt16BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 16bit signed le integer
    *
    * @param offset Offset to write at
    */
  def writeInt16LE(value: Double): this.type = js.native
  def writeInt16LE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit signed be integer
    *
    * @param offset Offset to write at
    */
  def writeInt32BE(value: Double): this.type = js.native
  def writeInt32BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit signed le integer
    *
    * @param offset Offset to write at
    */
  def writeInt32LE(value: Double): this.type = js.native
  def writeInt32LE(value: Double, offset: Double): this.type = js.native
  def writeInt64BE(value: String): this.type = js.native
  def writeInt64BE(value: String, offset: Double): this.type = js.native
  def writeInt64BE(value: Double): this.type = js.native
  def writeInt64BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 64bit signed be long integer
    *
    * @param offset Offset to write at
    */
  def writeInt64BE(value: Long): this.type = js.native
  def writeInt64BE(value: Long, offset: Double): this.type = js.native
  def writeInt64LE(value: String): this.type = js.native
  def writeInt64LE(value: String, offset: Double): this.type = js.native
  def writeInt64LE(value: Double): this.type = js.native
  def writeInt64LE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 64bit signed le long integer
    *
    * @param offset Offset to write at
    */
  def writeInt64LE(value: Long): this.type = js.native
  def writeInt64LE(value: Long, offset: Double): this.type = js.native
  /**
    * Writes an 8bit signed integer
    *
    * @param offset Offset to write at
    */
  def writeInt8(value: Double): this.type = js.native
  def writeInt8(value: Double, offset: Double): this.type = js.native
  /**
    * Writes an UTF8 encoded string
    */
  def writeString(str: String): this.type = js.native
  /**
    * Writes an UTF8 encoded string
    *
    * @param offset Offset to write at
    */
  def writeString(str: String, offset: Double): Double = js.native
  /**
    * Writes a 16bit unsigned be integer
    *
    * @param offset Offset to write at
    */
  def writeUInt16BE(value: Double): this.type = js.native
  def writeUInt16BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 16bit unsigned le integer
    *
    * @param offset Offset to write at
    */
  def writeUInt16LE(value: Double): this.type = js.native
  def writeUInt16LE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 24bit unsigned be integer
    *
    * @param offset Offset to write at
    */
  def writeUInt24BE(value: Double): this.type = js.native
  def writeUInt24BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit unsigned be integer
    *
    * @param offset Offset to write at
    */
  def writeUInt32BE(value: Double): this.type = js.native
  def writeUInt32BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 32bit unsigned le integer
    *
    * @param offset Offset to write at
    */
  def writeUInt32LE(value: Double): this.type = js.native
  def writeUInt32LE(value: Double, offset: Double): this.type = js.native
  def writeUInt64BE(value: String): this.type = js.native
  def writeUInt64BE(value: String, offset: Double): this.type = js.native
  def writeUInt64BE(value: Double): this.type = js.native
  def writeUInt64BE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 64bit unsigned be long integer
    *
    * @param offset Offset to write at
    */
  def writeUInt64BE(value: Long): this.type = js.native
  def writeUInt64BE(value: Long, offset: Double): this.type = js.native
  def writeUInt64LE(value: String): this.type = js.native
  def writeUInt64LE(value: String, offset: Double): this.type = js.native
  def writeUInt64LE(value: Double): this.type = js.native
  def writeUInt64LE(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a 64bit unsigned le long integer
    *
    * @param offset Offset to write at
    */
  def writeUInt64LE(value: Long): this.type = js.native
  def writeUInt64LE(value: Long, offset: Double): this.type = js.native
  /**
    * Writes an 8bit unsigned integer
    *
    * @param offset Offset to write at
    */
  def writeUInt8(value: Double): this.type = js.native
  def writeUInt8(value: Double, offset: Double): this.type = js.native
  /**
    * Writes a length as varint32 prefixed UTF8 encoded string
    */
  def writeVString(str: String): this.type = js.native
  /**
    * Writes a length as varint32 prefixed UTF8 encoded string
    *
    * @param offset Offset to read from
    */
  def writeVString(str: String, offset: Double): Double = js.native
  /**
    * Writes a 32bit base 128 variable-length integer
    */
  def writeVarint32(value: Double): this.type = js.native
  /**
    * Writes a 32bit base 128 variable-length integer
    *
    * @param offset Offset to write at
    */
  def writeVarint32(value: Double, offset: Double): Double = js.native
  /**
    * Writes a zig-zag encoded 32bit base 128 variable-length integer
    */
  def writeVarint32ZigZag(value: Double): this.type = js.native
  /**
    * Writes a zig-zag encoded 32bit base 128 variable-length integer
    *
    * @param offset Offset to write at
    */
  def writeVarint32ZigZag(value: Double, offset: Double): Double = js.native
  def writeVarint64(value: String): this.type = js.native
  def writeVarint64(value: String, offset: Double): Double = js.native
  def writeVarint64(value: Double): this.type = js.native
  def writeVarint64(value: Double, offset: Double): Double = js.native
  /**
    * Writes a 64bit base 128 variable-length integer
    */
  def writeVarint64(value: Long): this.type = js.native
  /**
    * Writes a 64bit base 128 variable-length integer
    *
    * @param offset Offset to write at
    */
  def writeVarint64(value: Long, offset: Double): Double = js.native
  def writeVarint64ZigZag(value: String): this.type = js.native
  def writeVarint64ZigZag(value: String, offset: Double): Double = js.native
  def writeVarint64ZigZag(value: Double): this.type = js.native
  def writeVarint64ZigZag(value: Double, offset: Double): Double = js.native
  /**
    * Writes a zig-zag encoded 64bit base 128 variable-length integer
    */
  def writeVarint64ZigZag(value: Long): this.type = js.native
  /**
    * Writes a zig-zag encoded 64bit base 128 variable-length integer
    *
    * @param offset Offset to write at
    */
  def writeVarint64ZigZag(value: Long, offset: Double): Double = js.native
}

/* static members */
@JSGlobal("adone.collection.ByteArray")
@js.native
object ByteArray extends js.Object {
  /**
    * Default initial capacity
    */
  var DEFAULT_CAPACITY: Double = js.native
  /**
    * Default no assertions flag
    */
  var DEFAULT_NOASSERT: Boolean = js.native
  /**
    * Maximum number of bytes required to store a 32bit base 128 variable-length integer
    */
  var MAX_VARINT32_BYTES: Double = js.native
  /**
    * Maximum number of bytes required to store a 64bit base 128 variable-length integer
    */
  var MAX_VARINT64_BYTES: Double = js.native
  /**
    * Metrics representing number of bytes. Evaluates to `b`.
    */
  var METRICS_BYTES: String = js.native
  /**
    * Metrics representing number of UTF8 characters. Evaluates to `c`.
    */
  var METRICS_CHARS: String = js.native
  def accessor(): TypeofClassBufferAlloc = js.native
  /**
    * Allocates a new ByteArray backed by a buffer of the specified capacity.
    *
    * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
    */
  def allocate(): ByteArray = js.native
  def allocate(capacity: Double): ByteArray = js.native
  def allocate(capacity: Double, noAssert: Boolean): ByteArray = js.native
  /**
    * Decodes a base64 encoded string to binary like window.atob does
    */
  def atob(b64: String): String = js.native
  /**
    * Encodes a binary string to base64 like window.btoa does
    */
  def btoa(str: String): String = js.native
  /**
    *  Calculates the number of UTF8 bytes of a string.
    */
  def calculateString(str: String): Double = js.native
  /**
    * Calculates the number of UTF8 characters of a string.
    * JavaScript itself uses UTF-16,
    * so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF
    */
  def calculateUTF8Chars(str: String): Double = js.native
  /**
    * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer
    */
  def calculateVarint32(value: Double): Double = js.native
  def calculateVarint64(value: String): Double = js.native
  /**
    * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer
    */
  def calculateVarint64(value: Double): Double = js.native
  /**
    * Concatenates multiple ByteArrays into one
    *
    * @param encoding Encoding for strings
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
    */
  def concat(buffers: js.Array[Wrappable]): ByteArray = js.native
  def concat(buffers: js.Array[Wrappable], encoding: String): ByteArray = js.native
  def concat(buffers: js.Array[Wrappable], encoding: String, noAssert: Boolean): ByteArray = js.native
  /**
    * Decodes a base64 encoded string to a ByteArray
    */
  def fromBase64(str: String): ByteArray = js.native
  /**
    * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteArray
    */
  def fromBinary(str: String): ByteArray = js.native
  /**
    * Decodes a hex encoded string with marked offsets to a ByteArray
    */
  def fromDebug(str: String): ByteArray = js.native
  def fromDebug(str: String, noAssert: Boolean): ByteArray = js.native
  /**
    * Decodes a hex encoded string to a ByteArray
    */
  def fromHex(str: String): ByteArray = js.native
  def fromHex(str: String, noAssert: Boolean): ByteArray = js.native
  /**
    * Decodes an UTF8 encoded string to a ByteArray
    */
  def fromUTF8(str: String): ByteArray = js.native
  def fromUTF8(str: String, noAssert: Boolean): ByteArray = js.native
  def `type`(): TypeofClassBufferAlloc = js.native
  /**
    * Wraps a buffer or a string.
    * Sets the allocated ByteArray's offset to 0 and its limit to the length of the wrapped data
    *
    * @param encoding Encoding for strings
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
    */
  def wrap(buffer: Wrappable): ByteArray = js.native
  def wrap(buffer: Wrappable, encoding: String): ByteArray = js.native
  def wrap(buffer: Wrappable, encoding: String, noAssert: Boolean): ByteArray = js.native
  /**
    * Decodes a zigzag encoded signed 32bit integer
    */
  def zigZagDecode32(n: Double): Double = js.native
  def zigZagDecode64(value: String): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Decodes a zigzag encoded signed 64bit integer.
    */
  def zigZagDecode64(value: Double): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  def zigZagDecode64(value: typings.adone.adoneNs.collectionNs.INs.Long): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode32(n: Double): Double = js.native
  def zigZagEncode64(value: String): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode64(value: Double): typings.adone.adoneNs.collectionNs.INs.Long = js.native
  def zigZagEncode64(value: typings.adone.adoneNs.collectionNs.INs.Long): typings.adone.adoneNs.collectionNs.INs.Long = js.native
}

