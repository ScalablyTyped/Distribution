package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeploySystemInstanceResponse extends js.Object {
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
}

object UndeploySystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary = null): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
}

