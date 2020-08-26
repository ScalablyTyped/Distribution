package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateFormats extends js.Object {
  var datetime: String = js.native
  var day: String = js.native
  var hour: String = js.native
  var month: String = js.native
  var time: String = js.native
  var weekDay: String = js.native
}

object IDateFormats {
  @scala.inline
  def apply(datetime: String, day: String, hour: String, month: String, time: String, weekDay: String): IDateFormats = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateFormats]
  }
  @scala.inline
  implicit class IDateFormatsOps[Self <: IDateFormats] (val x: Self) extends AnyVal {
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
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekDay(value: String): Self = this.set("weekDay", value.asInstanceOf[js.Any])
  }
  
}

