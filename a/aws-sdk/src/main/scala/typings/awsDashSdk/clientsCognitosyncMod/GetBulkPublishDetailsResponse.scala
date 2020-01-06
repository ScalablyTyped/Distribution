package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBulkPublishDetailsResponse extends js.Object {
  /**
    * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
    */
  var BulkPublishCompleteTime: js.UndefOr[_Date] = js.native
  /**
    * The date/time at which the last bulk publish was initiated.
    */
  var BulkPublishStartTime: js.UndefOr[_Date] = js.native
  /**
    * Status of the last bulk publish operation, valid values are: NOT_STARTED - No bulk publish has been requested for this identity pool IN_PROGRESS - Data is being published to the configured stream SUCCEEDED - All data for the identity pool has been published to the configured stream FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
    */
  var BulkPublishStatus: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.BulkPublishStatus] = js.native
  /**
    * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId] = js.native
}

object GetBulkPublishDetailsResponse {
  @scala.inline
  def apply(
    BulkPublishCompleteTime: _Date = null,
    BulkPublishStartTime: _Date = null,
    BulkPublishStatus: BulkPublishStatus = null,
    FailureMessage: String = null,
    IdentityPoolId: IdentityPoolId = null
  ): GetBulkPublishDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkPublishCompleteTime != null) __obj.updateDynamic("BulkPublishCompleteTime")(BulkPublishCompleteTime.asInstanceOf[js.Any])
    if (BulkPublishStartTime != null) __obj.updateDynamic("BulkPublishStartTime")(BulkPublishStartTime.asInstanceOf[js.Any])
    if (BulkPublishStatus != null) __obj.updateDynamic("BulkPublishStatus")(BulkPublishStatus.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBulkPublishDetailsResponse]
  }
}

