package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfig extends js.Object {
  /**
    * The environment variables for the application launch.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
  /**
    * The launch file name.
    */
  var launchFile: Command
  /**
    * The package name.
    */
  var packageName: Command
}

object LaunchConfig {
  @scala.inline
  def apply(launchFile: Command, packageName: Command, environmentVariables: EnvironmentVariableMap = null): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile, packageName = packageName)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    __obj.asInstanceOf[LaunchConfig]
  }
}

