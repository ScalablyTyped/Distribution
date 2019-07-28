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
}

object DeploymentConfig {
  @scala.inline
  def apply(
    concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined,
    failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined
  ): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrentDeploymentPercentage)) __obj.updateDynamic("concurrentDeploymentPercentage")(concurrentDeploymentPercentage)
    if (!js.isUndefined(failureThresholdPercentage)) __obj.updateDynamic("failureThresholdPercentage")(failureThresholdPercentage)
    __obj.asInstanceOf[DeploymentConfig]
  }
}

