package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-crt/dist/native/eventstream", "Header")
@js.native
open class Header protected () extends StObject {
  /** @internal */
  def this(name: String, `type`: HeaderType) = this()
  def this(name: String, `type`: HeaderType, value: HeaderValue) = this()
  
  /**
    * All conversion functions require the header's type to be appropriately matching.  There are no error-prone
    * flexible conversion helpers.
    */
  /**
    * Returns a boolean header's value.
    */
  def asBoolean(): Boolean = js.native
  
  /**
    * Returns a byte header's value.
    */
  def asByte(): Double = js.native
  
  /**
    * Returns a byte buffer header's value.
    */
  def asByteBuffer(): Payload = js.native
  
  /**
    * Returns a 16-bit integer header's value.
    */
  def asInt16(): Double = js.native
  
  /**
    * Returns a 32-bit integer header's value.
    */
  def asInt32(): Double = js.native
  
  /**
    * Returns a 64-bit integer header's value.
    */
  def asInt64(): js.BigInt = js.native
  
  /**
    * Returns a string header's value.
    */
  def asString(): String = js.native
  
  /**
    * Returns a timestamp header's value (as seconds since epoch).
    */
  def asTimestamp(): Double = js.native
  
  /**
    * Returns a UUID header's value.
    */
  def asUUID(): js.typedarray.ArrayBuffer = js.native
  
  var name: String = js.native
  
  /* private */ var toValue: Any = js.native
  
  var `type`: HeaderType = js.native
  
  var value: js.UndefOr[HeaderValue] = js.native
}
/* static members */
object Header {
  
  @JSImport("aws-crt/dist/native/eventstream", "Header")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new boolean-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newBoolean(name: String, value: Boolean): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newBoolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new byte-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newByte(name: String, value: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newByte")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new byte-buffer-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newByteBuffer(name: String, value: Payload): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newByteBuffer")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new 16-bit-integer-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newInt16(name: String, value: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt16")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new 32-bit-integer-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newInt32(name: String, value: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt32")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new 64-bit-integer-valued message header from a big integer.
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newInt64FromBigint(name: String, value: js.BigInt): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt64FromBigint")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new 64-bit-integer-valued message header.  number cannot represent a full 64-bit integer range but
    * its usage is so common that this exists for convenience.  Internally, we always track 64 bit integers as
    * bigints.
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newInt64FromNumber(name: String, value: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt64FromNumber")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new string-valued message header
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newString(name: String, value: String): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newString")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new timestamp-valued message header from a date.
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newTimeStampFromDate(name: String, date: js.Date): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampFromDate")(name.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new timestamp-valued message header from an integral value in seconds since epoch.
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newTimeStampFromSecondsSinceEpoch(name: String, secondsSinceEpoch: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampFromSecondsSinceEpoch")(name.asInstanceOf[js.Any], secondsSinceEpoch.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * Create a new UUID-valued message header.
    * WIP
    *
    * @param name name of the header
    * @param value value of the header
    */
  inline def newUUID(name: String, value: js.typedarray.ArrayBuffer): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newUUID")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  @JSImport("aws-crt/dist/native/eventstream", "Header.validateHeaderName")
  @js.native
  def validateHeaderName: Any = js.native
  inline def validateHeaderName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderName")(x.asInstanceOf[js.Any])
}
