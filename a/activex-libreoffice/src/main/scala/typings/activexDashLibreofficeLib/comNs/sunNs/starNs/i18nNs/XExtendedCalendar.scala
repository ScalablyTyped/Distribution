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

object XExtendedCalendar {
  @scala.inline
  def apply(
    DateTime: scala.Double,
    Days: activexDashInteropLib.SafeArray[CalendarItem],
    FirstDayOfWeek: scala.Double,
    LoadedCalendar: Calendar,
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: activexDashInteropLib.SafeArray[CalendarItem],
    NumberOfDaysInWeek: scala.Double,
    NumberOfMonthsInYear: scala.Double,
    UniqueID: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addValue: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAllCalendars: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getDateTime: js.Function0[scala.Double],
    getDays: js.Function0[activexDashInteropLib.SafeArray[CalendarItem]],
    getDisplayName: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    getDisplayString: js.Function2[scala.Double, scala.Double, java.lang.String],
    getFirstDayOfWeek: js.Function0[scala.Double],
    getLoadedCalendar: js.Function0[Calendar],
    getMinimumNumberOfDaysForFirstWeek: js.Function0[scala.Double],
    getMonths: js.Function0[activexDashInteropLib.SafeArray[CalendarItem]],
    getNumberOfDaysInWeek: js.Function0[scala.Double],
    getNumberOfMonthsInYear: js.Function0[scala.Double],
    getUniqueID: js.Function0[java.lang.String],
    getValue: js.Function1[scala.Double, scala.Double],
    isValid: js.Function0[scala.Boolean],
    loadCalendar: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadDefaultCalendar: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDateTime: js.Function1[scala.Double, scala.Unit],
    setFirstDayOfWeek: js.Function1[scala.Double, scala.Unit],
    setMinimumNumberOfDaysForFirstWeek: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XExtendedCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, FirstDayOfWeek = FirstDayOfWeek, LoadedCalendar = LoadedCalendar, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, UniqueID = UniqueID, acquire = acquire, addValue = addValue, getAllCalendars = getAllCalendars, getDateTime = getDateTime, getDays = getDays, getDisplayName = getDisplayName, getDisplayString = getDisplayString, getFirstDayOfWeek = getFirstDayOfWeek, getLoadedCalendar = getLoadedCalendar, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek, getMonths = getMonths, getNumberOfDaysInWeek = getNumberOfDaysInWeek, getNumberOfMonthsInYear = getNumberOfMonthsInYear, getUniqueID = getUniqueID, getValue = getValue, isValid = isValid, loadCalendar = loadCalendar, loadDefaultCalendar = loadDefaultCalendar, queryInterface = queryInterface, release = release, setDateTime = setDateTime, setFirstDayOfWeek = setFirstDayOfWeek, setMinimumNumberOfDaysForFirstWeek = setMinimumNumberOfDaysForFirstWeek, setValue = setValue)
  
    __obj.asInstanceOf[XExtendedCalendar]
  }
}

