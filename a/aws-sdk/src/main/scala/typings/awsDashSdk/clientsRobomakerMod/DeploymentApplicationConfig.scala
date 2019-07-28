package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentApplicationConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn
  /**
    * The version of the application.
    */
  var applicationVersion: DeploymentVersion
  /**
    * The launch configuration.
    */
  var launchConfig: DeploymentLaunchConfig
}

object DeploymentApplicationConfig {
  @scala.inline
  def apply(application: Arn, applicationVersion: DeploymentVersion, launchConfig: DeploymentLaunchConfig): DeploymentApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application, applicationVersion = applicationVersion, launchConfig = launchConfig)
  
    __obj.asInstanceOf[DeploymentApplicationConfig]
  }
}

