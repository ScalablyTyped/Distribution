package typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.HTTP")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new HTTP instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HTTP instance
    */
  def create(): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def create(properties: IHTTP): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  /**
    * Decodes a HTTP message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: Reader, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  /**
    * Decodes a HTTP message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  /**
    * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHTTP): Writer = js.native
  def encode(message: IHTTP, writer: Writer): Writer = js.native
  /**
    * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHTTP): Writer = js.native
  def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
  /**
    * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HTTP
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  /**
    * Creates a plain object from a HTTP message. Also converts values to other types if specified.
    * @param message HTTP
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP): StringDictionary[js.Any] = js.native
  def toObject(message: typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a HTTP message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

