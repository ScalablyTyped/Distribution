package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.AnyNestedObject
import typings.apolloProtobufjs.mod.Codegen
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
import typings.apolloProtobufjs.mod.TypeDecorator
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @apollo/protobufjs.@apollo/protobufjs.Type & {  OptimizeMode :@apollo/protobufjs.@apollo/protobufjs.Enum} */
object FileOptions {
  
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.OptimizeMode")
  @js.native
  def OptimizeMode: Enum = js.native
  @scala.inline
  def OptimizeMode_=(x: Enum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptimizeMode")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a nested object to this namespace.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.add")
  @js.native
  def add(`object`: ReflectionObject): Namespace = js.native
  
  /**
    * Adds nested objects to this namespace from nested object descriptors.
    * @param nestedJson Any nested object descriptors
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.addJSON")
  @js.native
  def addJSON(nestedJson: StringDictionary[js.UndefOr[AnyNestedObject]]): Namespace = js.native
  
  /**
    * Adds a nested object to this type.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name or, if a field, when there is already a field with this id
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.add")
  @js.native
  def add_Type(`object`: ReflectionObject): Type = js.native
  
  /** Comment text, if any. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.comment")
  @js.native
  def comment: String | Null = js.native
  @scala.inline
  def comment_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
  
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.constructor")
  @js.native
  def constructor(name: String): js.Any = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.constructor")
  @js.native
  def constructor(name: String, options: StringDictionary[js.UndefOr[js.Any]]): js.Any = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.create")
  @js.native
  def create(): Message[js.Object] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.create")
  @js.native
  def create(properties: StringDictionary[js.UndefOr[js.Any]]): Message[js.Object] = js.native
  
  /**
    * The registered constructor, if any registered, otherwise a generic constructor.
    * Assigning a function replaces the internal constructor. If the function does not extend {@link Message} yet, its prototype will be setup accordingly and static methods will be populated. If it already extends {@link Message}, it will just replace the internal constructor.
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.ctor")
  @js.native
  def ctor: Constructor[js.Object] = js.native
  @scala.inline
  def ctor_=(x: Constructor[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctor")(x.asInstanceOf[js.Any])
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.d")
  @js.native
  def d[T /* <: Message[T] */](): TypeDecorator[T] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.d")
  @js.native
  def d[T /* <: Message[T] */](typeName: String): TypeDecorator[T] = js.native
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode from
    * @param [length] Length of the message, if known beforehand
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError<{}>} If required fields are missing
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decode")
  @js.native
  def decode(reader: Reader): Message[js.Object] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): Message[js.Object] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decode")
  @js.native
  def decode(reader: Uint8Array): Message[js.Object] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Message[js.Object] = js.native
  
  /**
    * Decodes a message of this type preceeded by its byte length as a varint.
    * @param reader Reader or buffer to decode from
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError} If required fields are missing
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Message[js.Object] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Message[js.Object] = js.native
  
  /**
    * Defines additial namespaces within this one if not yet existing.
    * @param path Path to create
    * @param [json] Nested types to create from JSON
    * @returns Pointer to the last namespace created or `this` if path is empty
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.define")
  @js.native
  def define(path: String): Namespace = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.define")
  @js.native
  def define(path: String, json: js.Any): Namespace = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.define")
  @js.native
  def define(path: js.Array[String]): Namespace = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.define")
  @js.native
  def define(path: js.Array[String], json: js.Any): Namespace = js.native
  
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encode")
  @js.native
  def encode(message: StringDictionary[js.UndefOr[js.Any]]): Writer = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encode")
  @js.native
  def encode(message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encode")
  @js.native
  def encode(message: Message[js.Object]): Writer = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encode")
  @js.native
  def encode(message: Message[js.Object], writer: Writer): Writer = js.native
  
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: StringDictionary[js.UndefOr[js.Any]]): Writer = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: StringDictionary[js.UndefOr[js.Any]], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type preceeded by its byte length as a varint. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: Message[js.Object]): Writer = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: Message[js.Object], writer: Writer): Writer = js.native
  
  /** Extension ranges, if any. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.extensions")
  @js.native
  def extensions: js.Array[js.Array[Double]] = js.native
  @scala.inline
  def extensions_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  /** Fields of this message as an array for iteration. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.fieldsArray")
  @js.native
  val fieldsArray: js.Array[Field] = js.native
  
  /** Defining file name. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.filename")
  @js.native
  def filename: String | Null = js.native
  @scala.inline
  def filename_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filename")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.fromJSON")
  @js.native
  def fromJSON(name: String, json: IType): Type = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object to convert
    * @returns Message instance
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.UndefOr[js.Any]]): Message[js.Object] = js.native
  
  /** Full name including leading dot. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.fullName")
  @js.native
  val fullName: String = js.native
  
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.generateConstructor")
  @js.native
  def generateConstructor(mtype: Type): Codegen = js.native
  
  /**
    * Gets the nested object of the specified name.
    * @param name Nested object name
    * @returns The reflection object or `null` if it doesn't exist
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.get")
  @js.native
  def get(name: String): ReflectionObject | Null = js.native
  
  /**
    * Gets the values of the nested {@link Enum|enum} of the specified name.
    * This methods differs from {@link Namespace#get|get} in that it returns an enum's values directly and throws instead of returning `null`.
    * @param name Nested enum name
    * @returns Enum values
    * @throws {Error} If there is no such enum
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.getEnum")
  @js.native
  def getEnum(name: String): StringDictionary[js.UndefOr[Double]] = js.native
  
  /**
    * Gets an option value.
    * @param name Option name
    * @returns Option value or `undefined` if not set
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.getOption")
  @js.native
  def getOption(name: String): js.Any = js.native
  
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.isReservedId")
  @js.native
  def isReservedId(id: Double): Boolean = js.native
  
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.isReservedName")
  @js.native
  def isReservedName(name: String): Boolean = js.native
  
  /**
    * Looks up the reflection object at the specified path, relative to this namespace.
    * @param path Path to look up
    * @param [parentAlreadyChecked=false] Whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String): ReflectionObject | Null = js.native
  /**
    * Recursively looks up the reflection object matching the specified path in the scope of this namespace.
    * @param path Path to look up
    * @param filterTypes Filter types, any combination of the constructors of `protobuf.Type`, `protobuf.Enum`, `protobuf.Service` etc.
    * @param [parentAlreadyChecked=false] If known, whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String, filterTypes: js.Any): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String, filterTypes: js.Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String, filterTypes: js.Array[_]): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String, filterTypes: js.Array[_], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: String, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String]): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String], filterTypes: js.Any): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String], filterTypes: js.Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[_]): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[_], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookup")
  @js.native
  def lookup(path: js.Array[String], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  
  /**
    * Looks up the values of the {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up enum
    * @throws {Error} If `path` does not point to an enum
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupEnum")
  @js.native
  def lookupEnum(path: String): Enum = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupEnum")
  @js.native
  def lookupEnum(path: js.Array[String]): Enum = js.native
  
  /**
    * Looks up the {@link Service|service} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up service
    * @throws {Error} If `path` does not point to a service
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupService")
  @js.native
  def lookupService(path: String): Service = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupService")
  @js.native
  def lookupService(path: js.Array[String]): Service = js.native
  
  /**
    * Looks up the {@link Type|type} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type
    * @throws {Error} If `path` does not point to a type
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupType")
  @js.native
  def lookupType(path: String): Type = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupType")
  @js.native
  def lookupType(path: js.Array[String]): Type = js.native
  
  /**
    * Looks up the {@link Type|type} or {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type or enum
    * @throws {Error} If `path` does not point to a type or enum
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupTypeOrEnum")
  @js.native
  def lookupTypeOrEnum(path: String): Type = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.lookupTypeOrEnum")
  @js.native
  def lookupTypeOrEnum(path: js.Array[String]): Type = js.native
  
  /** Unique name within its namespace. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.name")
  @js.native
  def name: String = js.native
  @scala.inline
  def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  /** Nested objects by name. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.nested")
  @js.native
  def nested: js.UndefOr[StringDictionary[js.UndefOr[ReflectionObject]]] = js.native
  
  /** Nested objects of this namespace as an array for iteration. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.nestedArray")
  @js.native
  val nestedArray: js.Array[ReflectionObject] = js.native
  
  @scala.inline
  def nested_=(x: js.UndefOr[StringDictionary[js.UndefOr[ReflectionObject]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nested")(x.asInstanceOf[js.Any])
  
  /**
    * Called when this object is added to a parent.
    * @param parent Parent added to
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.onAdd")
  @js.native
  def onAdd(parent: ReflectionObject): Unit = js.native
  
  /**
    * Called when this object is removed from a parent.
    * @param parent Parent removed from
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.onRemove")
  @js.native
  def onRemove(parent: ReflectionObject): Unit = js.native
  
  /** Oneofs of this message as an array for iteration. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.oneofsArray")
  @js.native
  val oneofsArray: js.Array[OneOf] = js.native
  
  /** Options. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.options")
  @js.native
  def options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.native
  @scala.inline
  def options_=(x: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /** Parent namespace. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.parent")
  @js.native
  def parent: Namespace | Null = js.native
  @scala.inline
  def parent_=(x: Namespace | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parent")(x.asInstanceOf[js.Any])
  
  /**
    * Removes a nested object from this namespace.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this namespace
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.remove")
  @js.native
  def remove(`object`: ReflectionObject): Namespace = js.native
  /**
    * Removes a nested object from this type.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this type
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.remove")
  @js.native
  def remove_Type(`object`: ReflectionObject): Type = js.native
  
  /** Reserved ranges, if any. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.reserved")
  @js.native
  def reserved: js.Array[js.Array[Double] | String] = js.native
  @scala.inline
  def reserved_=(x: js.Array[js.Array[Double] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reserved")(x.asInstanceOf[js.Any])
  
  /**
    * Resolves this objects type references.
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.resolve")
  @js.native
  def resolve(): ReflectionObject = js.native
  
  /**
    * Resolves this namespace's and all its nested objects' type references. Useful to validate a reflection tree, but comes at a cost.
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.resolveAll")
  @js.native
  def resolveAll(): Namespace = js.native
  
  /** Whether already resolved or not. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.resolved")
  @js.native
  def resolved: Boolean = js.native
  @scala.inline
  def resolved_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolved")(x.asInstanceOf[js.Any])
  
  /** Reference to the root namespace. */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.root")
  @js.native
  val root: Root = js.native
  
  /**
    * Sets an option.
    * @param name Option name
    * @param value Option value
    * @param [ifNotSet] Sets the option only if it isn't currently set
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.setOption")
  @js.native
  def setOption(name: String, value: js.Any): ReflectionObject = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.setOption")
  @js.native
  def setOption(name: String, value: js.Any, ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets multiple options.
    * @param options Options to set
    * @param [ifNotSet] Sets an option only if it isn't currently set
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.setOptions")
  @js.native
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]]): ReflectionObject = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.setOptions")
  @js.native
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]], ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets up {@link Type#encode|encode}, {@link Type#decode|decode} and {@link Type#verify|verify}.
    * @returns `this`
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.setup")
  @js.native
  def setup(): Type = js.native
  
  /**
    * Converts this namespace to a namespace descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Namespace descriptor
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toJSON")
  @js.native
  def toJSON(): INamespace = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toJSON")
  @js.native
  def toJSON(toJSONOptions: IToJSONOptions): INamespace = js.native
  /**
    * Converts this message type to a message type descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Message type descriptor
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toJSON")
  @js.native
  def toJSON_IType(): IType = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toJSON")
  @js.native
  def toJSON_IType(toJSONOptions: IToJSONOptions): IType = js.native
  /**
    * Converts this reflection object to its descriptor representation.
    * @returns Descriptor
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toJSON")
  @js.native
  def toJSON_StringDictionary(): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toObject")
  @js.native
  def toObject(message: Message[js.Object]): StringDictionary[js.UndefOr[js.Any]] = js.native
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toObject")
  @js.native
  def toObject(message: Message[js.Object], options: IConversionOptions): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Converts this instance to its string representation.
    * @returns Class name[, space, full name]
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.toString")
  @js.native
  def toString_(): String = js.native
  
  /**
    * Verifies that field values are valid and that required fields are present.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("@apollo/protobufjs/ext/descriptor", "FileOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.UndefOr[js.Any]]): Null | String = js.native
  
  /** Message fields. */
  object fields
  
  /** Message fields by id. */
  object fieldsById
  
  /** Oneofs declared within this namespace, if any. */
  object oneofs
}
