package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutJobFailureResultInput extends js.Object {
  /**
    * The details about the failure of a job.
    */
  var failureDetails: FailureDetails
  /**
    * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId
}

object PutJobFailureResultInput {
  @scala.inline
  def apply(failureDetails: FailureDetails, jobId: JobId): PutJobFailureResultInput = {
    val __obj = js.Dynamic.literal(failureDetails = failureDetails, jobId = jobId)
  
    __obj.asInstanceOf[PutJobFailureResultInput]
  }
}

