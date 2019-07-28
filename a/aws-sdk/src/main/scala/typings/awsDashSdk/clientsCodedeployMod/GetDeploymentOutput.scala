package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentOutput extends js.Object {
  /**
    * Information about the deployment.
    */
  var deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
}

object GetDeploymentOutput {
  @scala.inline
  def apply(deploymentInfo: DeploymentInfo = null): GetDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentInfo != null) __obj.updateDynamic("deploymentInfo")(deploymentInfo)
    __obj.asInstanceOf[GetDeploymentOutput]
  }
}

