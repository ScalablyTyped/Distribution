package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XExtendedCalendar} and provides additional methods to obtain {@link Calendar2} items that include the
  * possessive genitive case month names and sequences of {@link CalendarItem2} items..
  * @since LibreOffice 3.5
  */
trait XCalendar3 extends XExtendedCalendar {
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  val Days2: stdLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: stdLib.SafeArray[CalendarItem2]
  val LoadedCalendar2: Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: stdLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: stdLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): stdLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): stdLib.SafeArray[CalendarItem2]
  def getLoadedCalendar2(): Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): stdLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): stdLib.SafeArray[CalendarItem2]
}

object XCalendar3 {
  @scala.inline
  def apply(
    DateTime: scala.Double,
    Days: stdLib.SafeArray[CalendarItem],
    Days2: stdLib.SafeArray[CalendarItem2],
    FirstDayOfWeek: scala.Double,
    GenitiveMonths2: stdLib.SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: stdLib.SafeArray[CalendarItem],
    Months2: stdLib.SafeArray[CalendarItem2],
    NumberOfDaysInWeek: scala.Double,
    NumberOfMonthsInYear: scala.Double,
    PartitiveMonths2: stdLib.SafeArray[CalendarItem2],
    UniqueID: java.lang.String,
    acquire: () => scala.Unit,
    addValue: (scala.Double, scala.Double) => scala.Unit,
    getAllCalendars: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getDateTime: () => scala.Double,
    getDays: () => stdLib.SafeArray[CalendarItem],
    getDays2: () => stdLib.SafeArray[CalendarItem2],
    getDisplayName: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    getDisplayString: (scala.Double, scala.Double) => java.lang.String,
    getFirstDayOfWeek: () => scala.Double,
    getGenitiveMonths2: () => stdLib.SafeArray[CalendarItem2],
    getLoadedCalendar: () => Calendar,
    getLoadedCalendar2: () => Calendar2,
    getMinimumNumberOfDaysForFirstWeek: () => scala.Double,
    getMonths: () => stdLib.SafeArray[CalendarItem],
    getMonths2: () => stdLib.SafeArray[CalendarItem2],
    getNumberOfDaysInWeek: () => scala.Double,
    getNumberOfMonthsInYear: () => scala.Double,
    getPartitiveMonths2: () => stdLib.SafeArray[CalendarItem2],
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
  ): XCalendar3 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, Days2 = Days2, FirstDayOfWeek = FirstDayOfWeek, GenitiveMonths2 = GenitiveMonths2, LoadedCalendar = LoadedCalendar, LoadedCalendar2 = LoadedCalendar2, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, Months2 = Months2, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, PartitiveMonths2 = PartitiveMonths2, UniqueID = UniqueID, acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDays2 = js.Any.fromFunction0(getDays2), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getGenitiveMonths2 = js.Any.fromFunction0(getGenitiveMonths2), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getLoadedCalendar2 = js.Any.fromFunction0(getLoadedCalendar2), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getMonths2 = js.Any.fromFunction0(getMonths2), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getPartitiveMonths2 = js.Any.fromFunction0(getPartitiveMonths2), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XCalendar3]
  }
}

