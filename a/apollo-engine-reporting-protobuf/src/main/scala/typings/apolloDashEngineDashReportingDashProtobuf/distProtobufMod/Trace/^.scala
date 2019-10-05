package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ITrace
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  def create(properties: ITrace): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITrace): Writer = js.native
  def encode(message: ITrace, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITrace): Writer = js.native
  def encodeDelimited(message: ITrace, writer: Writer): Writer = js.native
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace = js.native
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

