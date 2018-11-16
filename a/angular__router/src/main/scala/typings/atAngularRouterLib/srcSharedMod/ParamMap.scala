package typings
package atAngularRouterLib.srcSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParamMap extends js.Object {
  /** Name of the parameters */
  val keys: js.Array[java.lang.String]
  /**
       * Return a single value for the given parameter name:
       * - the value when the parameter has a single value,
       * - the first value if the parameter has multiple values,
       * - `null` when there is no such parameter.
       */
  def get(name: java.lang.String): java.lang.String | scala.Null
  /**
       * Return an array of values for the given parameter name.
       *
       * If there is no such parameter, an empty array is returned.
       */
  def getAll(name: java.lang.String): js.Array[java.lang.String]
  def has(name: java.lang.String): scala.Boolean
}

