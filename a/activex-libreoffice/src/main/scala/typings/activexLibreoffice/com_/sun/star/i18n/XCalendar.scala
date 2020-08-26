package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Access to locale specific calendar systems. */
@js.native
trait XCalendar extends XInterface {
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  var DateTime: Double = js.native
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  val Days: SafeArray[CalendarItem] = js.native
  /** returns the first day of a week, one of {@link Weekdays} values. */
  var FirstDayOfWeek: Double = js.native
  val LoadedCalendar: Calendar = js.native
  /** returns how many days of a week must reside in the first week of a year. */
  var MinimumNumberOfDaysForFirstWeek: Double = js.native
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  val Months: SafeArray[CalendarItem] = js.native
  val NumberOfDaysInWeek: Double = js.native
  val NumberOfMonthsInYear: Double = js.native
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  val UniqueID: String = js.native
  /**
    * Add an amount to a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nAmount The amount to add.
    */
  def addValue(nCalendarFieldIndex: Double, nAmount: Double): Unit = js.native
  def getAllCalendars(rLocale: Locale): SafeArray[String] = js.native
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def getDateTime(): Double = js.native
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  def getDays(): SafeArray[CalendarItem] = js.native
  /**
    * Returns a string (name to display) matching the given parameters.
    * @param nCalendarDisplayIndex One of {@link CalendarDisplayIndex} values
    * @param nIdx A value matching the **nCalendarDisplayIndex** type: **CalendarDisplayIndex::AM_PM**: one of {@link AmPmValue}**CalendarDisplayIndex::DAY**:
    * @param nNameType A value indicating whether to return the abbreviated or the full name, or the narrow name for some {@link CalendarDisplayIndex} values.
    * @since LibreOffice 3.5   This parameter is not used if the **nCalendarDisplayIndex** argument equals {@link CalendarDisplayIndex.AM_PM}
    */
  def getDisplayName(nCalendarDisplayIndex: Double, nIdx: Double, nNameType: Double): String = js.native
  /** returns the first day of a week, one of {@link Weekdays} values. */
  def getFirstDayOfWeek(): Double = js.native
  def getLoadedCalendar(): Calendar = js.native
  /** returns how many days of a week must reside in the first week of a year. */
  def getMinimumNumberOfDaysForFirstWeek(): Double = js.native
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  def getMonths(): SafeArray[CalendarItem] = js.native
  def getNumberOfDaysInWeek(): Double = js.native
  def getNumberOfMonthsInYear(): Double = js.native
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  def getUniqueID(): String = js.native
  /**
    * Get the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    */
  def getValue(nCalendarFieldIndex: Double): Double = js.native
  /**
    * Verify if the date fields set by a combination of {@link XCalendar.setValue()} calls is valid. It has a side-effect because it will internally
    * calculate the final value for the date fields
    */
  def isValid(): Boolean = js.native
  def loadCalendar(uniqueID: String, rLocale: Locale): Unit = js.native
  def loadDefaultCalendar(rLocale: Locale): Unit = js.native
  /**
    * Set the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def setDateTime(nTimeInDays: Double): Unit = js.native
  /** Set the first day of a week, one of {@link Weekdays} values. */
  def setFirstDayOfWeek(nDay: Double): Unit = js.native
  /** Set how many days of a week must reside in the first week of a year. */
  def setMinimumNumberOfDaysForFirstWeek(nDays: Double): Unit = js.native
  /**
    * Set the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nValue A value of the allowed range for the field index.
    */
  def setValue(nCalendarFieldIndex: Double, nValue: Double): Unit = js.native
}

object XCalendar {
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
  ): XCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDisplayName = js.Any.fromFunction3(getDisplayName), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XCalendar]
  }
  @scala.inline
  implicit class XCalendarOps[Self <: XCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateTime(value: Double): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDays(value: SafeArray[CalendarItem]): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("FirstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedCalendar(value: Calendar): Self = this.set("LoadedCalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = this.set("MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: SafeArray[CalendarItem]): Self = this.set("Months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfDaysInWeek(value: Double): Self = this.set("NumberOfDaysInWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfMonthsInYear(value: Double): Self = this.set("NumberOfMonthsInYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueID(value: String): Self = this.set("UniqueID", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddValue(value: (Double, Double) => Unit): Self = this.set("addValue", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAllCalendars(value: Locale => SafeArray[String]): Self = this.set("getAllCalendars", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDateTime(value: () => Double): Self = this.set("getDateTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDays(value: () => SafeArray[CalendarItem]): Self = this.set("getDays", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDisplayName(value: (Double, Double, Double) => String): Self = this.set("getDisplayName", js.Any.fromFunction3(value))
    @scala.inline
    def setGetFirstDayOfWeek(value: () => Double): Self = this.set("getFirstDayOfWeek", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLoadedCalendar(value: () => Calendar): Self = this.set("getLoadedCalendar", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinimumNumberOfDaysForFirstWeek(value: () => Double): Self = this.set("getMinimumNumberOfDaysForFirstWeek", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonths(value: () => SafeArray[CalendarItem]): Self = this.set("getMonths", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumberOfDaysInWeek(value: () => Double): Self = this.set("getNumberOfDaysInWeek", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumberOfMonthsInYear(value: () => Double): Self = this.set("getNumberOfMonthsInYear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUniqueID(value: () => String): Self = this.set("getUniqueID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: Double => Double): Self = this.set("getValue", js.Any.fromFunction1(value))
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadCalendar(value: (String, Locale) => Unit): Self = this.set("loadCalendar", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadDefaultCalendar(value: Locale => Unit): Self = this.set("loadDefaultCalendar", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDateTime(value: Double => Unit): Self = this.set("setDateTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFirstDayOfWeek(value: Double => Unit): Self = this.set("setFirstDayOfWeek", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinimumNumberOfDaysForFirstWeek(value: Double => Unit): Self = this.set("setMinimumNumberOfDaysForFirstWeek", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: (Double, Double) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
  }
  
}

