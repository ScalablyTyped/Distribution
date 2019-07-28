package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobResponse extends js.Object {
  /**
    * A section of the response body that provides information about the job that is created.
    */
  var Job: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Job] = js.undefined
}

object CreateJobResponse {
  @scala.inline
  def apply(Job: Job = null): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job)
    __obj.asInstanceOf[CreateJobResponse]
  }
}

