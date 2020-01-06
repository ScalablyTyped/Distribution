package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutJobFailureResultInput extends js.Object {
  /**
    * The details about the failure of a job.
    */
  var failureDetails: FailureDetails = js.native
  /**
    * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId = js.native
}

object PutJobFailureResultInput {
  @scala.inline
  def apply(failureDetails: FailureDetails, jobId: JobId): PutJobFailureResultInput = {
    val __obj = js.Dynamic.literal(failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutJobFailureResultInput]
  }
}

