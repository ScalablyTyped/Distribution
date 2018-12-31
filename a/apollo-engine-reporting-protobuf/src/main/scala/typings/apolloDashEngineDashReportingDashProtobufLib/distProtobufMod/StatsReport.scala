package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "StatsReport")
@js.native
/**
  * Constructs a new StatsReport.
  * @param [properties] Properties to set
  */
class StatsReport () extends IStatsReport {
  def this(properties: IStatsReport) = this()
  /** StatsReport legacyPerQueryImplicitOperationName. */
  @JSName("legacyPerQueryImplicitOperationName")
  var legacyPerQueryImplicitOperationName_StatsReport: org.scalablytyped.runtime.StringDictionary[IQueryStats] = js.native
  /** StatsReport perQuery. */
  @JSName("perQuery")
  var perQuery_StatsReport: org.scalablytyped.runtime.StringDictionary[IQueryStats] = js.native
  /** StatsReport realtimeDuration. */
  @JSName("realtimeDuration")
  var realtimeDuration_StatsReport: scala.Double = js.native
  /** StatsReport type. */
  @JSName("type")
  var type_StatsReport: js.Array[IType] = js.native
  /**
    * Converts this StatsReport to JSON.
    * @returns JSON object
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "StatsReport")
@js.native
object StatsReport extends js.Object {
  /**
    * Creates a new StatsReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsReport instance
    */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IStatsReport): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  /**
    * Encodes the specified StatsReport message. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IStatsReport): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IStatsReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified StatsReport message, length delimited. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IStatsReport): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IStatsReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a StatsReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsReport
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport = js.native
  /**
    * Creates a plain object from a StatsReport message. Also converts values to other types if specified.
    * @param message StatsReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.StatsReport,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a StatsReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

