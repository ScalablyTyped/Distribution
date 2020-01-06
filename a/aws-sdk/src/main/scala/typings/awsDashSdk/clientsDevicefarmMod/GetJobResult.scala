package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResult extends js.Object {
  /**
    * An object that contains information about the requested job.
    */
  var job: js.UndefOr[Job] = js.native
}

object GetJobResult {
  @scala.inline
  def apply(job: Job = null): GetJobResult = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResult]
  }
}

