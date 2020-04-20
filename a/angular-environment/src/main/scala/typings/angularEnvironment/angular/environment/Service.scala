package typings.angularEnvironment.angular.environment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * Retrieve the current environment
    */
  def get(): String
  /**
    * Evaluates current environment against
    * environment parameter.
    */
  def is(environment: String): Boolean
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any
  /**
    * Force sets the current environment
    */
  def set(environment: String): Unit
}

object Service {
  @scala.inline
  def apply(get: () => String, is: String => Boolean, read: String => js.Any, set: String => Unit): Service = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), is = js.Any.fromFunction1(is), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Service]
  }
}

