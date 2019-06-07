package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

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
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 {
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1) = this()
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
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  /**
    * Decodes a TraceV1 message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TraceV1
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  /**
    * Decodes a TraceV1 message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TraceV1
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  /**
    * Encodes the specified TraceV1 message. Does not implicitly {@link TraceV1.verify|verify} messages.
    * @param message TraceV1 message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified TraceV1 message, length delimited. Does not implicitly {@link TraceV1.verify|verify} messages.
    * @param message TraceV1 message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraceV1,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a TraceV1 message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TraceV1
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1 = js.native
  /**
    * Creates a plain object from a TraceV1 message. Also converts values to other types if specified.
    * @param message TraceV1
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceV1,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a TraceV1 message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

