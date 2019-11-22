package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Error. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.Error")
@js.native
/**
  * Constructs a new Error.
  * @param [properties] Properties to set
  */
class Error () extends IError {
  def this(properties: IError) = this()
  /** Error json. */
  @JSName("json")
  var json_Error: String = js.native
  /** Error location. */
  @JSName("location")
  var location_Error: js.Array[ILocation] = js.native
  /** Error message. */
  @JSName("message")
  var message_Error: String = js.native
  /** Error timeNs. */
  @JSName("timeNs")
  var timeNs_Error: Double = js.native
  /**
    * Converts this Error to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.Error")
@js.native
object Error extends js.Object {
  /**
    * Creates a new Error instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Error instance
    */
  def create(): Error = js.native
  def create(properties: IError): Error = js.native
  /**
    * Decodes an Error message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Error
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Error = js.native
  def decode(reader: Reader, length: Double): Error = js.native
  def decode(reader: Uint8Array): Error = js.native
  def decode(reader: Uint8Array, length: Double): Error = js.native
  /**
    * Decodes an Error message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Error
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Error = js.native
  def decodeDelimited(reader: Uint8Array): Error = js.native
  /**
    * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
    * @param message Error message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IError): Writer = js.native
  def encode(message: IError, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
    * @param message Error message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IError): Writer = js.native
  def encodeDelimited(message: IError, writer: Writer): Writer = js.native
  /**
    * Creates an Error message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Error
    */
  def fromObject(`object`: StringDictionary[js.Any]): Error = js.native
  /**
    * Creates a plain object from an Error message. Also converts values to other types if specified.
    * @param message Error
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Error): StringDictionary[js.Any] = js.native
  def toObject(message: Error, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Error message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

