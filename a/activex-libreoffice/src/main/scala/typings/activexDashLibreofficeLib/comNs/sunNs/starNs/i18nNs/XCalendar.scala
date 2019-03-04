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
  val Days: activexDashInteropLib.SafeArray[CalendarItem]
  /** returns the first day of a week, one of {@link Weekdays} values. */
  var FirstDayOfWeek: scala.Double
  val LoadedCalendar: Calendar
  /** returns how many days of a week must reside in the first week of a year. */
  var MinimumNumberOfDaysForFirstWeek: scala.Double
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  val Months: activexDashInteropLib.SafeArray[CalendarItem]
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
  def getAllCalendars(rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def getDateTime(): scala.Double
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  def getDays(): activexDashInteropLib.SafeArray[CalendarItem]
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
  def getMonths(): activexDashInteropLib.SafeArray[CalendarItem]
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
  ): XCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, FirstDayOfWeek = FirstDayOfWeek, LoadedCalendar = LoadedCalendar, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, UniqueID = UniqueID, acquire = acquire, addValue = addValue, getAllCalendars = getAllCalendars, getDateTime = getDateTime, getDays = getDays, getDisplayName = getDisplayName, getFirstDayOfWeek = getFirstDayOfWeek, getLoadedCalendar = getLoadedCalendar, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek, getMonths = getMonths, getNumberOfDaysInWeek = getNumberOfDaysInWeek, getNumberOfMonthsInYear = getNumberOfMonthsInYear, getUniqueID = getUniqueID, getValue = getValue, isValid = isValid, loadCalendar = loadCalendar, loadDefaultCalendar = loadDefaultCalendar, queryInterface = queryInterface, release = release, setDateTime = setDateTime, setFirstDayOfWeek = setFirstDayOfWeek, setMinimumNumberOfDaysForFirstWeek = setMinimumNumberOfDaysForFirstWeek, setValue = setValue)
  
    __obj.asInstanceOf[XCalendar]
  }
}

