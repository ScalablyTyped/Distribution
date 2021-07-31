package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "ContextualizedTypeStats")
@js.native
/**
  * Constructs a new ContextualizedTypeStats.
  * @param [properties] Properties to set
  */
class ContextualizedTypeStats ()
  extends StObject
     with IContextualizedTypeStats {
  def this(properties: IContextualizedTypeStats) = this()
  
  /** ContextualizedTypeStats perTypeStat. */
  @JSName("perTypeStat")
  var perTypeStat_ContextualizedTypeStats: StringDictionary[ITypeStat] = js.native
  
  /**
    * Converts this ContextualizedTypeStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ContextualizedTypeStats {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "ContextualizedTypeStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ContextualizedTypeStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedTypeStats instance
    */
  @scala.inline
  def create(): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ContextualizedTypeStats]
  @scala.inline
  def create(properties: IContextualizedTypeStats): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  @scala.inline
  def decode(reader: Reader, length: Double): ContextualizedTypeStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedTypeStats]
  @scala.inline
  def decode(reader: Uint8Array): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ContextualizedTypeStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedTypeStats]
  
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  
  /**
    * Encodes the specified ContextualizedTypeStats message. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IContextualizedTypeStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IContextualizedTypeStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ContextualizedTypeStats message, length delimited. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IContextualizedTypeStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IContextualizedTypeStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ContextualizedTypeStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedTypeStats
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  
  /**
    * Creates a plain object from a ContextualizedTypeStats message. Also converts values to other types if specified.
    * @param message ContextualizedTypeStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ContextualizedTypeStats): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ContextualizedTypeStats, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ContextualizedTypeStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
