package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IQueryPlanNode
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SequenceNode. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode")
@js.native
/**
  * Constructs a new SequenceNode.
  * @param [properties] Properties to set
  */
class SequenceNode () extends ISequenceNode {
  def this(properties: ISequenceNode) = this()
  /** SequenceNode nodes. */
  @JSName("nodes")
  var nodes_SequenceNode: js.Array[IQueryPlanNode] = js.native
  /**
    * Converts this SequenceNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode")
@js.native
object SequenceNode extends js.Object {
  /**
    * Creates a new SequenceNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SequenceNode instance
    */
  def create(): SequenceNode = js.native
  def create(properties: ISequenceNode): SequenceNode = js.native
  /**
    * Decodes a SequenceNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SequenceNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SequenceNode = js.native
  def decode(reader: Reader, length: Double): SequenceNode = js.native
  def decode(reader: Uint8Array): SequenceNode = js.native
  def decode(reader: Uint8Array, length: Double): SequenceNode = js.native
  /**
    * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SequenceNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SequenceNode = js.native
  def decodeDelimited(reader: Uint8Array): SequenceNode = js.native
  /**
    * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
    * @param message SequenceNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISequenceNode): Writer = js.native
  def encode(message: ISequenceNode, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
    * @param message SequenceNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISequenceNode): Writer = js.native
  def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = js.native
  /**
    * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SequenceNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): SequenceNode = js.native
  /**
    * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
    * @param message SequenceNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SequenceNode): StringDictionary[js.Any] = js.native
  def toObject(message: SequenceNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SequenceNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

