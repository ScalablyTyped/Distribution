package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "ContextualizedQueryLatencyStats")
@js.native
/**
  * Constructs a new ContextualizedQueryLatencyStats.
  * @param [properties] Properties to set
  */
class ContextualizedQueryLatencyStats ()
  extends StObject
     with IContextualizedQueryLatencyStats {
  def this(properties: IContextualizedQueryLatencyStats) = this()
  
  /**
    * Converts this ContextualizedQueryLatencyStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ContextualizedQueryLatencyStats {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "ContextualizedQueryLatencyStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ContextualizedQueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedQueryLatencyStats instance
    */
  inline def create(): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ContextualizedQueryLatencyStats]
  inline def create(properties: IContextualizedQueryLatencyStats): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  inline def decode(reader: Reader, length: Double): ContextualizedQueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedQueryLatencyStats]
  inline def decode(reader: Uint8Array): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  inline def decode(reader: Uint8Array, length: Double): ContextualizedQueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedQueryLatencyStats]
  
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  inline def decodeDelimited(reader: Uint8Array): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IContextualizedQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message, length delimited. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IContextualizedQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ContextualizedQueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedQueryLatencyStats
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ContextualizedQueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ContextualizedQueryLatencyStats]
  
  /**
    * Creates a plain object from a ContextualizedQueryLatencyStats message. Also converts values to other types if specified.
    * @param message ContextualizedQueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ContextualizedQueryLatencyStats): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ContextualizedQueryLatencyStats, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ContextualizedQueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
