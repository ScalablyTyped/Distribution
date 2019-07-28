package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopJobResult extends js.Object {
  /**
    * The job that was stopped.
    */
  var job: js.UndefOr[Job] = js.undefined
}

object StopJobResult {
  @scala.inline
  def apply(job: Job = null): StopJobResult = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job)
    __obj.asInstanceOf[StopJobResult]
  }
}

