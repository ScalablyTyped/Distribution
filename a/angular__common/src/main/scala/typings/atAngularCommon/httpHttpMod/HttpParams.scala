package typings.atAngularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpParams")
@js.native
class HttpParams () extends js.Object {
  def this(options: HttpParamsOptions) = this()
  var cloneFrom: js.Any = js.native
  @JSName("clone")
  var clone_FHttpParams: js.Any = js.native
  var encoder: js.Any = js.native
  var init: js.Any = js.native
  var map: js.Any = js.native
  var updates: js.Any = js.native
  /**
    * Appends a new value to existing values for a parameter.
    * @param param The parameter name.
    * @param value The new value to add.
    * @return A new body with the appended value.
    */
  def append(param: String, value: String): HttpParams = js.native
  /**
    * Removes a given value or all values from a parameter.
    * @param param The parameter name.
    * @param value The value to remove, if provided.
    * @return A new body with the given value removed, or with all values
    * removed if no value is specified.
    */
  def delete(param: String): HttpParams = js.native
  def delete(param: String, value: String): HttpParams = js.native
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
  /**
    * Retrieves all the parameters for this body.
    * @returns The parameter names in a string array.
    */
  def keys(): js.Array[String] = js.native
  /**
    * Replaces the value for a parameter.
    * @param param The parameter name.
    * @param value The new value.
    * @return A new body with the new value.
    */
  def set(param: String, value: String): HttpParams = js.native
}

