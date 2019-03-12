package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Access to locale specific calendar systems. */
trait XCalendar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  var DateTime: scala.Double
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  val Days: stdLib.SafeArray[CalendarItem]
  /** returns the first day of a week, one of {@link Weekdays} values. */
  var FirstDayOfWeek: scala.Double
  val LoadedCalendar: Calendar
  /** returns how many days of a week must reside in the first week of a year. */
  var MinimumNumberOfDaysForFirstWeek: scala.Double
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  val Months: stdLib.SafeArray[CalendarItem]
  val NumberOfDaysInWeek: scala.Double
  val NumberOfMonthsInYear: scala.Double
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  val UniqueID: java.lang.String
  /**
    * Add an amount to a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nAmount The amount to add.
    */
  def addValue(nCalendarFieldIndex: scala.Double, nAmount: scala.Double): scala.Unit
  def getAllCalendars(rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def getDateTime(): scala.Double
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  def getDays(): stdLib.SafeArray[CalendarItem]
  /**
    * Returns a string (name to display) matching the given parameters.
    * @param nCalendarDisplayIndex One of {@link CalendarDisplayIndex} values
    * @param nIdx A value matching the **nCalendarDisplayIndex** type: **CalendarDisplayIndex::AM_PM**: one of {@link AmPmValue}**CalendarDisplayIndex::DAY**:
    * @param nNameType A value indicating whether to return the abbreviated or the full name, or the narrow name for some {@link CalendarDisplayIndex} values.
    * @since LibreOffice 3.5   This parameter is not used if the **nCalendarDisplayIndex** argument equals {@link CalendarDisplayIndex.AM_PM}
    */
  def getDisplayName(nCalendarDisplayIndex: scala.Double, nIdx: scala.Double, nNameType: scala.Double): java.lang.String
  /** returns the first day of a week, one of {@link Weekdays} values. */
  def getFirstDayOfWeek(): scala.Double
  def getLoadedCalendar(): Calendar
  /** returns how many days of a week must reside in the first week of a year. */
  def getMinimumNumberOfDaysForFirstWeek(): scala.Double
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  def getMonths(): stdLib.SafeArray[CalendarItem]
  def getNumberOfDaysInWeek(): scala.Double
  def getNumberOfMonthsInYear(): scala.Double
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  def getUniqueID(): java.lang.String
  /**
    * Get the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    */
  def getValue(nCalendarFieldIndex: scala.Double): scala.Double
  /**
    * Verify if the date fields set by a combination of {@link XCalendar.setValue()} calls is valid. It has a side-effect because it will internally
    * calculate the final value for the date fields
    */
  def isValid(): scala.Boolean
  def loadCalendar(uniqueID: java.lang.String, rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  def loadDefaultCalendar(rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * Set the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def setDateTime(nTimeInDays: scala.Double): scala.Unit
  /** Set the first day of a week, one of {@link Weekdays} values. */
  def setFirstDayOfWeek(nDay: scala.Double): scala.Unit
  /** Set how many days of a week must reside in the first week of a year. */
  def setMinimumNumberOfDaysForFirstWeek(nDays: scala.Double): scala.Unit
  /**
    * Set the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nValue A value of the allowed range for the field index.
    */
  def setValue(nCalendarFieldIndex: scala.Double, nValue: scala.Double): scala.Unit
}

object XCalendar {
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
  ): XCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, FirstDayOfWeek = FirstDayOfWeek, LoadedCalendar = LoadedCalendar, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, UniqueID = UniqueID, acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDisplayName = js.Any.fromFunction3(getDisplayName), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XCalendar]
  }
}

