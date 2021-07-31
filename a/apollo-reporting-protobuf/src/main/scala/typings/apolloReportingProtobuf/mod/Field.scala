package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IField
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("apollo-reporting-protobuf", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Field instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Field instance
    */
  @scala.inline
  def create(): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  @scala.inline
  def create(properties: IField): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  
  /**
    * Decodes a Field message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  @scala.inline
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  
  /**
    * Decodes a Field message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  
  /**
    * Encodes the specified Field message. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IField): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IField, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Field message, length delimited. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IField): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IField, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Field = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Field]
  
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Field): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Field, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Field message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
