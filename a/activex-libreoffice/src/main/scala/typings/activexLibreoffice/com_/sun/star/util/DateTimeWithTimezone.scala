package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a combined date+time value with time zone.
  * @since LibreOffice 4.1
  */
trait DateTimeWithTimezone extends js.Object {
  /** the date and time (in TimeZone) */
  var DateTimeInTZ: DateTime
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC datetime from DateTimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: Double
}

object DateTimeWithTimezone {
  @scala.inline
  def apply(DateTimeInTZ: DateTime, Timezone: Double): DateTimeWithTimezone = {
    val __obj = js.Dynamic.literal(DateTimeInTZ = DateTimeInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeWithTimezone]
  }
}

