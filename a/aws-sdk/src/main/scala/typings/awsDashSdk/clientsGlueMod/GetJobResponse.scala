package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResponse extends js.Object {
  /**
    * The requested job definition.
    */
  var Job: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Job] = js.native
}

object GetJobResponse {
  @scala.inline
  def apply(Job: Job = null): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResponse]
  }
}

