package typings
package atAtlaskitCalendarLib.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObj extends js.Object {
  var day: scala.Double
  var month: scala.Double
  var year: scala.Double
}

object DateObj {
  @scala.inline
  def apply(day: scala.Double, month: scala.Double, year: scala.Double): DateObj = {
    val __obj = js.Dynamic.literal(day = day, month = month, year = year)
  
    __obj.asInstanceOf[DateObj]
  }
}

