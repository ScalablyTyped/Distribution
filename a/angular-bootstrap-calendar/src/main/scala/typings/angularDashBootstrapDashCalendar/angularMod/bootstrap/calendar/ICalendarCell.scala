package typings.angularDashBootstrapDashCalendar.angularMod.bootstrap.calendar

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarCell extends js.Object {
  var badgeTotal: Double
  var date: Moment
  var events: js.Array[IEvent]
  var inMonth: Boolean
  var isFuture: Boolean
  var isPast: Boolean
  var isToday: Boolean
  var isWeekend: Boolean
  var label: Double
}

object ICalendarCell {
  @scala.inline
  def apply(
    badgeTotal: Double,
    date: Moment,
    events: js.Array[IEvent],
    inMonth: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isToday: Boolean,
    isWeekend: Boolean,
    label: Double
  ): ICalendarCell = {
    val __obj = js.Dynamic.literal(badgeTotal = badgeTotal, date = date, events = events, inMonth = inMonth, isFuture = isFuture, isPast = isPast, isToday = isToday, isWeekend = isWeekend, label = label)
  
    __obj.asInstanceOf[ICalendarCell]
  }
}

