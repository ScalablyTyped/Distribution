package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/generated/protobuf", "StatsContext")
@js.native
/**
  * Constructs a new StatsContext.
  * @param [properties] Properties to set
  */
open class StatsContext ()
  extends StObject
     with IStatsContext {
  def this(properties: IStatsContext) = this()
  
  /** StatsContext clientName. */
  @JSName("clientName")
  var clientName_StatsContext: String = js.native
  
  /** StatsContext clientVersion. */
  @JSName("clientVersion")
  var clientVersion_StatsContext: String = js.native
  
  /**
    * Converts this StatsContext to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object StatsContext {
  
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "StatsContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StatsContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsContext instance
    */
  inline def create(): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StatsContext]
  inline def create(properties: IStatsContext): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StatsContext]
  
  inline def decode(reader: js.typedarray.Uint8Array): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StatsContext]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StatsContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StatsContext]
  /**
    * Decodes a StatsContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StatsContext]
  inline def decode(reader: Reader, length: Double): StatsContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StatsContext]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StatsContext]
  /**
    * Decodes a StatsContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): StatsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StatsContext]
  
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
    * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
    * @param message StatsContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: StatsContext): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StatsContext, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StatsContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
