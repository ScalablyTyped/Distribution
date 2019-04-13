package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationApplicationConfig extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig
}

object SimulationApplicationConfig {
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig, applicationVersion: Version = null): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application, launchConfig = launchConfig)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
}

