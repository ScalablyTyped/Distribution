package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentGroupOutput extends js.Object {
  /**
    * A unique deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
}

object CreateDeploymentGroupOutput {
  @scala.inline
  def apply(deploymentGroupId: DeploymentGroupId = null): CreateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroupId != null) __obj.updateDynamic("deploymentGroupId")(deploymentGroupId)
    __obj.asInstanceOf[CreateDeploymentGroupOutput]
  }
}

