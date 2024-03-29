package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XExtendedCalendar} and provides additional methods to obtain {@link Calendar2} items that include the
  * possessive genitive case month names and sequences of {@link CalendarItem2} items..
  * @since LibreOffice 3.5
  */
trait XCalendar3
  extends StObject
     with XExtendedCalendar {
  
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  val Days2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: SafeArray[CalendarItem2]
  
  val LoadedCalendar2: Calendar2
  
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): SafeArray[CalendarItem2]
  
  def getLoadedCalendar2(): Calendar2
  
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): SafeArray[CalendarItem2]
}
object XCalendar3 {
  
  inline def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    Days2: SafeArray[CalendarItem2],
    FirstDayOfWeek: Double,
    GenitiveMonths2: SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
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
    queryInterface: `type` => Any,
    release: () => Unit,
    setDateTime: Double => Unit,
    setFirstDayOfWeek: Double => Unit,
    setMinimumNumberOfDaysForFirstWeek: Double => Unit,
    setValue: (Double, Double) => Unit
  ): XCalendar3 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Days2 = Days2.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], GenitiveMonths2 = GenitiveMonths2.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], LoadedCalendar2 = LoadedCalendar2.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Months2 = Months2.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], PartitiveMonths2 = PartitiveMonths2.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDays2 = js.Any.fromFunction0(getDays2), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getGenitiveMonths2 = js.Any.fromFunction0(getGenitiveMonths2), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getLoadedCalendar2 = js.Any.fromFunction0(getLoadedCalendar2), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getMonths2 = js.Any.fromFunction0(getMonths2), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getPartitiveMonths2 = js.Any.fromFunction0(getPartitiveMonths2), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XCalendar3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCalendar3] (val x: Self) extends AnyVal {
    
    inline def setDays2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Days2", value.asInstanceOf[js.Any])
    
    inline def setGenitiveMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "GenitiveMonths2", value.asInstanceOf[js.Any])
    
    inline def setGetDays2(value: () => SafeArray[CalendarItem2]): Self = StObject.set(x, "getDays2", js.Any.fromFunction0(value))
    
    inline def setGetGenitiveMonths2(value: () => SafeArray[CalendarItem2]): Self = StObject.set(x, "getGenitiveMonths2", js.Any.fromFunction0(value))
    
    inline def setGetLoadedCalendar2(value: () => Calendar2): Self = StObject.set(x, "getLoadedCalendar2", js.Any.fromFunction0(value))
    
    inline def setGetMonths2(value: () => SafeArray[CalendarItem2]): Self = StObject.set(x, "getMonths2", js.Any.fromFunction0(value))
    
    inline def setGetPartitiveMonths2(value: () => SafeArray[CalendarItem2]): Self = StObject.set(x, "getPartitiveMonths2", js.Any.fromFunction0(value))
    
    inline def setLoadedCalendar2(value: Calendar2): Self = StObject.set(x, "LoadedCalendar2", value.asInstanceOf[js.Any])
    
    inline def setMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Months2", value.asInstanceOf[js.Any])
    
    inline def setPartitiveMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "PartitiveMonths2", value.asInstanceOf[js.Any])
  }
}
