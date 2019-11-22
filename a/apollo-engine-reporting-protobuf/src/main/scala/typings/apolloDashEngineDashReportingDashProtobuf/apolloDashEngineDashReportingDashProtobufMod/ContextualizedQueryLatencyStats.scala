package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.IContextualizedQueryLatencyStats
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "ContextualizedQueryLatencyStats")
@js.native
/**
  * Constructs a new ContextualizedQueryLatencyStats.
  * @param [properties] Properties to set
  */
class ContextualizedQueryLatencyStats ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats {
  def this(properties: IContextualizedQueryLatencyStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "ContextualizedQueryLatencyStats")
@js.native
object ContextualizedQueryLatencyStats extends js.Object {
  /**
    * Creates a new ContextualizedQueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedQueryLatencyStats instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  def create(properties: IContextualizedQueryLatencyStats): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IContextualizedQueryLatencyStats): Writer = js.native
  def encode(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message, length delimited. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IContextualizedQueryLatencyStats): Writer = js.native
  def encodeDelimited(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = js.native
  /**
    * Creates a ContextualizedQueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedQueryLatencyStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Creates a plain object from a ContextualizedQueryLatencyStats message. Also converts values to other types if specified.
    * @param message ContextualizedQueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ContextualizedQueryLatencyStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ContextualizedQueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

