package typings.angularEnvironment.angular.environment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceProvider extends js.Object {
  /**
    * Evaluates the current domain and
    * loads the correct environment variables.
    */
  def check(): Unit
  /**
    * Sets the configuration object
    */
  def config(config: Config): Unit
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any
}

object ServiceProvider {
  @scala.inline
  def apply(check: () => Unit, config: Config => Unit, read: String => js.Any): ServiceProvider = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), config = js.Any.fromFunction1(config), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[ServiceProvider]
  }
}

