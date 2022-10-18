package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@apollo/protobufjs", "NamespaceBase")
@js.native
open class NamespaceBase () extends ReflectionObject {
  
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
  def addJSON(nestedJson: StringDictionary[AnyNestedObject]): Namespace = js.native
  
  /**
    * Defines additial namespaces within this one if not yet existing.
    * @param path Path to create
    * @param [json] Nested types to create from JSON
    * @returns Pointer to the last namespace created or `this` if path is empty
    */
  def define(path: String): Namespace = js.native
  def define(path: String, json: Any): Namespace = js.native
  def define(path: js.Array[String]): Namespace = js.native
  def define(path: js.Array[String], json: Any): Namespace = js.native
  
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
  def getEnum(name: String): StringDictionary[Double] = js.native
  
  /**
    * Looks up the reflection object at the specified path, relative to this namespace.
    * @param path Path to look up
    * @param [parentAlreadyChecked=false] Whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: String): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: js.Array[Any]): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: js.Array[Any], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  /**
    * Recursively looks up the reflection object matching the specified path in the scope of this namespace.
    * @param path Path to look up
    * @param filterTypes Filter types, any combination of the constructors of `protobuf.Type`, `protobuf.Enum`, `protobuf.Service` etc.
    * @param [parentAlreadyChecked=false] If known, whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: String, filterTypes: Any): ReflectionObject | Null = js.native
  def lookup(path: String, filterTypes: Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: String, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String]): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[Any]): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: js.Array[Any], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: Any): ReflectionObject | Null = js.native
  def lookup(path: js.Array[String], filterTypes: Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native
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
  
  /** Nested objects by name. */
  var nested: js.UndefOr[StringDictionary[ReflectionObject]] = js.native
  
  /** Nested objects of this namespace as an array for iteration. */
  val nestedArray: js.Array[ReflectionObject] = js.native
  
  /**
    * Removes a nested object from this namespace.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this namespace
    */
  def remove(`object`: ReflectionObject): Namespace = js.native
  
  /**
    * Resolves this namespace's and all its nested objects' type references. Useful to validate a reflection tree, but comes at a cost.
    * @returns `this`
    */
  def resolveAll(): Namespace = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): INamespace = js.native
}
