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
    Days: stdLib.SafeArray[CalendarItem],
    FirstDayOfWeek: scala.Double,
    LoadedCalendar: Calendar,
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: stdLib.SafeArray[CalendarItem],
    NumberOfDaysInWeek: scala.Double,
    NumberOfMonthsInYear: scala.Double,
    UniqueID: java.lang.String,
    acquire: () => scala.Unit,
    addValue: (scala.Double, scala.Double) => scala.Unit,
    getAllCalendars: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getDateTime: () => scala.Double,
    getDays: () => stdLib.SafeArray[CalendarItem],
    getDisplayName: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    getDisplayString: (scala.Double, scala.Double) => java.lang.String,
    getFirstDayOfWeek: () => scala.Double,
    getLoadedCalendar: () => Calendar,
    getMinimumNumberOfDaysForFirstWeek: () => scala.Double,
    getMonths: () => stdLib.SafeArray[CalendarItem],
    getNumberOfDaysInWeek: () => scala.Double,
    getNumberOfMonthsInYear: () => scala.Double,
    getUniqueID: () => java.lang.String,
    getValue: scala.Double => scala.Double,
    isValid: () => scala.Boolean,
    loadCalendar: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    loadDefaultCalendar: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDateTime: scala.Double => scala.Unit,
    setFirstDayOfWeek: scala.Double => scala.Unit,
    setMinimumNumberOfDaysForFirstWeek: scala.Double => scala.Unit,
    setValue: (scala.Double, scala.Double) => scala.Unit
  ): XExtendedCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, FirstDayOfWeek = FirstDayOfWeek, LoadedCalendar = LoadedCalendar, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, UniqueID = UniqueID, acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XExtendedCalendar]
  }
}

