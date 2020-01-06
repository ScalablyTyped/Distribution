package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobStatusResult extends js.Object {
  /**
    * The ID for the job whose status was updated.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobId] = js.native
  /**
    * The current status for the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * The reason that the specified job's status was updated.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}

object UpdateJobStatusResult {
  @scala.inline
  def apply(JobId: JobId = null, Status: JobStatus = null, StatusUpdateReason: JobStatusUpdateReason = null): UpdateJobStatusResult = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusUpdateReason != null) __obj.updateDynamic("StatusUpdateReason")(StatusUpdateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusResult]
  }
}

