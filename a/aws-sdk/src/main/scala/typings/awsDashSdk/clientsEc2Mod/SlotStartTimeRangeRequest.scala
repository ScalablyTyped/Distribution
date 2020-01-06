package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotStartTimeRangeRequest extends js.Object {
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.UndefOr[DateTime] = js.native
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start.
    */
  var LatestTime: js.UndefOr[DateTime] = js.native
}

object SlotStartTimeRangeRequest {
  @scala.inline
  def apply(EarliestTime: DateTime = null, LatestTime: DateTime = null): SlotStartTimeRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (EarliestTime != null) __obj.updateDynamic("EarliestTime")(EarliestTime.asInstanceOf[js.Any])
    if (LatestTime != null) __obj.updateDynamic("LatestTime")(LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotStartTimeRangeRequest]
  }
}

