package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentResponse extends js.Object {
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.undefined
}

object CreateDeploymentResponse {
  @scala.inline
  def apply(DeploymentArn: __string = null, DeploymentId: __string = null): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
}

