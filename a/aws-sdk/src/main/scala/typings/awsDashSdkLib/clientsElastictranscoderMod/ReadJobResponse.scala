package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadJobResponse extends js.Object {
  /**
    * A section of the response body that provides information about the job.
    */
  var Job: js.UndefOr[Job] = js.undefined
}

object ReadJobResponse {
  @scala.inline
  def apply(Job: Job = null): ReadJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job)
    __obj.asInstanceOf[ReadJobResponse]
  }
}

