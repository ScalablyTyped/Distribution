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

