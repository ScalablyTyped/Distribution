package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.IQueryStats
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "QueryStats")
@js.native
/**
  * Constructs a new QueryStats.
  * @param [properties] Properties to set
  */
class QueryStats ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats {
  def this(properties: IQueryStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "QueryStats")
@js.native
object QueryStats extends js.Object {
  /**
    * Creates a new QueryStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryStats instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  def create(properties: IQueryStats): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  /**
    * Decodes a QueryStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  /**
    * Decodes a QueryStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  /**
    * Encodes the specified QueryStats message. Does not implicitly {@link QueryStats.verify|verify} messages.
    * @param message QueryStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryStats): Writer = js.native
  def encode(message: IQueryStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QueryStats message, length delimited. Does not implicitly {@link QueryStats.verify|verify} messages.
    * @param message QueryStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryStats): Writer = js.native
  def encodeDelimited(message: IQueryStats, writer: Writer): Writer = js.native
  /**
    * Creates a QueryStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats = js.native
  /**
    * Creates a plain object from a QueryStats message. Also converts values to other types if specified.
    * @param message QueryStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.QueryStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

