package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfig extends js.Object {
  /**
    * The environment variables for the application launch.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.native
  /**
    * The launch file name.
    */
  var launchFile: Command = js.native
  /**
    * The package name.
    */
  var packageName: Command = js.native
  /**
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.native
}

object LaunchConfig {
  @scala.inline
  def apply(
    launchFile: Command,
    packageName: Command,
    environmentVariables: EnvironmentVariableMap = null,
    portForwardingConfig: PortForwardingConfig = null
  ): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (portForwardingConfig != null) __obj.updateDynamic("portForwardingConfig")(portForwardingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
}

