package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * The identifier of the medical entities detection job that was stopped.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobId] = js.native
}

object StopEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StopEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionV2JobResponse]
  }
}

