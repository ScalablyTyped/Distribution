package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkDeploymentResult extends js.Object {
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the group deployment.
    */
  var DeploymentArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the group deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.undefined
  /**
    * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[__string] = js.undefined
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
  /**
    * Details about the error.
    */
  var ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined
  /**
    * The error message for a failed deployment
    */
  var ErrorMessage: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the Greengrass group.
    */
  var GroupArn: js.UndefOr[__string] = js.undefined
}

object BulkDeploymentResult {
  @scala.inline
  def apply(
    CreatedAt: __string = null,
    DeploymentArn: __string = null,
    DeploymentId: __string = null,
    DeploymentStatus: __string = null,
    DeploymentType: DeploymentType = null,
    ErrorDetails: ErrorDetails = null,
    ErrorMessage: __string = null,
    GroupArn: __string = null
  ): BulkDeploymentResult = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus)
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn)
    __obj.asInstanceOf[BulkDeploymentResult]
  }
}

