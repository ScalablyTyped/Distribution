package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Properties
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] ()
  extends typings.apolloProtobufjs.mod.Message[T] {
  def this(properties: Properties[T]) = this()
}
/* static members */
@JSImport("@apollo/protobufjs/light", "Message")
@js.native
object Message extends js.Object {
  
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: typings.apolloProtobufjs.mod.Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: typings.apolloProtobufjs.mod.Message[T] */](): typings.apolloProtobufjs.mod.Message[T] = js.native
  def create[T /* <: typings.apolloProtobufjs.mod.Message[T] */](properties: StringDictionary[js.UndefOr[js.Any]]): typings.apolloProtobufjs.mod.Message[T] = js.native
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](reader: typings.apolloProtobufjs.mod.Reader): T = js.native
  def decode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](reader: typings.apolloProtobufjs.mod.Reader): T = js.native
  def decodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T): typings.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T, writer: typings.apolloProtobufjs.mod.Writer): typings.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.UndefOr[js.Any]]): typings.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.UndefOr[js.Any]], writer: typings.apolloProtobufjs.mod.Writer): typings.apolloProtobufjs.mod.Writer = js.native
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T): typings.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T, writer: typings.apolloProtobufjs.mod.Writer): typings.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.UndefOr[js.Any]]): typings.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.UndefOr[js.Any]], writer: typings.apolloProtobufjs.mod.Writer): typings.apolloProtobufjs.mod.Writer = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: typings.apolloProtobufjs.mod.Message[T] */](`object`: StringDictionary[js.UndefOr[js.Any]]): T = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T): StringDictionary[js.UndefOr[js.Any]] = js.native
  def toObject[T /* <: typings.apolloProtobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.UndefOr[js.Any]]): String | Null = js.native
}
