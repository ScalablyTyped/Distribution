package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.adone.adoneNs.collectionNs.INs.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassByteArray
  extends Instantiable0[ByteArray]
     with Instantiable1[/* capacity */ Double, ByteArray]
     with Instantiable2[/* capacity */ Double, /* noAssert */ Boolean, ByteArray] {
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
  def accessor(): /* import warning: ImportType.apply Failed type conversion: typeof Buffer */ js.Any = js.native
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
  def `type`(): /* import warning: ImportType.apply Failed type conversion: typeof Buffer */ js.Any = js.native
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
  def zigZagDecode64(value: String): Long = js.native
  /**
    * Decodes a zigzag encoded signed 64bit integer.
    */
  def zigZagDecode64(value: Double): Long = js.native
  def zigZagDecode64(value: Long): Long = js.native
  /**
    * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode32(n: Double): Double = js.native
  def zigZagEncode64(value: String): Long = js.native
  /**
    * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode64(value: Double): Long = js.native
  def zigZagEncode64(value: Long): Long = js.native
}

