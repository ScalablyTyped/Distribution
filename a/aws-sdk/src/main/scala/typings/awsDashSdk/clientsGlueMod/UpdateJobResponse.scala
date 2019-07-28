package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobResponse extends js.Object {
  /**
    * Returns the name of the updated job definition.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}

object UpdateJobResponse {
  @scala.inline
  def apply(JobName: NameString = null): UpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    __obj.asInstanceOf[UpdateJobResponse]
  }
}

