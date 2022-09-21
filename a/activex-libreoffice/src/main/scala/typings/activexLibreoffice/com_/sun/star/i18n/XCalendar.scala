package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to locale specific calendar systems. */
trait XCalendar
  extends StObject
     with XInterface {
  
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  var DateTime: Double
  
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  val Days: SafeArray[CalendarItem]
  
  /** returns the first day of a week, one of {@link Weekdays} values. */
  var FirstDayOfWeek: Double
  
  val LoadedCalendar: Calendar
  
  /** returns how many days of a week must reside in the first week of a year. */
  var MinimumNumberOfDaysForFirstWeek: Double
  
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  val Months: SafeArray[CalendarItem]
  
  val NumberOfDaysInWeek: Double
  
  val NumberOfMonthsInYear: Double
  
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  val UniqueID: String
  
  /**
    * Add an amount to a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nAmount The amount to add.
    */
  def addValue(nCalendarFieldIndex: Double, nAmount: Double): Unit
  
  def getAllCalendars(rLocale: Locale): SafeArray[String]
  
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def getDateTime(): Double
  
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  def getDays(): SafeArray[CalendarItem]
  
  /**
    * Returns a string (name to display) matching the given parameters.
    * @param nCalendarDisplayIndex One of {@link CalendarDisplayIndex} values
    * @param nIdx A value matching the **nCalendarDisplayIndex** type: **CalendarDisplayIndex::AM_PM**: one of {@link AmPmValue}**CalendarDisplayIndex::DAY**:
    * @param nNameType A value indicating whether to return the abbreviated or the full name, or the narrow name for some {@link CalendarDisplayIndex} values.
    * @since LibreOffice 3.5   This parameter is not used if the **nCalendarDisplayIndex** argument equals {@link CalendarDisplayIndex.AM_PM}
    */
  def getDisplayName(nCalendarDisplayIndex: Double, nIdx: Double, nNameType: Double): String
  
  /** returns the first day of a week, one of {@link Weekdays} values. */
  def getFirstDayOfWeek(): Double
  
  def getLoadedCalendar(): Calendar
  
  /** returns how many days of a week must reside in the first week of a year. */
  def getMinimumNumberOfDaysForFirstWeek(): Double
  
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  def getMonths(): SafeArray[CalendarItem]
  
  def getNumberOfDaysInWeek(): Double
  
  def getNumberOfMonthsInYear(): Double
  
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  def getUniqueID(): String
  
  /**
    * Get the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    */
  def getValue(nCalendarFieldIndex: Double): Double
  
  /**
    * Verify if the date fields set by a combination of {@link XCalendar.setValue()} calls is valid. It has a side-effect because it will internally
    * calculate the final value for the date fields
    */
  def isValid(): Boolean
  
  def loadCalendar(uniqueID: String, rLocale: Locale): Unit
  
  def loadDefaultCalendar(rLocale: Locale): Unit
  
  /**
    * Set the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def setDateTime(nTimeInDays: Double): Unit
  
  /** Set the first day of a week, one of {@link Weekdays} values. */
  def setFirstDayOfWeek(nDay: Double): Unit
  
  /** Set how many days of a week must reside in the first week of a year. */
  def setMinimumNumberOfDaysForFirstWeek(nDays: Double): Unit
  
  /**
    * Set the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nValue A value of the allowed range for the field index.
    */
  def setValue(nCalendarFieldIndex: Double, nValue: Double): Unit
}
object XCalendar {
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit,
    setDateTime: Double => Unit,
    setFirstDayOfWeek: Double => Unit,
    setMinimumNumberOfDaysForFirstWeek: Double => Unit,
    setValue: (Double, Double) => Unit
  ): XCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDisplayName = js.Any.fromFunction3(getDisplayName), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XCalendar]
  }
  
  extension [Self <: XCalendar](x: Self) {
    
    inline def setAddValue(value: (Double, Double) => Unit): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
    
    inline def setDateTime(value: Double): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
    
    inline def setDays(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "FirstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setGetAllCalendars(value: Locale => SafeArray[String]): Self = StObject.set(x, "getAllCalendars", js.Any.fromFunction1(value))
    
    inline def setGetDateTime(value: () => Double): Self = StObject.set(x, "getDateTime", js.Any.fromFunction0(value))
    
    inline def setGetDays(value: () => SafeArray[CalendarItem]): Self = StObject.set(x, "getDays", js.Any.fromFunction0(value))
    
    inline def setGetDisplayName(value: (Double, Double, Double) => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction3(value))
    
    inline def setGetFirstDayOfWeek(value: () => Double): Self = StObject.set(x, "getFirstDayOfWeek", js.Any.fromFunction0(value))
    
    inline def setGetLoadedCalendar(value: () => Calendar): Self = StObject.set(x, "getLoadedCalendar", js.Any.fromFunction0(value))
    
    inline def setGetMinimumNumberOfDaysForFirstWeek(value: () => Double): Self = StObject.set(x, "getMinimumNumberOfDaysForFirstWeek", js.Any.fromFunction0(value))
    
    inline def setGetMonths(value: () => SafeArray[CalendarItem]): Self = StObject.set(x, "getMonths", js.Any.fromFunction0(value))
    
    inline def setGetNumberOfDaysInWeek(value: () => Double): Self = StObject.set(x, "getNumberOfDaysInWeek", js.Any.fromFunction0(value))
    
    inline def setGetNumberOfMonthsInYear(value: () => Double): Self = StObject.set(x, "getNumberOfMonthsInYear", js.Any.fromFunction0(value))
    
    inline def setGetUniqueID(value: () => String): Self = StObject.set(x, "getUniqueID", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: Double => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setLoadCalendar(value: (String, Locale) => Unit): Self = StObject.set(x, "loadCalendar", js.Any.fromFunction2(value))
    
    inline def setLoadDefaultCalendar(value: Locale => Unit): Self = StObject.set(x, "loadDefaultCalendar", js.Any.fromFunction1(value))
    
    inline def setLoadedCalendar(value: Calendar): Self = StObject.set(x, "LoadedCalendar", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = StObject.set(x, "MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDaysInWeek(value: Double): Self = StObject.set(x, "NumberOfDaysInWeek", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsInYear(value: Double): Self = StObject.set(x, "NumberOfMonthsInYear", value.asInstanceOf[js.Any])
    
    inline def setSetDateTime(value: Double => Unit): Self = StObject.set(x, "setDateTime", js.Any.fromFunction1(value))
    
    inline def setSetFirstDayOfWeek(value: Double => Unit): Self = StObject.set(x, "setFirstDayOfWeek", js.Any.fromFunction1(value))
    
    inline def setSetMinimumNumberOfDaysForFirstWeek(value: Double => Unit): Self = StObject.set(x, "setMinimumNumberOfDaysForFirstWeek", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: (Double, Double) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setUniqueID(value: String): Self = StObject.set(x, "UniqueID", value.asInstanceOf[js.Any])
  }
}
