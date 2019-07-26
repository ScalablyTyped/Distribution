package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamMap extends js.Object {
  /** Names of the parameters in the map. */
  val keys: js.Array[java.lang.String]
  /**
    * Retrieves a single value for a parameter.
    * @param name The parameter name.
    * @return The parameter's single value,
    * or the first value if the parameter has multiple values,
    * or `null` when there is no such parameter.
    */
  def get(name: java.lang.String): java.lang.String | scala.Null
  /**
    * Retrieves multiple values for a parameter.
    * @param name The parameter name.
    * @return An array containing one or more values,
    * or an empty array if there is no such parameter.
    *
    */
  def getAll(name: java.lang.String): js.Array[java.lang.String]
  /**
    * Reports whether the map contains a given parameter.
    * @param name The parameter name.
    * @returns True if the map contains the given parameter, false otherwise.
    */
  def has(name: java.lang.String): scala.Boolean
}

object ParamMap {
  @scala.inline
  def apply(
    get: java.lang.String => java.lang.String | scala.Null,
    getAll: java.lang.String => js.Array[java.lang.String],
    has: java.lang.String => scala.Boolean,
    keys: js.Array[java.lang.String]
  ): ParamMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = keys)
  
    __obj.asInstanceOf[ParamMap]
  }
}

