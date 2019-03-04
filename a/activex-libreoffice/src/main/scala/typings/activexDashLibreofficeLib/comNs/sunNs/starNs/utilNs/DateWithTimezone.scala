package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a date value with time zone.
  * @since LibreOffice 4.1
  */
trait DateWithTimezone extends js.Object {
  /** the date. */
  var DateInTZ: Date
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain time in that timezone.
    */
  var Timezone: scala.Double
}

object DateWithTimezone {
  @scala.inline
  def apply(DateInTZ: Date, Timezone: scala.Double): DateWithTimezone = {
    val __obj = js.Dynamic.literal(DateInTZ = DateInTZ, Timezone = Timezone)
  
    __obj.asInstanceOf[DateWithTimezone]
  }
}

