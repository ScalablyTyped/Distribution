package typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.fieldName
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.index
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ResponsePathElement. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement")
@js.native
/**
  * Constructs a new ResponsePathElement.
  * @param [properties] Properties to set
  */
class ResponsePathElement () extends IResponsePathElement {
  def this(properties: IResponsePathElement) = this()
  
  /** ResponsePathElement fieldName. */
  @JSName("fieldName")
  var fieldName_ResponsePathElement: String = js.native
  
  /** ResponsePathElement id. */
  var id: js.UndefOr[fieldName | index] = js.native
  
  /** ResponsePathElement index. */
  @JSName("index")
  var index_ResponsePathElement: Double = js.native
  
  /**
    * Converts this ResponsePathElement to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement")
@js.native
object ResponsePathElement extends js.Object {
  
  /**
    * Creates a new ResponsePathElement instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResponsePathElement instance
    */
  def create(): ResponsePathElement = js.native
  def create(properties: IResponsePathElement): ResponsePathElement = js.native
  
  /**
    * Decodes a ResponsePathElement message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResponsePathElement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ResponsePathElement = js.native
  def decode(reader: Reader, length: Double): ResponsePathElement = js.native
  def decode(reader: Uint8Array): ResponsePathElement = js.native
  def decode(reader: Uint8Array, length: Double): ResponsePathElement = js.native
  
  /**
    * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResponsePathElement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ResponsePathElement = js.native
  def decodeDelimited(reader: Uint8Array): ResponsePathElement = js.native
  
  /**
    * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
    * @param message ResponsePathElement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IResponsePathElement): Writer = js.native
  def encode(message: IResponsePathElement, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
    * @param message ResponsePathElement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IResponsePathElement): Writer = js.native
  def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = js.native
  
  /**
    * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResponsePathElement
    */
  def fromObject(`object`: StringDictionary[js.Any]): ResponsePathElement = js.native
  
  /**
    * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
    * @param message ResponsePathElement
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ResponsePathElement): StringDictionary[js.Any] = js.native
  def toObject(message: ResponsePathElement, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ResponsePathElement message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
