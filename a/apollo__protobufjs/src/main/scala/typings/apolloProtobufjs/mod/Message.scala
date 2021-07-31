package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] () extends StObject {
  def this(properties: Properties[T]) = this()
  
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: Type = js.native
  
  /**
    * Converts this message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.UndefOr[js.Any]] = js.native
}
/* static members */
object Message {
  
  @JSImport("@apollo/protobufjs", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  /** Reference to the reflected type. */
  @JSImport("@apollo/protobufjs", "Message.$type")
  @js.native
  val $type: Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  @scala.inline
  def create[T /* <: Message[T] */](): Message[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Message[T]]
  @scala.inline
  def create[T /* <: Message[T] */](properties: StringDictionary[js.UndefOr[js.Any]]): Message[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Message[T]]
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @scala.inline
  def decode[T /* <: Message[T] */](reader: Reader): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def decode[T /* <: Message[T] */](reader: Uint8Array): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @scala.inline
  def decodeDelimited[T /* <: Message[T] */](reader: Reader): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def decodeDelimited[T /* <: Message[T] */](reader: Uint8Array): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @scala.inline
  def encode[T /* <: Message[T] */](message: T): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode[T /* <: Message[T] */](message: T, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  @scala.inline
  def encode[T /* <: Message[T] */](message: StringDictionary[js.UndefOr[js.Any]]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode[T /* <: Message[T] */](message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited[T /* <: Message[T] */](message: T): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited[T /* <: Message[T] */](message: T, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[js.UndefOr[js.Any]]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  @scala.inline
  def fromObject[T /* <: Message[T] */](`object`: StringDictionary[js.UndefOr[js.Any]]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject[T /* <: Message[T] */](message: T): StringDictionary[js.UndefOr[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[js.Any]]]
  @scala.inline
  def toObject[T /* <: Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.UndefOr[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.UndefOr[js.Any]]]
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.UndefOr[js.Any]]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
