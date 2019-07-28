package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSentimentDetectionJobResponse extends js.Object {
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobId] = js.undefined
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopSentimentDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobStatus] = js.undefined
}

object StopSentimentDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StopSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSentimentDetectionJobResponse]
  }
}

