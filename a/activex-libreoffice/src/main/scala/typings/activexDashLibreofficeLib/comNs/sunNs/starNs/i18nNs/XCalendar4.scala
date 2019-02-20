package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XCalendar3} and provides additional methods to set and get the local time.
  * @since LibreOffice 5.0
  */
trait XCalendar4 extends XCalendar3 {
  /**
    * Get the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and added to the UTC time at the calendar.
    */
  var LocalDateTime: scala.Double
  /**
    * Get the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and added to the UTC time at the calendar.
    */
  def getLocalDateTime(): scala.Double
  /**
    * Set the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and subtracted before setting the UTC time at
    * the calendar.
    */
  def setLocalDateTime(TimeInDays: scala.Double): scala.Unit
}

