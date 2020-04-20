package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.moment.mod.Moment
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
    val __obj = js.Dynamic.literal(badgeTotal = badgeTotal.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], inMonth = inMonth.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], isWeekend = isWeekend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarCell]
  }
}

