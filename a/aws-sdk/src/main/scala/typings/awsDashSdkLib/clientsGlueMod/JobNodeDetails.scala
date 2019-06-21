package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobNodeDetails extends js.Object {
  /**
    * The information for the job runs represented by the job node.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.undefined
}

object JobNodeDetails {
  @scala.inline
  def apply(JobRuns: JobRunList = null): JobNodeDetails = {
    val __obj = js.Dynamic.literal()
    if (JobRuns != null) __obj.updateDynamic("JobRuns")(JobRuns)
    __obj.asInstanceOf[JobNodeDetails]
  }
}

