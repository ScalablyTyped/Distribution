package typings.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.IField
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Field")
@js.native
/**
  * Constructs a new Field.
  * @param [properties] Properties to set
  */
class Field ()
  extends typings.apolloEngineReportingProtobuf.protobufMod.Field {
  def this(properties: IField) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Field")
@js.native
object Field extends js.Object {
  /**
    * Creates a new Field instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Field instance
    */
  def create(): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  def create(properties: IField): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  def decode(reader: Reader, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  def decode(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  /**
    * Encodes the specified Field message. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IField): Writer = js.native
  def encode(message: IField, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Field message, length delimited. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IField): Writer = js.native
  def encodeDelimited(message: IField, writer: Writer): Writer = js.native
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloEngineReportingProtobuf.protobufMod.Field = js.native
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.Field): StringDictionary[js.Any] = js.native
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.Field, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Field message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

