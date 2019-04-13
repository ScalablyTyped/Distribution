package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopKeyPhrasesDetectionJobResponse extends js.Object {
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: js.UndefOr[JobId] = js.undefined
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopKeyPhrasesDetectionJob operation.
    */
  var JobStatus: js.UndefOr[JobStatus] = js.undefined
}

object StopKeyPhrasesDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StopKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobResponse]
  }
}

