package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBulkDeploymentStatusResponse extends js.Object {
  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  var BulkDeploymentMetrics: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.BulkDeploymentMetrics] = js.undefined
  /**
    * The status of the bulk deployment.
    */
  var BulkDeploymentStatus: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.BulkDeploymentStatus] = js.undefined
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[__string] = js.undefined
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.ErrorDetails] = js.undefined
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[__string] = js.undefined
  /**
    * Tag(s) attached to the resource arn.
    */
  var tags: js.UndefOr[Tags] = js.undefined
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
    if (BulkDeploymentMetrics != null) __obj.updateDynamic("BulkDeploymentMetrics")(BulkDeploymentMetrics)
    if (BulkDeploymentStatus != null) __obj.updateDynamic("BulkDeploymentStatus")(BulkDeploymentStatus.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
  }
}

