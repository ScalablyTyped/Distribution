package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

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
  var Timezone: scala.Double
}

object DateTimeWithTimezone {
  @scala.inline
  def apply(DateTimeInTZ: DateTime, Timezone: scala.Double): DateTimeWithTimezone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateTimeInTZ")(DateTimeInTZ)
    __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[DateTimeWithTimezone]
  }
}

