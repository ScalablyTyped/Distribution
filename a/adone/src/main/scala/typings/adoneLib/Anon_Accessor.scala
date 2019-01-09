package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Accessor
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.ByteArray]
     with org.scalablytyped.runtime.Instantiable1[/* capacity */ scala.Double, adoneLib.adoneNs.collectionNs.ByteArray]
     with org.scalablytyped.runtime.Instantiable2[
      /* capacity */ scala.Double, 
      /* noAssert */ scala.Boolean, 
      adoneLib.adoneNs.collectionNs.ByteArray
    ] {
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
  def accessor(): /* import warning: ImportType.apply Failed type conversion: typeof Buffer */ js.Any = js.native
  /**
    * Allocates a new ByteArray backed by a buffer of the specified capacity.
    *
    * @param capacity Initial capacity. Defaults to ByteArray.DEFAULT_CAPACITY(64)
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
    */
  def allocate(): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def allocate(capacity: scala.Double): adoneLib.adoneNs.collectionNs.ByteArray = js.native
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
  def concat(
    buffers: js.Array[adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable],
    encoding: java.lang.String
  ): adoneLib.adoneNs.collectionNs.ByteArray = js.native
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
  def fromDebug(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
    * Decodes a hex encoded string to a ByteArray
    */
  def fromHex(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def fromHex(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
    * Decodes an UTF8 encoded string to a ByteArray
    */
  def fromUTF8(str: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def fromUTF8(str: java.lang.String, noAssert: scala.Boolean): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def `type`(): /* import warning: ImportType.apply Failed type conversion: typeof Buffer */ js.Any = js.native
  /**
    * Wraps a buffer or a string.
    * Sets the allocated ByteArray's offset to 0 and its limit to the length of the wrapped data
    *
    * @param encoding Encoding for strings
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteArray.DEFAULT_NOASSERT(false)
    */
  def wrap(buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def wrap(buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, encoding: java.lang.String): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  def wrap(
    buffer: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable,
    encoding: java.lang.String,
    noAssert: scala.Boolean
  ): adoneLib.adoneNs.collectionNs.ByteArray = js.native
  /**
    * Decodes a zigzag encoded signed 32bit integer
    */
  def zigZagDecode32(n: scala.Double): scala.Double = js.native
  def zigZagDecode64(value: adoneLib.adoneNs.collectionNs.INs.Long): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  def zigZagDecode64(value: java.lang.String): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Decodes a zigzag encoded signed 64bit integer.
    */
  def zigZagDecode64(value: scala.Double): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode32(n: scala.Double): scala.Double = js.native
  def zigZagEncode64(value: adoneLib.adoneNs.collectionNs.INs.Long): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  def zigZagEncode64(value: java.lang.String): adoneLib.adoneNs.collectionNs.INs.Long = js.native
  /**
    * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding
    */
  def zigZagEncode64(value: scala.Double): adoneLib.adoneNs.collectionNs.INs.Long = js.native
}

