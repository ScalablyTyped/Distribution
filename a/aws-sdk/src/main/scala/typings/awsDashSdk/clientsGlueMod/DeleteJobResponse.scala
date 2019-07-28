package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobResponse extends js.Object {
  /**
    * The name of the job definition that was deleted.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}

object DeleteJobResponse {
  @scala.inline
  def apply(JobName: NameString = null): DeleteJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    __obj.asInstanceOf[DeleteJobResponse]
  }
}

