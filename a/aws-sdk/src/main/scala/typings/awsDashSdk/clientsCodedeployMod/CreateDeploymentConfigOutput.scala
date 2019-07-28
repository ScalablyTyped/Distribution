package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentConfigOutput extends js.Object {
  /**
    * A unique deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
}

object CreateDeploymentConfigOutput {
  @scala.inline
  def apply(deploymentConfigId: DeploymentConfigId = null): CreateDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigId != null) __obj.updateDynamic("deploymentConfigId")(deploymentConfigId)
    __obj.asInstanceOf[CreateDeploymentConfigOutput]
  }
}

