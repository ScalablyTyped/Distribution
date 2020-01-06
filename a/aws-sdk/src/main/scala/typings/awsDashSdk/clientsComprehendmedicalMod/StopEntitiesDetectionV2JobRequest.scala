package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionV2JobRequest extends js.Object {
  /**
    * The identifier of the medical entities job to stop.
    */
  var JobId: typings.awsDashSdk.clientsComprehendmedicalMod.JobId = js.native
}

object StopEntitiesDetectionV2JobRequest {
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopEntitiesDetectionV2JobRequest]
  }
}

