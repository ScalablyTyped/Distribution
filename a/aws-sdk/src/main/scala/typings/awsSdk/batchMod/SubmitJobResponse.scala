package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitJobResponse extends js.Object {
  /**
    * The unique identifier for the job.
    */
  var jobId: String = js.native
  /**
    * The name of the job.
    */
  var jobName: String = js.native
}

object SubmitJobResponse {
  @scala.inline
  def apply(jobId: String, jobName: String): SubmitJobResponse = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitJobResponse]
  }
  @scala.inline
  implicit class SubmitJobResponseOps[Self <: SubmitJobResponse] (val x: Self) extends AnyVal {
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
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
  }
  
}

