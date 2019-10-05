package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfig extends js.Object {
  /**
    * The percentage of robots receiving the deployment at the same time.
    */
  var concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of deployments that need to fail before stopping deployment.
    */
  var failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1 minute and 7 days. The default is 5 hours.
    */
  var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.undefined
}

object DeploymentConfig {
  @scala.inline
  def apply(
    concurrentDeploymentPercentage: Int | Double = null,
    failureThresholdPercentage: Int | Double = null,
    robotDeploymentTimeoutInSeconds: Int | Double = null
  ): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    if (concurrentDeploymentPercentage != null) __obj.updateDynamic("concurrentDeploymentPercentage")(concurrentDeploymentPercentage.asInstanceOf[js.Any])
    if (failureThresholdPercentage != null) __obj.updateDynamic("failureThresholdPercentage")(failureThresholdPercentage.asInstanceOf[js.Any])
    if (robotDeploymentTimeoutInSeconds != null) __obj.updateDynamic("robotDeploymentTimeoutInSeconds")(robotDeploymentTimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfig]
  }
}

