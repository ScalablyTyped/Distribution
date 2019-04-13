package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastDeploymentInfo extends js.Object {
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group started.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group was complete.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the most recent deployment.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}

object LastDeploymentInfo {
  @scala.inline
  def apply(
    createTime: Timestamp = null,
    deploymentId: DeploymentId = null,
    endTime: Timestamp = null,
    status: DeploymentStatus = null
  ): LastDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastDeploymentInfo]
  }
}

