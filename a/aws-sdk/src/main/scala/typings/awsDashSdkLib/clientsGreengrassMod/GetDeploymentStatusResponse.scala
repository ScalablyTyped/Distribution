package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentStatusResponse extends js.Object {
  /**
    * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[__string] = js.undefined
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the deployment status was updated.
    */
  var UpdatedAt: js.UndefOr[__string] = js.undefined
}

object GetDeploymentStatusResponse {
  @scala.inline
  def apply(
    DeploymentStatus: __string = null,
    DeploymentType: DeploymentType = null,
    ErrorDetails: ErrorDetails = null,
    ErrorMessage: __string = null,
    UpdatedAt: __string = null
  ): GetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus)
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[GetDeploymentStatusResponse]
  }
}

