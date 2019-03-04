package typings
package angularDashEnvironmentLib.angularNs.environmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * Retrieve the current environment
    */
  def get(): java.lang.String
  /**
    * Evaluates current environment against
    * environment parameter.
    */
  def is(environment: java.lang.String): scala.Boolean
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: java.lang.String): js.Any
  /**
    * Force sets the current environment
    */
  def set(environment: java.lang.String): scala.Unit
}

object Service {
  @scala.inline
  def apply(
    get: js.Function0[java.lang.String],
    is: js.Function1[java.lang.String, scala.Boolean],
    read: js.Function1[java.lang.String, js.Any],
    set: js.Function1[java.lang.String, scala.Unit]
  ): Service = {
    val __obj = js.Dynamic.literal(get = get, is = is, read = read, set = set)
  
    __obj.asInstanceOf[Service]
  }
}

