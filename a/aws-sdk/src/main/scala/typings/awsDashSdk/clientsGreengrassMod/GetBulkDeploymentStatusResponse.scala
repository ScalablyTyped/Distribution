package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBulkDeploymentStatusResponse extends js.Object {
  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  var BulkDeploymentMetrics: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.BulkDeploymentMetrics] = js.native
  /**
    * The status of the bulk deployment.
    */
  var BulkDeploymentStatus: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.BulkDeploymentStatus] = js.native
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[__string] = js.native
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.ErrorDetails] = js.native
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[__string] = js.native
  /**
    * Tag(s) attached to the resource arn.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object GetBulkDeploymentStatusResponse {
  @scala.inline
  def apply(
    BulkDeploymentMetrics: BulkDeploymentMetrics = null,
    BulkDeploymentStatus: BulkDeploymentStatus = null,
    CreatedAt: __string = null,
    ErrorDetails: ErrorDetails = null,
    ErrorMessage: __string = null,
    tags: Tags = null
  ): GetBulkDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkDeploymentMetrics != null) __obj.updateDynamic("BulkDeploymentMetrics")(BulkDeploymentMetrics.asInstanceOf[js.Any])
    if (BulkDeploymentStatus != null) __obj.updateDynamic("BulkDeploymentStatus")(BulkDeploymentStatus.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
  }
}

