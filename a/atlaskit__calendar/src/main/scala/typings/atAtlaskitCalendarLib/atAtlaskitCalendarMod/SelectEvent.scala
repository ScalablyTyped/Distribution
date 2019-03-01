package typings
package atAtlaskitCalendarLib.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEvent extends DateObj {
  var iso: java.lang.String
}

object SelectEvent {
  @scala.inline
  def apply(day: scala.Double, iso: java.lang.String, month: scala.Double, year: scala.Double): SelectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("iso")(iso)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[SelectEvent]
  }
}

