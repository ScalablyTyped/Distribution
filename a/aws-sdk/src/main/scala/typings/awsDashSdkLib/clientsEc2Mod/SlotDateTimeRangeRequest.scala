package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotDateTimeRangeRequest extends js.Object {
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: DateTime
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
    */
  var LatestTime: DateTime
}

object SlotDateTimeRangeRequest {
  @scala.inline
  def apply(EarliestTime: DateTime, LatestTime: DateTime): SlotDateTimeRangeRequest = {
    val __obj = js.Dynamic.literal(EarliestTime = EarliestTime, LatestTime = LatestTime)
  
    __obj.asInstanceOf[SlotDateTimeRangeRequest]
  }
}

