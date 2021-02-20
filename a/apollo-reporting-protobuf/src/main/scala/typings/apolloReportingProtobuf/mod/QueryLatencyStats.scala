package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IQueryLatencyStats
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "QueryLatencyStats")
@js.native
/**
  * Constructs a new QueryLatencyStats.
  * @param [properties] Properties to set
  */
class QueryLatencyStats ()
  extends typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats {
  def this(properties: IQueryLatencyStats) = this()
}
/* static members */
object QueryLatencyStats {
  
  /**
    * Creates a new QueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryLatencyStats instance
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.create")
  @js.native
  def create(properties: IQueryLatencyStats): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  
  /**
    * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.encode")
  @js.native
  def encode(message: IQueryLatencyStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.encode")
  @js.native
  def encode(message: IQueryLatencyStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IQueryLatencyStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IQueryLatencyStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a QueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryLatencyStats
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats = js.native
  
  /**
    * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
    * @param message QueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.toObject")
  @js.native
  def toObject(
    message: typings.apolloReportingProtobuf.protobufMod.QueryLatencyStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a QueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
