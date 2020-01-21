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
}

