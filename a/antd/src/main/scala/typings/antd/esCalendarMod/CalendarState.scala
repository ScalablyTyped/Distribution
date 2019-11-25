package typings.antd.esCalendarMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var value: Moment
}

object CalendarState {
  @scala.inline
  def apply(value: Moment, mode: CalendarMode = null): CalendarState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
}

