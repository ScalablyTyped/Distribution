package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobRequest extends js.Object {
  /**
    * The AWS Batch job ID of the job to cancel.
    */
  var jobId: String = js.native
  /**
    * A message to attach to the job that explains the reason for canceling it. This message is returned by future DescribeJobs operations on the job. This message is also recorded in the AWS Batch activity logs.
    */
  var reason: String = js.native
}

object CancelJobRequest {
  @scala.inline
  def apply(jobId: String, reason: String): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  @scala.inline
  implicit class CancelJobRequestOps[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

