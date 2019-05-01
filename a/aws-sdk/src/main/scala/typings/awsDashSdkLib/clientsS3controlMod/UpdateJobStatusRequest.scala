package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobStatusRequest extends js.Object {
  /**
    * 
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: awsDashSdkLib.clientsS3controlMod.JobId
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: awsDashSdkLib.clientsS3controlMod.RequestedJobStatus
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
}

object UpdateJobStatusRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    JobId: JobId,
    RequestedJobStatus: RequestedJobStatus,
    StatusUpdateReason: JobStatusUpdateReason = null
  ): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, JobId = JobId, RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    if (StatusUpdateReason != null) __obj.updateDynamic("StatusUpdateReason")(StatusUpdateReason)
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
}

