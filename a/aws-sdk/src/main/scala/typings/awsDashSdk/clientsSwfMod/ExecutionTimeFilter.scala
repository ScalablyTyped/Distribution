package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionTimeFilter extends js.Object {
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: Timestamp = js.native
}

object ExecutionTimeFilter {
  @scala.inline
  def apply(oldestDate: Timestamp, latestDate: Timestamp = null): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate.asInstanceOf[js.Any])
    if (latestDate != null) __obj.updateDynamic("latestDate")(latestDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
}

