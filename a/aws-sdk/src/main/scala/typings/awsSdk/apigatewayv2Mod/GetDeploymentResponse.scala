package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentResponse extends js.Object {
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.native
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.native
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
}

object GetDeploymentResponse {
  @scala.inline
  def apply(
    AutoDeployed: js.UndefOr[boolean] = js.undefined,
    CreatedDate: timestampIso8601 = null,
    DeploymentId: Id = null,
    DeploymentStatus: DeploymentStatus = null,
    DeploymentStatusMessage: string = null,
    Description: StringWithLengthBetween0And1024 = null
  ): GetDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoDeployed)) __obj.updateDynamic("AutoDeployed")(AutoDeployed.get.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (DeploymentStatusMessage != null) __obj.updateDynamic("DeploymentStatusMessage")(DeploymentStatusMessage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentResponse]
  }
}

