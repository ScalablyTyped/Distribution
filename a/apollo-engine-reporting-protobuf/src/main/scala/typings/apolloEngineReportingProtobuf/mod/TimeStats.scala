package typings.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.ITimeStats
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "TimeStats")
@js.native
/**
  * Constructs a new TimeStats.
  * @param [properties] Properties to set
  */
class TimeStats ()
  extends typings.apolloEngineReportingProtobuf.protobufMod.TimeStats {
  def this(properties: ITimeStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "TimeStats")
@js.native
object TimeStats extends js.Object {
  /**
    * Creates a new TimeStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TimeStats instance
    */
  def create(): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  def create(properties: ITimeStats): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  /**
    * Decodes a TimeStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TimeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  def decode(reader: Reader, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  def decode(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  /**
    * Decodes a TimeStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TimeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  /**
    * Encodes the specified TimeStats message. Does not implicitly {@link TimeStats.verify|verify} messages.
    * @param message TimeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITimeStats): Writer = js.native
  def encode(message: ITimeStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TimeStats message, length delimited. Does not implicitly {@link TimeStats.verify|verify} messages.
    * @param message TimeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITimeStats): Writer = js.native
  def encodeDelimited(message: ITimeStats, writer: Writer): Writer = js.native
  /**
    * Creates a TimeStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TimeStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloEngineReportingProtobuf.protobufMod.TimeStats = js.native
  /**
    * Creates a plain object from a TimeStats message. Also converts values to other types if specified.
    * @param message TimeStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.TimeStats): StringDictionary[js.Any] = js.native
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.TimeStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TimeStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

