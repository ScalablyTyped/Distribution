package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentLaunchConfig extends js.Object {
  /**
    * An array of key/value pairs specifying environment variables for the robot application
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
    * The deployment post-launch file. This file will be executed after the launch file.
    */
  var postLaunchFile: js.UndefOr[Path] = js.native
  /**
    * The deployment pre-launch file. This file will be executed prior to the launch file.
    */
  var preLaunchFile: js.UndefOr[Path] = js.native
}

object DeploymentLaunchConfig {
  @scala.inline
  def apply(
    launchFile: Command,
    packageName: Command,
    environmentVariables: EnvironmentVariableMap = null,
    postLaunchFile: Path = null,
    preLaunchFile: Path = null
  ): DeploymentLaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (postLaunchFile != null) __obj.updateDynamic("postLaunchFile")(postLaunchFile.asInstanceOf[js.Any])
    if (preLaunchFile != null) __obj.updateDynamic("preLaunchFile")(preLaunchFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentLaunchConfig]
  }
}

