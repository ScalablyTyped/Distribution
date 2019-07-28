package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentLaunchConfig extends js.Object {
  /**
    * An array of key/value pairs specifying environment variables for the robot application
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
    * The deployment post-launch file. This file will be executed after the launch file.
    */
  var postLaunchFile: js.UndefOr[Path] = js.undefined
  /**
    * The deployment pre-launch file. This file will be executed prior to the launch file.
    */
  var preLaunchFile: js.UndefOr[Path] = js.undefined
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
    val __obj = js.Dynamic.literal(launchFile = launchFile, packageName = packageName)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (postLaunchFile != null) __obj.updateDynamic("postLaunchFile")(postLaunchFile)
    if (preLaunchFile != null) __obj.updateDynamic("preLaunchFile")(preLaunchFile)
    __obj.asInstanceOf[DeploymentLaunchConfig]
  }
}

