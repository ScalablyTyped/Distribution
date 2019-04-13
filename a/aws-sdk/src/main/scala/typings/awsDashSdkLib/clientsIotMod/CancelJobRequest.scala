package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobRequest extends js.Object {
  /**
    * An optional comment string describing why the job was canceled.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  /**
    * (Optional) If true job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job executions with status "QUEUED" are canceled. The default is false. Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the job execution status. Use caution and ensure that each device executing a job which is canceled is able to recover to a valid state.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  /**
    * (Optional)A reason code string that explains why the job was canceled.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.undefined
}

object CancelJobRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    comment: Comment = null,
    force: js.UndefOr[ForceFlag] = js.undefined,
    reasonCode: ReasonCode = null
  ): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    __obj.asInstanceOf[CancelJobRequest]
  }
}

