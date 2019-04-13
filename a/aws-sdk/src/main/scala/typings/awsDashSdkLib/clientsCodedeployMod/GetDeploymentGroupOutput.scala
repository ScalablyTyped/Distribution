package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentGroupOutput extends js.Object {
  /**
    * Information about the deployment group.
    */
  var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined
}

object GetDeploymentGroupOutput {
  @scala.inline
  def apply(deploymentGroupInfo: DeploymentGroupInfo = null): GetDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroupInfo != null) __obj.updateDynamic("deploymentGroupInfo")(deploymentGroupInfo)
    __obj.asInstanceOf[GetDeploymentGroupOutput]
  }
}

