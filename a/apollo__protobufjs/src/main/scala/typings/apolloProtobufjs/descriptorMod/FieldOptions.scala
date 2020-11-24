package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.AnyNestedObject
import typings.apolloProtobufjs.mod.Constructor
import typings.apolloProtobufjs.mod.Enum
import typings.apolloProtobufjs.mod.Field
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.INamespace
import typings.apolloProtobufjs.mod.IToJSONOptions
import typings.apolloProtobufjs.mod.IType
import typings.apolloProtobufjs.mod.Message
import typings.apolloProtobufjs.mod.Namespace
import typings.apolloProtobufjs.mod.OneOf
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.ReflectionObject
import typings.apolloProtobufjs.mod.Root
import typings.apolloProtobufjs.mod.Service
import typings.apolloProtobufjs.mod.Type
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/ext/descriptor", "FieldOptions")
@js.native
object FieldOptions extends js.Object {
  
  var CType: Enum = js.native
  
  var JSType: Enum = js.native
  
  /**
    * Adds a nested object to this namespace.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name
    */
  def add(`object`: ReflectionObject): Namespace = js.native
  
  /**
    * Adds nested objects to this namespace from nested object descriptors.
    * @param nestedJson Any nested object descriptors
    * @returns `this`
    */
  def addJSON(nestedJson: StringDictionary[js.UndefOr[AnyNestedObject]]): Namespace = js.native
  
  /**
    * Adds a nested object to this type.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name or, if a field, when there is already a field with this id
    */
  @JSName("add")
  def add_Type(`object`: ReflectionObject): Type = js.native
  
  /** Comment text, if any. */
  var comment: String | Null = js.native
  
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
  
  /**
    * Defines additial namespaces within this one if not yet existing.
    * @param path Path to create
    * @param [json] Nested types to create from JSON
    * @returns Pointer to the last namespace created or `this` if path is empty
    */
  def define(path: String): Namespace = js.native
  def define(path: String, json: js.Any): Namespace = js.native
  def define(path: js.Array[String]): Namespace = js.native
  def define(path: js.Array[String], json: js.Any): Namespace = js.native
  
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
  
  /** Defining file name. */
  var filename: String | Null = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object to convert
    * @returns Message instance
    */
  def fromObject(`object`: StringDictionary[js.UndefOr[js.Any]]): Message[js.Object] = js.native
  
  /** Full name including leading dot. */
  val fullName: String = js.native
  
  /**
    * Gets the nested object of the specified name.
    * @param name Nested object name
    * @returns The reflection object or `null` if it doesn't exist
    */
  def get(name: String): ReflectionObject | Null = js.native
  
  /**
    * Gets the values of the nested {@link Enum|enum} of the specified name.
    * This methods differs from {@link Namespace#get|get} in that it returns an enum's values directly and throws instead of returning `null`.
    * @param name Nested enum name
    * @returns Enum values
    * @throws {Error} If there is no such enum
    */
  def getEnum(name: String): StringDictionary[js.UndefOr[Double]] = js.native
  
  /**
    * Gets an option value.
    * @param name Option name
    * @returns Option value or `undefined` if not set
    */
  def getOption(name: String): js.Any = js.native
  
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
  
  /**
    * Looks up the reflection object at the specified path, relative to this namespace.
    * @param path Path to look up
    * @param [parentAlreadyChecked=false] Whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: String): ReflectionObject | Null = js.native
  /**
    * Recursively looks up the reflection object matching the specified path in the scope of this namespace.
    * @param path Path to look up
    * @param filterTypes Filter types, any combination of the constructors of `protobuf.Type`, `protobuf.Enum`, `protobuf.Service` etc.
    * @param [parentAlreadyChecked=false] If known, whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: String, filterTypes: js.Any): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: js.Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: js.Array[_]): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: js.Array[_], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: String, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String]): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Any): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[_]): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[_], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  
  /**
    * Looks up the values of the {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up enum
    * @throws {Error} If `path` does not point to an enum
    */
  def lookupEnum(path: String): Enum = js.native
  def lookupEnum(path: js.Array[String]): Enum = js.native
  
  /**
    * Looks up the {@link Service|service} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up service
    * @throws {Error} If `path` does not point to a service
    */
  def lookupService(path: String): Service = js.native
  def lookupService(path: js.Array[String]): Service = js.native
  
  /**
    * Looks up the {@link Type|type} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type
    * @throws {Error} If `path` does not point to a type
    */
  def lookupType(path: String): Type = js.native
  def lookupType(path: js.Array[String]): Type = js.native
  
  /**
    * Looks up the {@link Type|type} or {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type or enum
    * @throws {Error} If `path` does not point to a type or enum
    */
  def lookupTypeOrEnum(path: String): Type = js.native
  def lookupTypeOrEnum(path: js.Array[String]): Type = js.native
  
  /** Unique name within its namespace. */
  var name: String = js.native
  
  /** Nested objects by name. */
  var nested: js.UndefOr[StringDictionary[js.UndefOr[ReflectionObject]]] = js.native
  
  /** Nested objects of this namespace as an array for iteration. */
  val nestedArray: js.Array[ReflectionObject] = js.native
  
  /**
    * Called when this object is added to a parent.
    * @param parent Parent added to
    */
  def onAdd(parent: ReflectionObject): Unit = js.native
  
  /**
    * Called when this object is removed from a parent.
    * @param parent Parent removed from
    */
  def onRemove(parent: ReflectionObject): Unit = js.native
  
  /** Oneofs declared within this namespace, if any. */
  var oneofs: StringDictionary[js.UndefOr[OneOf]] = js.native
  
  /** Oneofs of this message as an array for iteration. */
  val oneofsArray: js.Array[OneOf] = js.native
  
  /** Options. */
  var options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.native
  
  /** Parent namespace. */
  var parent: Namespace | Null = js.native
  
  /**
    * Removes a nested object from this namespace.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this namespace
    */
  def remove(`object`: ReflectionObject): Namespace = js.native
  /**
    * Removes a nested object from this type.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this type
    */
  @JSName("remove")
  def remove_Type(`object`: ReflectionObject): Type = js.native
  
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[Double] | String] = js.native
  
  /**
    * Resolves this objects type references.
    * @returns `this`
    */
  def resolve(): ReflectionObject = js.native
  
  /**
    * Resolves this namespace's and all its nested objects' type references. Useful to validate a reflection tree, but comes at a cost.
    * @returns `this`
    */
  def resolveAll(): Namespace = js.native
  
  /** Whether already resolved or not. */
  var resolved: Boolean = js.native
  
  /** Reference to the root namespace. */
  val root: Root = js.native
  
  /**
    * Sets an option.
    * @param name Option name
    * @param value Option value
    * @param [ifNotSet] Sets the option only if it isn't currently set
    * @returns `this`
    */
  def setOption(name: String, value: js.Any): ReflectionObject = js.native
  def setOption(name: String, value: js.Any, ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets multiple options.
    * @param options Options to set
    * @param [ifNotSet] Sets an option only if it isn't currently set
    * @returns `this`
    */
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]]): ReflectionObject = js.native
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]], ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets up {@link Type#encode|encode}, {@link Type#decode|decode} and {@link Type#verify|verify}.
    * @returns `this`
    */
  def setup(): Type = js.native
  
  /**
    * Converts this namespace to a namespace descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Namespace descriptor
    */
  def toJSON(): INamespace = js.native
  def toJSON(toJSONOptions: IToJSONOptions): INamespace = js.native
  /**
    * Converts this message type to a message type descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Message type descriptor
    */
  @JSName("toJSON")
  def toJSON_IType(): IType = js.native
  @JSName("toJSON")
  def toJSON_IType(toJSONOptions: IToJSONOptions): IType = js.native
  /**
    * Converts this reflection object to its descriptor representation.
    * @returns Descriptor
    */
  @JSName("toJSON")
  def toJSON_StringDictionary(): StringDictionary[js.UndefOr[js.Any]] = js.native
  
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
