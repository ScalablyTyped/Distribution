package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.generatedProtobufMod.IReportHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "ReportHeader")
@js.native
/**
  * Constructs a new ReportHeader.
  * @param [properties] Properties to set
  */
open class ReportHeader ()
  extends typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader {
  def this(properties: IReportHeader) = this()
}
/* static members */
object ReportHeader {
  
  @JSImport("apollo-reporting-protobuf", "ReportHeader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ReportHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReportHeader instance
    */
  inline def create(): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  inline def create(properties: IReportHeader): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  /**
    * Decodes a ReportHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  /**
    * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader]
  
  /**
    * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IReportHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IReportHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IReportHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IReportHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
    * @param message ReportHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.apolloReportingProtobuf.generatedProtobufMod.ReportHeader,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ReportHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
