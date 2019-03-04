package typings
package atAtlaskitCalendarLib.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends DateObj {
  var iso: java.lang.String
  var `type`: atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.left | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.up | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.right | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.down | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.prev | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.next
}

object ChangeEvent {
  @scala.inline
  def apply(
    day: scala.Double,
    iso: java.lang.String,
    month: scala.Double,
    `type`: atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.left | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.up | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.right | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.down | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.prev | atAtlaskitCalendarLib.atAtlaskitCalendarLibStrings.next,
    year: scala.Double
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(day = day, iso = iso, month = month, year = year)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

