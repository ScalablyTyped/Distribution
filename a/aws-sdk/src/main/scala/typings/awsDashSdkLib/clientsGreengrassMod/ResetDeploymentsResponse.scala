package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDeploymentsResponse extends js.Object {
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.undefined
}

object ResetDeploymentsResponse {
  @scala.inline
  def apply(DeploymentArn: __string = null, DeploymentId: __string = null): ResetDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    __obj.asInstanceOf[ResetDeploymentsResponse]
  }
}

