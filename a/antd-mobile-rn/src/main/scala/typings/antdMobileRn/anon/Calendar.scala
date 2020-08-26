package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  var calendar: FirstDayOfWeek = js.native
  var day: String = js.native
  var hour: String = js.native
  var minute: String = js.native
  var month: String = js.native
  var year: String = js.native
}

object Calendar {
  @scala.inline
  def apply(calendar: FirstDayOfWeek, day: String, hour: String, minute: String, month: String, year: String): Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
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
    def setCalendar(value: FirstDayOfWeek): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

