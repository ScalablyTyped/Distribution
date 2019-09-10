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
  /**
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.undefined
}

object LaunchConfig {
  @scala.inline
  def apply(
    launchFile: Command,
    packageName: Command,
    environmentVariables: EnvironmentVariableMap = null,
    portForwardingConfig: PortForwardingConfig = null
  ): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile, packageName = packageName)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (portForwardingConfig != null) __obj.updateDynamic("portForwardingConfig")(portForwardingConfig)
    __obj.asInstanceOf[LaunchConfig]
  }
}

