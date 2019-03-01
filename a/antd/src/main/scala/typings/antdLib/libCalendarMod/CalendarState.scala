package typings
package antdLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var value: momentLib.momentMod.momentNs.Moment
}

object CalendarState {
  @scala.inline
  def apply(value: momentLib.momentMod.momentNs.Moment, mode: CalendarMode = null): CalendarState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[CalendarState]
  }
}

