package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "QueryLatencyStats")
@js.native
/**
  * Constructs a new QueryLatencyStats.
  * @param [properties] Properties to set
  */
class QueryLatencyStats () extends IQueryLatencyStats {
  def this(properties: IQueryLatencyStats) = this()
  /** QueryLatencyStats cacheHits. */
  @JSName("cacheHits")
  var cacheHits_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats cacheLatencyCount. */
  @JSName("cacheLatencyCount")
  var cacheLatencyCount_QueryLatencyStats: js.Array[Double] = js.native
  /** QueryLatencyStats forbiddenOperationCount. */
  @JSName("forbiddenOperationCount")
  var forbiddenOperationCount_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats latencyCount. */
  @JSName("latencyCount")
  var latencyCount_QueryLatencyStats: js.Array[Double] = js.native
  /** QueryLatencyStats persistedQueryHits. */
  @JSName("persistedQueryHits")
  var persistedQueryHits_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats persistedQueryMisses. */
  @JSName("persistedQueryMisses")
  var persistedQueryMisses_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats privateCacheTtlCount. */
  @JSName("privateCacheTtlCount")
  var privateCacheTtlCount_QueryLatencyStats: js.Array[Double] = js.native
  /** QueryLatencyStats publicCacheTtlCount. */
  @JSName("publicCacheTtlCount")
  var publicCacheTtlCount_QueryLatencyStats: js.Array[Double] = js.native
  /** QueryLatencyStats registeredOperationCount. */
  @JSName("registeredOperationCount")
  var registeredOperationCount_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats requestCount. */
  @JSName("requestCount")
  var requestCount_QueryLatencyStats: Double = js.native
  /** QueryLatencyStats requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_QueryLatencyStats: Double = js.native
  /**
    * Converts this QueryLatencyStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "QueryLatencyStats")
@js.native
object QueryLatencyStats extends js.Object {
  /**
    * Creates a new QueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryLatencyStats instance
    */
  def create(): QueryLatencyStats = js.native
  def create(properties: IQueryLatencyStats): QueryLatencyStats = js.native
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QueryLatencyStats = js.native
  def decode(reader: Reader, length: Double): QueryLatencyStats = js.native
  def decode(reader: Uint8Array): QueryLatencyStats = js.native
  def decode(reader: Uint8Array, length: Double): QueryLatencyStats = js.native
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QueryLatencyStats = js.native
  def decodeDelimited(reader: Uint8Array): QueryLatencyStats = js.native
  /**
    * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryLatencyStats): Writer = js.native
  def encode(message: IQueryLatencyStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryLatencyStats): Writer = js.native
  def encodeDelimited(message: IQueryLatencyStats, writer: Writer): Writer = js.native
  /**
    * Creates a QueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryLatencyStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): QueryLatencyStats = js.native
  /**
    * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
    * @param message QueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QueryLatencyStats): StringDictionary[js.Any] = js.native
  def toObject(message: QueryLatencyStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

