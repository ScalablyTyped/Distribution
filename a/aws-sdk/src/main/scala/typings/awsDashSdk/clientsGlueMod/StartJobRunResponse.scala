package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRunResponse extends js.Object {
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object StartJobRunResponse {
  @scala.inline
  def apply(JobRunId: IdString = null): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunResponse]
  }
}

