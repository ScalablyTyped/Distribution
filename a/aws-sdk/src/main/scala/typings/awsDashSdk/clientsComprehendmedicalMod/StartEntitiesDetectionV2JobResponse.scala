package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribeEntitiesDetectionV2Job operation.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobId] = js.native
}

object StartEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEntitiesDetectionV2JobResponse]
  }
}

