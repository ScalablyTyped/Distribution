package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionTimeFilter extends js.Object {
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: Timestamp
}

object ExecutionTimeFilter {
  @scala.inline
  def apply(oldestDate: Timestamp, latestDate: Timestamp = null): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate)
    if (latestDate != null) __obj.updateDynamic("latestDate")(latestDate)
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
}

