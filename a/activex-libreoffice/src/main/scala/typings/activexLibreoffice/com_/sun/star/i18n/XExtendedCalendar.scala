package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
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
  def getDisplayString(nCalendarDisplayCode: Double, nNativeNumberMode: Double): String
}

object XExtendedCalendar {
  @scala.inline
  def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    FirstDayOfWeek: Double,
    LoadedCalendar: Calendar,
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    NumberOfDaysInWeek: Double,
    NumberOfMonthsInYear: Double,
    UniqueID: String,
    acquire: () => Unit,
    addValue: (Double, Double) => Unit,
    getAllCalendars: Locale => SafeArray[String],
    getDateTime: () => Double,
    getDays: () => SafeArray[CalendarItem],
    getDisplayName: (Double, Double, Double) => String,
    getDisplayString: (Double, Double) => String,
    getFirstDayOfWeek: () => Double,
    getLoadedCalendar: () => Calendar,
    getMinimumNumberOfDaysForFirstWeek: () => Double,
    getMonths: () => SafeArray[CalendarItem],
    getNumberOfDaysInWeek: () => Double,
    getNumberOfMonthsInYear: () => Double,
    getUniqueID: () => String,
    getValue: Double => Double,
    isValid: () => Boolean,
    loadCalendar: (String, Locale) => Unit,
    loadDefaultCalendar: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDateTime: Double => Unit,
    setFirstDayOfWeek: Double => Unit,
    setMinimumNumberOfDaysForFirstWeek: Double => Unit,
    setValue: (Double, Double) => Unit
  ): XExtendedCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XExtendedCalendar]
  }
}

