package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IStatsContext
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "StatsContext")
@js.native
/**
  * Constructs a new StatsContext.
  * @param [properties] Properties to set
  */
class StatsContext ()
  extends typings.apolloReportingProtobuf.protobufMod.StatsContext {
  def this(properties: IStatsContext) = this()
}
/* static members */
object StatsContext {
  
  @JSImport("apollo-reporting-protobuf", "StatsContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StatsContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsContext instance
    */
  inline def create(): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  inline def create(properties: IStatsContext): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  
  /**
    * Decodes a StatsContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.StatsContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.StatsContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  
  /**
    * Decodes a StatsContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  
  /**
    * Encodes the specified StatsContext message. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IStatsContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStatsContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StatsContext message, length delimited. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IStatsContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStatsContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StatsContext message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsContext
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.StatsContext]
  
  /**
    * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
    * @param message StatsContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.StatsContext): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.StatsContext, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StatsContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
