package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartJobRunResponse extends js.Object {
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}

object StartJobRunResponse {
  @scala.inline
  def apply(JobRunId: IdString = null): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId)
    __obj.asInstanceOf[StartJobRunResponse]
  }
}

