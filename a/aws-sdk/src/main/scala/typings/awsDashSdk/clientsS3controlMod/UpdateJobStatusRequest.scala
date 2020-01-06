package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobStatusRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsDashSdk.clientsS3controlMod.AccountId = js.native
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: typings.awsDashSdk.clientsS3controlMod.JobId = js.native
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: typings.awsDashSdk.clientsS3controlMod.RequestedJobStatus = js.native
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}

object UpdateJobStatusRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    JobId: JobId,
    RequestedJobStatus: RequestedJobStatus,
    StatusUpdateReason: JobStatusUpdateReason = null
  ): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    if (StatusUpdateReason != null) __obj.updateDynamic("StatusUpdateReason")(StatusUpdateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
}

