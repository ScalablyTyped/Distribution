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
  def apply(
    check: js.Function0[scala.Unit],
    config: js.Function1[Config, scala.Unit],
    read: js.Function1[java.lang.String, js.Any]
  ): ServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[ServiceProvider]
  }
}

