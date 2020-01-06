package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCalendarStateRequest extends js.Object {
  /**
    * (Optional) The specific time for which you want to get calendar state information, in ISO 8601 format. If you do not add AtTime, the current time is assumed.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.
    */
  var CalendarNames: CalendarNameOrARNList = js.native
}

object GetCalendarStateRequest {
  @scala.inline
  def apply(CalendarNames: CalendarNameOrARNList, AtTime: ISO8601String = null): GetCalendarStateRequest = {
    val __obj = js.Dynamic.literal(CalendarNames = CalendarNames.asInstanceOf[js.Any])
    if (AtTime != null) __obj.updateDynamic("AtTime")(AtTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalendarStateRequest]
  }
}

