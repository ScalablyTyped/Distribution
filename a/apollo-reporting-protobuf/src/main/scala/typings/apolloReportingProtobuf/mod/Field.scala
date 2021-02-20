package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IField
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "Field")
@js.native
/**
  * Constructs a new Field.
  * @param [properties] Properties to set
  */
class Field ()
  extends typings.apolloReportingProtobuf.protobufMod.Field {
  def this(properties: IField) = this()
}
/* static members */
object Field {
  
  /**
    * Creates a new Field instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Field instance
    */
  @JSImport("apollo-reporting-protobuf", "Field.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  @JSImport("apollo-reporting-protobuf", "Field.create")
  @js.native
  def create(properties: IField): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  
  /**
    * Decodes a Field message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "Field.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  @JSImport("apollo-reporting-protobuf", "Field.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  @JSImport("apollo-reporting-protobuf", "Field.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  @JSImport("apollo-reporting-protobuf", "Field.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  
  /**
    * Decodes a Field message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "Field.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  @JSImport("apollo-reporting-protobuf", "Field.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  
  /**
    * Encodes the specified Field message. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "Field.encode")
  @js.native
  def encode(message: IField): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "Field.encode")
  @js.native
  def encode(message: IField, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Field message, length delimited. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "Field.encodeDelimited")
  @js.native
  def encodeDelimited(message: IField): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "Field.encodeDelimited")
  @js.native
  def encodeDelimited(message: IField, writer: Writer): Writer = js.native
  
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  @JSImport("apollo-reporting-protobuf", "Field.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Field = js.native
  
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "Field.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Field): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "Field.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Field, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Field message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "Field.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
