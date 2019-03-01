package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarCell extends js.Object {
  var badgeTotal: scala.Double
  var date: momentLib.momentMod.momentNs.Moment
  var events: js.Array[IEvent]
  var inMonth: scala.Boolean
  var isFuture: scala.Boolean
  var isPast: scala.Boolean
  var isToday: scala.Boolean
  var isWeekend: scala.Boolean
  var label: scala.Double
}

object ICalendarCell {
  @scala.inline
  def apply(
    badgeTotal: scala.Double,
    date: momentLib.momentMod.momentNs.Moment,
    events: js.Array[IEvent],
    inMonth: scala.Boolean,
    isFuture: scala.Boolean,
    isPast: scala.Boolean,
    isToday: scala.Boolean,
    isWeekend: scala.Boolean,
    label: scala.Double
  ): ICalendarCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badgeTotal")(badgeTotal)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("inMonth")(inMonth)
    __obj.updateDynamic("isFuture")(isFuture)
    __obj.updateDynamic("isPast")(isPast)
    __obj.updateDynamic("isToday")(isToday)
    __obj.updateDynamic("isWeekend")(isWeekend)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ICalendarCell]
  }
}

