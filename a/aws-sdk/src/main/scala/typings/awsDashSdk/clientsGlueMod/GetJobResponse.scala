package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobResponse extends js.Object {
  /**
    * The requested job definition.
    */
  var Job: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Job] = js.undefined
}

object GetJobResponse {
  @scala.inline
  def apply(Job: Job = null): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job)
    __obj.asInstanceOf[GetJobResponse]
  }
}

