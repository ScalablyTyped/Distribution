package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentConfigOutput extends js.Object {
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
}

object GetDeploymentConfigOutput {
  @scala.inline
  def apply(deploymentConfigInfo: DeploymentConfigInfo = null): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigInfo != null) __obj.updateDynamic("deploymentConfigInfo")(deploymentConfigInfo)
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
}

