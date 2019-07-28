package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentResponse extends js.Object {
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  /**
    * The status of the deployment: PENDING, FAILED, or
    SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.DeploymentStatus] = js.undefined
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[__string] = js.undefined
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
}

object CreateDeploymentResponse {
  @scala.inline
  def apply(
    CreatedDate: __timestampIso8601 = null,
    DeploymentId: Id = null,
    DeploymentStatus: DeploymentStatus = null,
    DeploymentStatusMessage: __string = null,
    Description: StringWithLengthBetween0And1024 = null
  ): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (DeploymentStatusMessage != null) __obj.updateDynamic("DeploymentStatusMessage")(DeploymentStatusMessage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
}

