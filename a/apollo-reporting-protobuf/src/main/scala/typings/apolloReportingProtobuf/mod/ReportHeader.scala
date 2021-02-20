package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IReportHeader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "ReportHeader")
@js.native
/**
  * Constructs a new ReportHeader.
  * @param [properties] Properties to set
  */
class ReportHeader ()
  extends typings.apolloReportingProtobuf.protobufMod.ReportHeader {
  def this(properties: IReportHeader) = this()
}
/* static members */
object ReportHeader {
  
  /**
    * Creates a new ReportHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReportHeader instance
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.create")
  @js.native
  def create(properties: IReportHeader): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  
  /**
    * Decodes a ReportHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  
  /**
    * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  
  /**
    * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.encode")
  @js.native
  def encode(message: IReportHeader): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.encode")
  @js.native
  def encode(message: IReportHeader, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReportHeader): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReportHeader, writer: Writer): Writer = js.native
  
  /**
    * Creates a ReportHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReportHeader
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.ReportHeader = js.native
  
  /**
    * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
    * @param message ReportHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.ReportHeader): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "ReportHeader.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.ReportHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ReportHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "ReportHeader.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
