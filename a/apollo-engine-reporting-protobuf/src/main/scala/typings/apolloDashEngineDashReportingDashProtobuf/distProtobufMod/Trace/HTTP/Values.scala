package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Values. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values")
@js.native
/**
  * Constructs a new Values.
  * @param [properties] Properties to set
  */
class Values () extends IValues {
  def this(properties: IValues) = this()
  /** Values value. */
  @JSName("value")
  var value_Values: js.Array[String] = js.native
  /**
    * Converts this Values to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values")
@js.native
object Values extends js.Object {
  /**
    * Creates a new Values instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Values instance
    */
  def create(): Values = js.native
  def create(properties: IValues): Values = js.native
  /**
    * Decodes a Values message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Values
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Values = js.native
  def decode(reader: Reader, length: Double): Values = js.native
  def decode(reader: Uint8Array): Values = js.native
  def decode(reader: Uint8Array, length: Double): Values = js.native
  /**
    * Decodes a Values message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Values
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Values = js.native
  def decodeDelimited(reader: Uint8Array): Values = js.native
  /**
    * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
    * @param message Values message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IValues): Writer = js.native
  def encode(message: IValues, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
    * @param message Values message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IValues): Writer = js.native
  def encodeDelimited(message: IValues, writer: Writer): Writer = js.native
  /**
    * Creates a Values message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Values
    */
  def fromObject(`object`: StringDictionary[js.Any]): Values = js.native
  /**
    * Creates a plain object from a Values message. Also converts values to other types if specified.
    * @param message Values
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Values): StringDictionary[js.Any] = js.native
  def toObject(message: Values, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Values message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

