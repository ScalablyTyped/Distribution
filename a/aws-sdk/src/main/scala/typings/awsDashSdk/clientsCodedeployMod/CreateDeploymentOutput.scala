package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentOutput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
}

object CreateDeploymentOutput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null): CreateDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.asInstanceOf[CreateDeploymentOutput]
  }
}

