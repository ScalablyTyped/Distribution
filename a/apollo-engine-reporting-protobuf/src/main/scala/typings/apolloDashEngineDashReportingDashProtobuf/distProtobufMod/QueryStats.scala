package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "QueryStats")
@js.native
/**
  * Constructs a new QueryStats.
  * @param [properties] Properties to set
  */
class QueryStats () extends IQueryStats {
  def this(properties: IQueryStats) = this()
  /** QueryStats perClientName. */
  @JSName("perClientName")
  var perClientName_QueryStats: StringDictionary[IClientNameStats] = js.native
  /** QueryStats perTypeStat. */
  @JSName("perTypeStat")
  var perTypeStat_QueryStats: StringDictionary[ITypeStat] = js.native
  /** QueryStats perType. */
  @JSName("perType")
  var perType_QueryStats: js.Array[ITypeStat] = js.native
  /** QueryStats queryStatsWithContext. */
  @JSName("queryStatsWithContext")
  var queryStatsWithContext_QueryStats: js.Array[IContextualizedQueryLatencyStats] = js.native
  /** QueryStats typeStatsWithContext. */
  @JSName("typeStatsWithContext")
  var typeStatsWithContext_QueryStats: js.Array[IContextualizedTypeStats] = js.native
  /**
    * Converts this QueryStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "QueryStats")
@js.native
object QueryStats extends js.Object {
  /**
    * Creates a new QueryStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryStats instance
    */
  def create(): QueryStats = js.native
  def create(properties: IQueryStats): QueryStats = js.native
  /**
    * Decodes a QueryStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QueryStats = js.native
  def decode(reader: Reader, length: Double): QueryStats = js.native
  def decode(reader: Uint8Array): QueryStats = js.native
  def decode(reader: Uint8Array, length: Double): QueryStats = js.native
  /**
    * Decodes a QueryStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QueryStats = js.native
  def decodeDelimited(reader: Uint8Array): QueryStats = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): QueryStats = js.native
  /**
    * Creates a plain object from a QueryStats message. Also converts values to other types if specified.
    * @param message QueryStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QueryStats): StringDictionary[js.Any] = js.native
  def toObject(message: QueryStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

