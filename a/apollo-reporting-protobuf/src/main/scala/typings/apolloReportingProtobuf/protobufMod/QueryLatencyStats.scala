package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "QueryLatencyStats")
@js.native
/**
  * Constructs a new QueryLatencyStats.
  * @param [properties] Properties to set
  */
class QueryLatencyStats ()
  extends StObject
     with IQueryLatencyStats {
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
object QueryLatencyStats {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "QueryLatencyStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryLatencyStats instance
    */
  inline def create(): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryLatencyStats]
  inline def create(properties: IQueryLatencyStats): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  inline def decode(reader: Reader, length: Double): QueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryLatencyStats]
  inline def decode(reader: Uint8Array): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  inline def decode(reader: Uint8Array, length: Double): QueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryLatencyStats]
  
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  inline def decodeDelimited(reader: Uint8Array): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  
  /**
    * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a QueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryLatencyStats
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryLatencyStats]
  
  /**
    * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
    * @param message QueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: QueryLatencyStats): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: QueryLatencyStats, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a QueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
