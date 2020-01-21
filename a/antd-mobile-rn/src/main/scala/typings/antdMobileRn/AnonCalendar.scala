package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendar extends js.Object {
  var calendar: AnonFirstDayOfWeek
  var day: String
  var hour: String
  var minute: String
  var month: String
  var year: String
}

object AnonCalendar {
  @scala.inline
  def apply(
    calendar: AnonFirstDayOfWeek,
    day: String,
    hour: String,
    minute: String,
    month: String,
    year: String
  ): AnonCalendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCalendar]
  }
}

