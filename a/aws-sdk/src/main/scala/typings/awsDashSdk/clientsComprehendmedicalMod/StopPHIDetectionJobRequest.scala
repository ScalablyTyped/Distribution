package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopPHIDetectionJobRequest extends js.Object {
  /**
    * The identifier of the PHI detection job to stop.
    */
  var JobId: typings.awsDashSdk.clientsComprehendmedicalMod.JobId
}

object StopPHIDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopPHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[StopPHIDetectionJobRequest]
  }
}

