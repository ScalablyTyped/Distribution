package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.IStatsReport
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "StatsReport")
@js.native
/**
  * Constructs a new StatsReport.
  * @param [properties] Properties to set
  */
class StatsReport ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport {
  def this(properties: IStatsReport) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "StatsReport")
@js.native
object StatsReport extends js.Object {
  /**
    * Creates a new StatsReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsReport instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  def create(properties: IStatsReport): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  /**
    * Encodes the specified StatsReport message. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStatsReport): Writer = js.native
  def encode(message: IStatsReport, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StatsReport message, length delimited. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStatsReport): Writer = js.native
  def encodeDelimited(message: IStatsReport, writer: Writer): Writer = js.native
  /**
    * Creates a StatsReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsReport
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport = js.native
  /**
    * Creates a plain object from a StatsReport message. Also converts values to other types if specified.
    * @param message StatsReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.StatsReport,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StatsReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

