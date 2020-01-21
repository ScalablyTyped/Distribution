package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ParallelNode. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode")
@js.native
/**
  * Constructs a new ParallelNode.
  * @param [properties] Properties to set
  */
class ParallelNode () extends IParallelNode {
  def this(properties: IParallelNode) = this()
  /** ParallelNode nodes. */
  @JSName("nodes")
  var nodes_ParallelNode: js.Array[IQueryPlanNode] = js.native
  /**
    * Converts this ParallelNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode")
@js.native
object ParallelNode extends js.Object {
  /**
    * Creates a new ParallelNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ParallelNode instance
    */
  def create(): ParallelNode = js.native
  def create(properties: IParallelNode): ParallelNode = js.native
  /**
    * Decodes a ParallelNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ParallelNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ParallelNode = js.native
  def decode(reader: Reader, length: Double): ParallelNode = js.native
  def decode(reader: Uint8Array): ParallelNode = js.native
  def decode(reader: Uint8Array, length: Double): ParallelNode = js.native
  /**
    * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ParallelNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ParallelNode = js.native
  def decodeDelimited(reader: Uint8Array): ParallelNode = js.native
  /**
    * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
    * @param message ParallelNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IParallelNode): Writer = js.native
  def encode(message: IParallelNode, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
    * @param message ParallelNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IParallelNode): Writer = js.native
  def encodeDelimited(message: IParallelNode, writer: Writer): Writer = js.native
  /**
    * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ParallelNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): ParallelNode = js.native
  /**
    * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
    * @param message ParallelNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ParallelNode): StringDictionary[js.Any] = js.native
  def toObject(message: ParallelNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ParallelNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

