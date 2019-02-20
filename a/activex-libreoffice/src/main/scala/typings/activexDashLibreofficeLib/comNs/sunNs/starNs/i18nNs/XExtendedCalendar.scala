package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XCalendar} and provides additional functionality to display parts of the date currently set at the
  * calendar.
  * @since OOo 1.1.2
  */
trait XExtendedCalendar extends XCalendar {
  /**
    * Returns a string (number or name to display) matching the given code constant.
    *
    * Note that the string returned depends completely on the locale's calendar. It is not predictable if the string will be numeric or a name, or if in
    * case it returns a numeric string how many digits that will have. For example, a short year display string will normally be two digits with a Gregorian
    * calendar, but with a Jewish calendar it will have three digits.
    * @param nCalendarDisplayCode One of {@link CalendarDisplayCode}
    * @param nNativeNumberMode One of {@link NativeNumberMode} . ;  This argument designates the basic transliteration mode as if specified for the year repre
    */
  def getDisplayString(nCalendarDisplayCode: scala.Double, nNativeNumberMode: scala.Double): java.lang.String
}

