package typings.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.ITraceV1
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "TraceV1")
@js.native
/**
  * Constructs a new TraceV1.
  * @param [properties] Properties to set
  */
class TraceV1 ()
  extends typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 {
  def this(properties: ITraceV1) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "TraceV1")
@js.native
object TraceV1 extends js.Object {
  /**
    * Creates a new TraceV1 instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TraceV1 instance
    */
  def create(): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  def create(properties: ITraceV1): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  /**
    * Decodes a TraceV1 message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TraceV1
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  def decode(reader: Reader, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  def decode(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  /**
    * Decodes a TraceV1 message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TraceV1
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  /**
    * Encodes the specified TraceV1 message. Does not implicitly {@link TraceV1.verify|verify} messages.
    * @param message TraceV1 message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITraceV1): Writer = js.native
  def encode(message: ITraceV1, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TraceV1 message, length delimited. Does not implicitly {@link TraceV1.verify|verify} messages.
    * @param message TraceV1 message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITraceV1): Writer = js.native
  def encodeDelimited(message: ITraceV1, writer: Writer): Writer = js.native
  /**
    * Creates a TraceV1 message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TraceV1
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloEngineReportingProtobuf.protobufMod.TraceV1 = js.native
  /**
    * Creates a plain object from a TraceV1 message. Also converts values to other types if specified.
    * @param message TraceV1
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.TraceV1): StringDictionary[js.Any] = js.native
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.TraceV1, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TraceV1 message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

