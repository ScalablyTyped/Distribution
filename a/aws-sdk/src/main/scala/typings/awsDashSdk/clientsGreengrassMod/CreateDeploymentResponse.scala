package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResponse extends js.Object {
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[__string] = js.native
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.native
}

object CreateDeploymentResponse {
  @scala.inline
  def apply(DeploymentArn: __string = null, DeploymentId: __string = null): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
}

