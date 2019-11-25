package typings.atAtlaskitCalendar.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEvent extends DateObj {
  var iso: String
}

object SelectEvent {
  @scala.inline
  def apply(day: Double, iso: String, month: Double, year: Double): SelectEvent = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectEvent]
  }
}

