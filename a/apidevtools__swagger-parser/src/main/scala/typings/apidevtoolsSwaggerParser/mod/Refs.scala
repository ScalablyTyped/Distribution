package typings.apidevtoolsSwaggerParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apidevtools/swagger-parser", "$Refs")
@js.native
class Refs () extends js.Object {
  
  /**
    * This property is true if the API definition contains any circular references. You may want to check this property before serializing the dereferenced API definition as JSON, since JSON.stringify() does not support circular references by default.
    *
    * See https://apitools.dev/swagger-parser/docs/refs.html#circular
    */
  var circular: Boolean = js.native
  
  /**
    * Returns `true` if the given path exists in the OpenAPI definition; otherwise, returns `false`
    *
    * See https://apitools.dev/swagger-parser/docs/refs.html#existsref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def exists($ref: String): Boolean = js.native
  
  /**
    * Gets the value at the given path in the OpenAPI definition. Throws an error if the path does not exist.
    *
    * See https://apitools.dev/swagger-parser/docs/refs.html#getref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def get($ref: String): js.Any = js.native
  
  /**
    * Returns the paths/URLs of all the files in your API definition (including the main API definition file).
    *
    * See https://apitools.dev/swagger-parser/docs/refs.html#pathstypes
    *
    * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
    */
  def paths(types: String*): js.Array[String] = js.native
  
  /**
    * Sets the value at the given path in the OpenAPI definition. If the property, or any of its parents, don't exist, they will be created.
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    * @param value The value to assign. Can be anything (object, string, number, etc.)
    */
  def set($ref: String, value: js.Any): Unit = js.native
  
  /**
    * Returns a map of paths/URLs and their correspond values.
    *
    * See https://apitools.dev/swagger-parser/docs/refs.html#valuestypes
    *
    * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
    */
  def values(types: String*): StringDictionary[js.Any] = js.native
}
