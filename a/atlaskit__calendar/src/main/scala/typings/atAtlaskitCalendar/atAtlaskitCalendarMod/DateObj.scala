package typings.atAtlaskitCalendar.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObj extends js.Object {
  var day: Double
  var month: Double
  var year: Double
}

object DateObj {
  @scala.inline
  def apply(day: Double, month: Double, year: Double): DateObj = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateObj]
  }
}

