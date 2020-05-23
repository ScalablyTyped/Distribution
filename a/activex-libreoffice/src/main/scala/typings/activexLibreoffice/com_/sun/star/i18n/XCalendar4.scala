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
  var LocalDateTime: Double
  /**
    * Get the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and added to the UTC time at the calendar.
    */
  def getLocalDateTime(): Double
  /**
    * Set the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and subtracted before setting the UTC time at
    * the calendar.
    */
  def setLocalDateTime(TimeInDays: Double): Unit
}

object XCalendar4 {
  @scala.inline
  def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    Days2: SafeArray[CalendarItem2],
    FirstDayOfWeek: Double,
    GenitiveMonths2: SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
    LocalDateTime: Double,
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Months2: SafeArray[CalendarItem2],
    NumberOfDaysInWeek: Double,
    NumberOfMonthsInYear: Double,
    PartitiveMonths2: SafeArray[CalendarItem2],
    UniqueID: String,
    acquire: () => Unit,
    addValue: (Double, Double) => Unit,
    getAllCalendars: Locale => SafeArray[String],
    getDateTime: () => Double,
    getDays: () => SafeArray[CalendarItem],
    getDays2: () => SafeArray[CalendarItem2],
    getDisplayName: (Double, Double, Double) => String,
    getDisplayString: (Double, Double) => String,
    getFirstDayOfWeek: () => Double,
    getGenitiveMonths2: () => SafeArray[CalendarItem2],
    getLoadedCalendar: () => Calendar,
    getLoadedCalendar2: () => Calendar2,
    getLocalDateTime: () => Double,
    getMinimumNumberOfDaysForFirstWeek: () => Double,
    getMonths: () => SafeArray[CalendarItem],
    getMonths2: () => SafeArray[CalendarItem2],
    getNumberOfDaysInWeek: () => Double,
    getNumberOfMonthsInYear: () => Double,
    getPartitiveMonths2: () => SafeArray[CalendarItem2],
    getUniqueID: () => String,
    getValue: Double => Double,
    isValid: () => Boolean,
    loadCalendar: (String, Locale) => Unit,
    loadDefaultCalendar: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDateTime: Double => Unit,
    setFirstDayOfWeek: Double => Unit,
    setLocalDateTime: Double => Unit,
    setMinimumNumberOfDaysForFirstWeek: Double => Unit,
    setValue: (Double, Double) => Unit
  ): XCalendar4 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Days2 = Days2.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], GenitiveMonths2 = GenitiveMonths2.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], LoadedCalendar2 = LoadedCalendar2.asInstanceOf[js.Any], LocalDateTime = LocalDateTime.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Months2 = Months2.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], PartitiveMonths2 = PartitiveMonths2.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDays2 = js.Any.fromFunction0(getDays2), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getGenitiveMonths2 = js.Any.fromFunction0(getGenitiveMonths2), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getLoadedCalendar2 = js.Any.fromFunction0(getLoadedCalendar2), getLocalDateTime = js.Any.fromFunction0(getLocalDateTime), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getMonths2 = js.Any.fromFunction0(getMonths2), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getPartitiveMonths2 = js.Any.fromFunction0(getPartitiveMonths2), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setLocalDateTime = js.Any.fromFunction1(setLocalDateTime), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XCalendar4]
  }
}

