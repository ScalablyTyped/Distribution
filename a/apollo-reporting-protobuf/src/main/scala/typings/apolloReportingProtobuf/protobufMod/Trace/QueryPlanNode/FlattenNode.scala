package typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FlattenNode. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode")
@js.native
/**
  * Constructs a new FlattenNode.
  * @param [properties] Properties to set
  */
class FlattenNode () extends IFlattenNode {
  def this(properties: IFlattenNode) = this()
  
  /** FlattenNode responsePath. */
  @JSName("responsePath")
  var responsePath_FlattenNode: js.Array[IResponsePathElement] = js.native
  
  /**
    * Converts this FlattenNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode")
@js.native
object FlattenNode extends js.Object {
  
  /**
    * Creates a new FlattenNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FlattenNode instance
    */
  def create(): FlattenNode = js.native
  def create(properties: IFlattenNode): FlattenNode = js.native
  
  /**
    * Decodes a FlattenNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FlattenNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FlattenNode = js.native
  def decode(reader: Reader, length: Double): FlattenNode = js.native
  def decode(reader: Uint8Array): FlattenNode = js.native
  def decode(reader: Uint8Array, length: Double): FlattenNode = js.native
  
  /**
    * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FlattenNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FlattenNode = js.native
  def decodeDelimited(reader: Uint8Array): FlattenNode = js.native
  
  /**
    * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
    * @param message FlattenNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFlattenNode): Writer = js.native
  def encode(message: IFlattenNode, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
    * @param message FlattenNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFlattenNode): Writer = js.native
  def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = js.native
  
  /**
    * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FlattenNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): FlattenNode = js.native
  
  /**
    * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
    * @param message FlattenNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FlattenNode): StringDictionary[js.Any] = js.native
  def toObject(message: FlattenNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FlattenNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
