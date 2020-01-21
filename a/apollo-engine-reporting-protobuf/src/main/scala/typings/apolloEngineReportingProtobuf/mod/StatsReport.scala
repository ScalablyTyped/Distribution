package typings.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.IStatsReport
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
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
  extends typings.apolloEngineReportingProtobuf.protobufMod.StatsReport {
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
  def create(): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def create(properties: IStatsReport): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Reader, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Creates a plain object from a StatsReport message. Also converts values to other types if specified.
    * @param message StatsReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.StatsReport): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloEngineReportingProtobuf.protobufMod.StatsReport,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StatsReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

