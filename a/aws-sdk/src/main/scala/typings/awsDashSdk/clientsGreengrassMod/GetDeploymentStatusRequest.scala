package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentStatusRequest extends js.Object {
  /**
    * The ID of the deployment.
    */
  var DeploymentId: __string
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object GetDeploymentStatusRequest {
  @scala.inline
  def apply(DeploymentId: __string, GroupId: __string): GetDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(DeploymentId = DeploymentId, GroupId = GroupId)
  
    __obj.asInstanceOf[GetDeploymentStatusRequest]
  }
}

