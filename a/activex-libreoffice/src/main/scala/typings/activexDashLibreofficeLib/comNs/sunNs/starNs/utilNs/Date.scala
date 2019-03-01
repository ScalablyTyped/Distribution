package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a date value.
  *
  * The time zone is unknown.
  */
trait Date extends js.Object {
  /** contains the day of month (1-31 or 0 for a void date). */
  var Day: scala.Double
  /** contains the month of year (1-12 or 0 for a void date). */
  var Month: scala.Double
  /** contains the year. */
  var Year: scala.Double
}

object Date {
  @scala.inline
  def apply(Day: scala.Double, Month: scala.Double, Year: scala.Double): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Day")(Day)
    __obj.updateDynamic("Month")(Month)
    __obj.updateDynamic("Year")(Year)
    __obj.asInstanceOf[Date]
  }
}

