package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobResult extends js.Object {
  /**
    * The ID for this job. Amazon S3 generates this ID automatically and returns it after a successful Create Job request.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobId] = js.undefined
}

object CreateJobResult {
  @scala.inline
  def apply(JobId: JobId = null): CreateJobResult = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[CreateJobResult]
  }
}

