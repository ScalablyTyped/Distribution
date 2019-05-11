package typings
package antdLib.esCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var value: momentLib.momentMod.Moment
}

object CalendarState {
  @scala.inline
  def apply(value: momentLib.momentMod.Moment, mode: CalendarMode = null): CalendarState = {
    val __obj = js.Dynamic.literal(value = value)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[CalendarState]
  }
}

