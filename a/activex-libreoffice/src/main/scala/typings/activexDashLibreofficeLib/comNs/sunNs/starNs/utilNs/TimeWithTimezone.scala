package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a combined time value with time zone.
  * @since LibreOffice 4.1
  */
trait TimeWithTimezone extends js.Object {
  /** the time (in TimeZone) */
  var TimeInTZ: Time
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC time from TimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: scala.Double
}

object TimeWithTimezone {
  @scala.inline
  def apply(TimeInTZ: Time, Timezone: scala.Double): TimeWithTimezone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TimeInTZ")(TimeInTZ)
    __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[TimeWithTimezone]
  }
}

