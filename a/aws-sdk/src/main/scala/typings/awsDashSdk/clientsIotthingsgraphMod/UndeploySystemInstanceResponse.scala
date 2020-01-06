package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeploySystemInstanceResponse extends js.Object {
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
}

object UndeploySystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary = null): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
}

