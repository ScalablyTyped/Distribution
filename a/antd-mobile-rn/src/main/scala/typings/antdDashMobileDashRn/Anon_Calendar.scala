package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendar extends js.Object {
  var calendar: Anon_FirstDayOfWeek
  var day: String
  var hour: String
  var minute: String
  var month: String
  var year: String
}

object Anon_Calendar {
  @scala.inline
  def apply(
    calendar: Anon_FirstDayOfWeek,
    day: String,
    hour: String,
    minute: String,
    month: String,
    year: String
  ): Anon_Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Calendar]
  }
}

