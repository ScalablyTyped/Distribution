package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEntitiesDetectionJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of job, use this identifier with the operation.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobId] = js.undefined
  /**
    * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.   STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is processing the request.   STOPPED - The job was successfully stopped without completing.  
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobStatus] = js.undefined
}

object StartEntitiesDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StartEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEntitiesDetectionJobResponse]
  }
}

