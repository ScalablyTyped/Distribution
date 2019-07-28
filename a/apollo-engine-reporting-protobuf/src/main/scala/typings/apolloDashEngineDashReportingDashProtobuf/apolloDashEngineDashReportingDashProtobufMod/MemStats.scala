package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.IMemStats
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "MemStats")
@js.native
/**
  * Constructs a new MemStats.
  * @param [properties] Properties to set
  */
class MemStats ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats {
  def this(properties: IMemStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "MemStats")
@js.native
object MemStats extends js.Object {
  /**
    * Creates a new MemStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MemStats instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  def create(properties: IMemStats): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  /**
    * Encodes the specified MemStats message. Does not implicitly {@link MemStats.verify|verify} messages.
    * @param message MemStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMemStats): Writer = js.native
  def encode(message: IMemStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MemStats message, length delimited. Does not implicitly {@link MemStats.verify|verify} messages.
    * @param message MemStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMemStats): Writer = js.native
  def encodeDelimited(message: IMemStats, writer: Writer): Writer = js.native
  /**
    * Creates a MemStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MemStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats = js.native
  /**
    * Creates a plain object from a MemStats message. Also converts values to other types if specified.
    * @param message MemStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.MemStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MemStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

