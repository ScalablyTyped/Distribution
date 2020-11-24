package typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new QueryPlanNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryPlanNode instance
    */
  def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def create(properties: IQueryPlanNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Decodes a QueryPlanNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryPlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryPlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
    * @param message QueryPlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryPlanNode): Writer = js.native
  def encode(message: IQueryPlanNode, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
    * @param message QueryPlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryPlanNode): Writer = js.native
  def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = js.native
  
  /**
    * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryPlanNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
    * @param message QueryPlanNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a QueryPlanNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
