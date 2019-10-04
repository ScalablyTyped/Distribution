package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPHIDetectionJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribePHIDetectionJob operation.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}

object StartPHIDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartPHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartPHIDetectionJobResponse]
  }
}

