package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarCell extends js.Object {
  var badgeTotal: scala.Double
  var date: momentLib.momentMod.Moment
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
    date: momentLib.momentMod.Moment,
    events: js.Array[IEvent],
    inMonth: scala.Boolean,
    isFuture: scala.Boolean,
    isPast: scala.Boolean,
    isToday: scala.Boolean,
    isWeekend: scala.Boolean,
    label: scala.Double
  ): ICalendarCell = {
    val __obj = js.Dynamic.literal(badgeTotal = badgeTotal, date = date, events = events, inMonth = inMonth, isFuture = isFuture, isPast = isPast, isToday = isToday, isWeekend = isWeekend, label = label)
  
    __obj.asInstanceOf[ICalendarCell]
  }
}

