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
  * It is derived from {@link com.sun.star.i18n.XExtendedCalendar} and provides additional methods to obtain {@link Calendar2} items that include the
  * possessive genitive case month names and sequences of {@link CalendarItem2} items..
  * @since LibreOffice 3.5
  */
@js.native
trait XCalendar3 extends XExtendedCalendar {
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  val Days2: SafeArray[CalendarItem2] = js.native
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: SafeArray[CalendarItem2] = js.native
  val LoadedCalendar2: Calendar2 = js.native
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: SafeArray[CalendarItem2] = js.native
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: SafeArray[CalendarItem2] = js.native
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): SafeArray[CalendarItem2] = js.native
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): SafeArray[CalendarItem2] = js.native
  def getLoadedCalendar2(): Calendar2 = js.native
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): SafeArray[CalendarItem2] = js.native
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): SafeArray[CalendarItem2] = js.native
}

object XCalendar3 {
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
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
  implicit class XCalendar3Ops[Self <: XCalendar3] (val x: Self) extends AnyVal {
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
    def setDays2(value: SafeArray[CalendarItem2]): Self = this.set("Days2", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenitiveMonths2(value: SafeArray[CalendarItem2]): Self = this.set("GenitiveMonths2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedCalendar2(value: Calendar2): Self = this.set("LoadedCalendar2", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths2(value: SafeArray[CalendarItem2]): Self = this.set("Months2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitiveMonths2(value: SafeArray[CalendarItem2]): Self = this.set("PartitiveMonths2", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDays2(value: () => SafeArray[CalendarItem2]): Self = this.set("getDays2", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGenitiveMonths2(value: () => SafeArray[CalendarItem2]): Self = this.set("getGenitiveMonths2", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLoadedCalendar2(value: () => Calendar2): Self = this.set("getLoadedCalendar2", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonths2(value: () => SafeArray[CalendarItem2]): Self = this.set("getMonths2", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPartitiveMonths2(value: () => SafeArray[CalendarItem2]): Self = this.set("getPartitiveMonths2", js.Any.fromFunction0(value))
  }
  
}

