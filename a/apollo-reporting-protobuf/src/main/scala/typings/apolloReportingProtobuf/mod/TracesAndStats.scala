package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.generatedProtobufMod.ITracesAndStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "TracesAndStats")
@js.native
/**
  * Constructs a new TracesAndStats.
  * @param [properties] Properties to set
  */
open class TracesAndStats ()
  extends typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats {
  def this(properties: ITracesAndStats) = this()
}
/* static members */
object TracesAndStats {
  
  @JSImport("apollo-reporting-protobuf", "TracesAndStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  inline def create(): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  inline def create(properties: ITracesAndStats): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats]
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITracesAndStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITracesAndStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITracesAndStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.apolloReportingProtobuf.generatedProtobufMod.TracesAndStats,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
