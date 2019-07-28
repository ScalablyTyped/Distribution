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
    val __obj = js.Dynamic.literal(day = day, iso = iso, month = month, year = year)
  
    __obj.asInstanceOf[SelectEvent]
  }
}

