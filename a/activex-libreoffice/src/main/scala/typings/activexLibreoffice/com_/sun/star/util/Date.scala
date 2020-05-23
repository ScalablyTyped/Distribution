package typings.activexLibreoffice.com_.sun.star.util

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
  var Day: Double
  /** contains the month of year (1-12 or 0 for a void date). */
  var Month: Double
  /** contains the year. */
  var Year: Double
}

object Date {
  @scala.inline
  def apply(Day: Double, Month: Double, Year: Double): Date = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

