package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentOutput extends js.Object {
  /**
    * Information about the deployment.
    */
  var deploymentInfo: js.UndefOr[DeploymentInfo] = js.native
}

object GetDeploymentOutput {
  @scala.inline
  def apply(deploymentInfo: DeploymentInfo = null): GetDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentInfo != null) __obj.updateDynamic("deploymentInfo")(deploymentInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentOutput]
  }
}

