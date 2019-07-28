package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSystemInstanceResponse extends js.Object {
  /**
    * The summary object that describes the new system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
}

object CreateSystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary = null): CreateSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[CreateSystemInstanceResponse]
  }
}

