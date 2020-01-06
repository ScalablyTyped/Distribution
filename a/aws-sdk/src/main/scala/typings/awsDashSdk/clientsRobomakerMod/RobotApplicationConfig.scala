package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotApplicationConfig extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the robot application.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
  /**
    * The launch configuration for the robot application.
    */
  var launchConfig: LaunchConfig = js.native
}

object RobotApplicationConfig {
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig, applicationVersion: Version = null): RobotApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotApplicationConfig]
  }
}

