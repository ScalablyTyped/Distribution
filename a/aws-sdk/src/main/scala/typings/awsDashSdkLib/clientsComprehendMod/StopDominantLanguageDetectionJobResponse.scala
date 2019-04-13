package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: js.UndefOr[JobId] = js.undefined
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopDominantLanguageDetectionJob operation.
    */
  var JobStatus: js.UndefOr[JobStatus] = js.undefined
}

object StopDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StopDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDominantLanguageDetectionJobResponse]
  }
}

