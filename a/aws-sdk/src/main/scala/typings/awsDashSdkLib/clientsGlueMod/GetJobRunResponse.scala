package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRunResponse extends js.Object {
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[JobRun] = js.undefined
}

object GetJobRunResponse {
  @scala.inline
  def apply(JobRun: JobRun = null): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRun != null) __obj.updateDynamic("JobRun")(JobRun)
    __obj.asInstanceOf[GetJobRunResponse]
  }
}

