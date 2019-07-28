package typings.atAtlaskitCalendar.atAtlaskitCalendarMod

import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.down
import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.left
import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.next
import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.prev
import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.right
import typings.atAtlaskitCalendar.atAtlaskitCalendarStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends DateObj {
  var iso: String
  var `type`: left | up | right | down | prev | next
}

object ChangeEvent {
  @scala.inline
  def apply(
    day: Double,
    iso: String,
    month: Double,
    `type`: left | up | right | down | prev | next,
    year: Double
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(day = day, iso = iso, month = month, year = year)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

