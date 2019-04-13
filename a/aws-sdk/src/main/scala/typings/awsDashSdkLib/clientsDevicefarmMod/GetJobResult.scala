package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobResult extends js.Object {
  /**
    * An object containing information about the requested job.
    */
  var job: js.UndefOr[Job] = js.undefined
}

object GetJobResult {
  @scala.inline
  def apply(job: Job = null): GetJobResult = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job)
    __obj.asInstanceOf[GetJobResult]
  }
}

