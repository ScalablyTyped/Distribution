package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FetchNode. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode")
@js.native
/**
  * Constructs a new FetchNode.
  * @param [properties] Properties to set
  */
class FetchNode () extends IFetchNode {
  def this(properties: IFetchNode) = this()
  /** FetchNode sentTimeOffset. */
  @JSName("sentTimeOffset")
  var sentTimeOffset_FetchNode: Double = js.native
  /** FetchNode serviceName. */
  @JSName("serviceName")
  var serviceName_FetchNode: String = js.native
  /** FetchNode traceParsingFailed. */
  @JSName("traceParsingFailed")
  var traceParsingFailed_FetchNode: Boolean = js.native
  /**
    * Converts this FetchNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode")
@js.native
object FetchNode extends js.Object {
  /**
    * Creates a new FetchNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FetchNode instance
    */
  def create(): FetchNode = js.native
  def create(properties: IFetchNode): FetchNode = js.native
  /**
    * Decodes a FetchNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FetchNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FetchNode = js.native
  def decode(reader: Reader, length: Double): FetchNode = js.native
  def decode(reader: Uint8Array): FetchNode = js.native
  def decode(reader: Uint8Array, length: Double): FetchNode = js.native
  /**
    * Decodes a FetchNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FetchNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FetchNode = js.native
  def decodeDelimited(reader: Uint8Array): FetchNode = js.native
  /**
    * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
    * @param message FetchNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFetchNode): Writer = js.native
  def encode(message: IFetchNode, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
    * @param message FetchNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFetchNode): Writer = js.native
  def encodeDelimited(message: IFetchNode, writer: Writer): Writer = js.native
  /**
    * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FetchNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): FetchNode = js.native
  /**
    * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
    * @param message FetchNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FetchNode): StringDictionary[js.Any] = js.native
  def toObject(message: FetchNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FetchNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

