package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopJobResult extends js.Object {
  /**
    * The job that was stopped.
    */
  var job: js.UndefOr[Job] = js.native
}

object StopJobResult {
  @scala.inline
  def apply(job: Job = null): StopJobResult = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobResult]
  }
}

