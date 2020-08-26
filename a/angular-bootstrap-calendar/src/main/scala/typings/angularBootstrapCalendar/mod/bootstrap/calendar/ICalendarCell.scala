package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarCell extends js.Object {
  var badgeTotal: Double = js.native
  var date: Moment = js.native
  var events: js.Array[IEvent] = js.native
  var inMonth: Boolean = js.native
  var isFuture: Boolean = js.native
  var isPast: Boolean = js.native
  var isToday: Boolean = js.native
  var isWeekend: Boolean = js.native
  var label: Double = js.native
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
  @scala.inline
  implicit class ICalendarCellOps[Self <: ICalendarCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBadgeTotal(value: Double): Self = this.set("badgeTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Moment): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: IEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setInMonth(value: Boolean): Self = this.set("inMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFuture(value: Boolean): Self = this.set("isFuture", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPast(value: Boolean): Self = this.set("isPast", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsToday(value: Boolean): Self = this.set("isToday", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWeekend(value: Boolean): Self = this.set("isWeekend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Double): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

