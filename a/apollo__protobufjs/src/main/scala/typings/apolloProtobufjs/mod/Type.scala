package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Type")
@js.native
class Type protected () extends NamespaceBase {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.UndefOr[js.Any]]) = this()
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create(): Message[js.Object] = js.native
  def create(properties: StringDictionary[js.UndefOr[js.Any]]): Message[js.Object] = js.native
  
  /**
    * The registered constructor, if any registered, otherwise a generic constructor.
    * Assigning a function replaces the internal constructor. If the function does not extend {@link Message} yet, its prototype will be setup accordingly and static methods will be populated. If it already extends {@link Message}, it will just replace the internal constructor.
    */
  var ctor: Constructor[js.Object] = js.native
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode from
    * @param [length] Length of the message, if known beforehand
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError<{}>} If required fields are missing
    */
  def decode(reader: Reader): Message[js.Object] = js.native
  def decode(reader: Reader, length: Double): Message[js.Object] = js.native
  def decode(reader: Uint8Array): Message[js.Object] = js.native
  def decode(reader: Uint8Array, length: Double): Message[js.Object] = js.native
  
  /**
    * Decodes a message of this type preceeded by its byte length as a varint.
    * @param reader Reader or buffer to decode from
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Message[js.Object] = js.native
  def decodeDelimited(reader: Uint8Array): Message[js.Object] = js.native
  
  def encode(message: StringDictionary[js.UndefOr[js.Any]]): Writer = js.native
  def encode(message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  def encode(message: Message[js.Object]): Writer = js.native
  def encode(message: Message[js.Object], writer: Writer): Writer = js.native
  
  def encodeDelimited(message: StringDictionary[js.UndefOr[js.Any]]): Writer = js.native
  def encodeDelimited(message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type preceeded by its byte length as a varint. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  def encodeDelimited(message: Message[js.Object]): Writer = js.native
  def encodeDelimited(message: Message[js.Object], writer: Writer): Writer = js.native
  
  /** Extension ranges, if any. */
  var extensions: js.Array[js.Array[Double]] = js.native
  
  /** Message fields. */
  var fields: StringDictionary[js.UndefOr[Field]] = js.native
  
  /** Fields of this message as an array for iteration. */
  val fieldsArray: js.Array[Field] = js.native
  
  /** Message fields by id. */
  val fieldsById: NumberDictionary[js.UndefOr[Field]] = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object to convert
    * @returns Message instance
    */
  def fromObject(`object`: StringDictionary[js.UndefOr[js.Any]]): Message[js.Object] = js.native
  
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(id: Double): Boolean = js.native
  
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(name: String): Boolean = js.native
  
  /** Oneofs declared within this namespace, if any. */
  var oneofs: StringDictionary[js.UndefOr[OneOf]] = js.native
  
  /** Oneofs of this message as an array for iteration. */
  val oneofsArray: js.Array[OneOf] = js.native
  
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[Double] | String] = js.native
  
  /**
    * Sets up {@link Type#encode|encode}, {@link Type#decode|decode} and {@link Type#verify|verify}.
    * @returns `this`
    */
  def setup(): Type = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Message[js.Object]): StringDictionary[js.UndefOr[js.Any]] = js.native
  def toObject(message: Message[js.Object], options: IConversionOptions): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Verifies that field values are valid and that required fields are present.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.UndefOr[js.Any]]): Null | String = js.native
}
/* static members */
object Type {
  
  @JSImport("@apollo/protobufjs", "Type")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  @scala.inline
  def d[T /* <: Message[T] */](): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")().asInstanceOf[TypeDecorator[T]]
  @scala.inline
  def d[T /* <: Message[T] */](typeName: String): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(typeName.asInstanceOf[js.Any]).asInstanceOf[TypeDecorator[T]]
  
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  @scala.inline
  def fromJSON(name: String, json: IType): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @scala.inline
  def generateConstructor(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("generateConstructor")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
}
