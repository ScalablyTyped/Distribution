package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPHIDetectionJobResponse extends js.Object {
  /**
    * The identifier of the PHI detection job that was stopped.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobId] = js.native
}

object StopPHIDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StopPHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPHIDetectionJobResponse]
  }
}

