package typings.angularCommon.httpMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpParams")
@js.native
open class HttpParams () extends StObject {
  def this(options: HttpParamsOptions) = this()
  
  /**
    * Appends a new value to existing values for a parameter.
    * @param param The parameter name.
    * @param value The new value to add.
    * @return A new body with the appended value.
    */
  def append(param: String, value: String): HttpParams = js.native
  def append(param: String, value: Boolean): HttpParams = js.native
  def append(param: String, value: Double): HttpParams = js.native
  
  /**
    * Constructs a new body with appended values for the given parameter name.
    * @param params parameters and values
    * @return A new body with the new value.
    */
  def appendAll(params: StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])]): HttpParams = js.native
  
  /* private */ var cloneFrom: Any = js.native
  
  /* private */ @JSName("clone")
  var clone_FHttpParams: Any = js.native
  
  /**
    * Removes a given value or all values from a parameter.
    * @param param The parameter name.
    * @param value The value to remove, if provided.
    * @return A new body with the given value removed, or with all values
    * removed if no value is specified.
    */
  def delete(param: String): HttpParams = js.native
  def delete(param: String, value: String): HttpParams = js.native
  def delete(param: String, value: Boolean): HttpParams = js.native
  def delete(param: String, value: Double): HttpParams = js.native
  
  /* private */ var encoder: Any = js.native
  
  /**
    * Retrieves the first value for a parameter.
    * @param param The parameter name.
    * @returns The first value of the given parameter,
    * or `null` if the parameter is not present.
    */
  def get(param: String): String | Null = js.native
  
  /**
    * Retrieves all values for a  parameter.
    * @param param The parameter name.
    * @returns All values in a string array,
    * or `null` if the parameter not present.
    */
  def getAll(param: String): js.Array[String] | Null = js.native
  
  /**
    * Reports whether the body includes one or more values for a given parameter.
    * @param param The parameter name.
    * @returns True if the parameter has one or more values,
    * false if it has no value or is not present.
    */
  def has(param: String): Boolean = js.native
  
  /* private */ var init: Any = js.native
  
  /**
    * Retrieves all the parameters for this body.
    * @returns The parameter names in a string array.
    */
  def keys(): js.Array[String] = js.native
  
  /* private */ var map: Any = js.native
  
  /**
    * Replaces the value for a parameter.
    * @param param The parameter name.
    * @param value The new value.
    * @return A new body with the new value.
    */
  def set(param: String, value: String): HttpParams = js.native
  def set(param: String, value: Boolean): HttpParams = js.native
  def set(param: String, value: Double): HttpParams = js.native
  
  /* private */ var updates: Any = js.native
}
