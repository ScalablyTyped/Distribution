package typings
package angularDashEnvironmentLib.angularNs.environmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceProvider extends js.Object {
  /**
    * Evaluates the current domain and
    * loads the correct environment variables.
    */
  def check(): scala.Unit
  /**
    * Sets the configuration object
    */
  def config(config: Config): scala.Unit
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: java.lang.String): js.Any
}

object ServiceProvider {
  @scala.inline
  def apply(check: () => scala.Unit, config: Config => scala.Unit, read: java.lang.String => js.Any): ServiceProvider = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), config = js.Any.fromFunction1(config), read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[ServiceProvider]
  }
}

