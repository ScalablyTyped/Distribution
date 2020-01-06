package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCalendarStateResponse extends js.Object {
  /**
    * The time, as an ISO 8601 string, that you specified in your command. If you did not specify a time, GetCalendarState uses the current time.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The time, as an ISO 8601 string, that the calendar state will change. If the current calendar state is OPEN, NextTransitionTime indicates when the calendar state changes to CLOSED, and vice-versa.
    */
  var NextTransitionTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The state of the calendar. An OPEN calendar indicates that actions are allowed to proceed, and a CLOSED calendar indicates that actions are not allowed to proceed.
    */
  var State: js.UndefOr[CalendarState] = js.native
}

object GetCalendarStateResponse {
  @scala.inline
  def apply(
    AtTime: ISO8601String = null,
    NextTransitionTime: ISO8601String = null,
    State: CalendarState = null
  ): GetCalendarStateResponse = {
    val __obj = js.Dynamic.literal()
    if (AtTime != null) __obj.updateDynamic("AtTime")(AtTime.asInstanceOf[js.Any])
    if (NextTransitionTime != null) __obj.updateDynamic("NextTransitionTime")(NextTransitionTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalendarStateResponse]
  }
}

