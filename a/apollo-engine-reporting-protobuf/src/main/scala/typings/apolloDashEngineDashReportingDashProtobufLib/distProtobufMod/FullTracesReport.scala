package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "FullTracesReport")
@js.native
/**
  * Constructs a new FullTracesReport.
  * @param [properties] Properties to set
  */
class FullTracesReport () extends IFullTracesReport {
  def this(properties: IFullTracesReport) = this()
  /** FullTracesReport tracesPerQuery. */
  @JSName("tracesPerQuery")
  var tracesPerQuery_FullTracesReport: org.scalablytyped.runtime.StringDictionary[ITraces] = js.native
  /**
    * Converts this FullTracesReport to JSON.
    * @returns JSON object
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "FullTracesReport")
@js.native
object FullTracesReport extends js.Object {
  /**
    * Creates a new FullTracesReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FullTracesReport instance
    */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IFullTracesReport): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  /**
    * Decodes a FullTracesReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FullTracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  /**
    * Decodes a FullTracesReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FullTracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  /**
    * Encodes the specified FullTracesReport message. Does not implicitly {@link FullTracesReport.verify|verify} messages.
    * @param message FullTracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IFullTracesReport): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IFullTracesReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified FullTracesReport message, length delimited. Does not implicitly {@link FullTracesReport.verify|verify} messages.
    * @param message FullTracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IFullTracesReport): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IFullTracesReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a FullTracesReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FullTracesReport
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport = js.native
  /**
    * Creates a plain object from a FullTracesReport message. Also converts values to other types if specified.
    * @param message FullTracesReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.FullTracesReport,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a FullTracesReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

