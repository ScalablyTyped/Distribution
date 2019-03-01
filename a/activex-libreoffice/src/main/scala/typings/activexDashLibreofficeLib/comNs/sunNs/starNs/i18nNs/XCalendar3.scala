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
  val Days2: activexDashInteropLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: activexDashInteropLib.SafeArray[CalendarItem2]
  val LoadedCalendar2: Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: activexDashInteropLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: activexDashInteropLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): activexDashInteropLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): activexDashInteropLib.SafeArray[CalendarItem2]
  def getLoadedCalendar2(): Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): activexDashInteropLib.SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): activexDashInteropLib.SafeArray[CalendarItem2]
}

object XCalendar3 {
  @scala.inline
  def apply(
    DateTime: scala.Double,
    Days: activexDashInteropLib.SafeArray[CalendarItem],
    Days2: activexDashInteropLib.SafeArray[CalendarItem2],
    FirstDayOfWeek: scala.Double,
    GenitiveMonths2: activexDashInteropLib.SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: activexDashInteropLib.SafeArray[CalendarItem],
    Months2: activexDashInteropLib.SafeArray[CalendarItem2],
    NumberOfDaysInWeek: scala.Double,
    NumberOfMonthsInYear: scala.Double,
    PartitiveMonths2: activexDashInteropLib.SafeArray[CalendarItem2],
    UniqueID: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addValue: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAllCalendars: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getDateTime: js.Function0[scala.Double],
    getDays: js.Function0[activexDashInteropLib.SafeArray[CalendarItem]],
    getDays2: js.Function0[activexDashInteropLib.SafeArray[CalendarItem2]],
    getDisplayName: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    getDisplayString: js.Function2[scala.Double, scala.Double, java.lang.String],
    getFirstDayOfWeek: js.Function0[scala.Double],
    getGenitiveMonths2: js.Function0[activexDashInteropLib.SafeArray[CalendarItem2]],
    getLoadedCalendar: js.Function0[Calendar],
    getLoadedCalendar2: js.Function0[Calendar2],
    getMinimumNumberOfDaysForFirstWeek: js.Function0[scala.Double],
    getMonths: js.Function0[activexDashInteropLib.SafeArray[CalendarItem]],
    getMonths2: js.Function0[activexDashInteropLib.SafeArray[CalendarItem2]],
    getNumberOfDaysInWeek: js.Function0[scala.Double],
    getNumberOfMonthsInYear: js.Function0[scala.Double],
    getPartitiveMonths2: js.Function0[activexDashInteropLib.SafeArray[CalendarItem2]],
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
  ): XCalendar3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateTime")(DateTime)
    __obj.updateDynamic("Days")(Days)
    __obj.updateDynamic("Days2")(Days2)
    __obj.updateDynamic("FirstDayOfWeek")(FirstDayOfWeek)
    __obj.updateDynamic("GenitiveMonths2")(GenitiveMonths2)
    __obj.updateDynamic("LoadedCalendar")(LoadedCalendar)
    __obj.updateDynamic("LoadedCalendar2")(LoadedCalendar2)
    __obj.updateDynamic("MinimumNumberOfDaysForFirstWeek")(MinimumNumberOfDaysForFirstWeek)
    __obj.updateDynamic("Months")(Months)
    __obj.updateDynamic("Months2")(Months2)
    __obj.updateDynamic("NumberOfDaysInWeek")(NumberOfDaysInWeek)
    __obj.updateDynamic("NumberOfMonthsInYear")(NumberOfMonthsInYear)
    __obj.updateDynamic("PartitiveMonths2")(PartitiveMonths2)
    __obj.updateDynamic("UniqueID")(UniqueID)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addValue")(addValue)
    __obj.updateDynamic("getAllCalendars")(getAllCalendars)
    __obj.updateDynamic("getDateTime")(getDateTime)
    __obj.updateDynamic("getDays")(getDays)
    __obj.updateDynamic("getDays2")(getDays2)
    __obj.updateDynamic("getDisplayName")(getDisplayName)
    __obj.updateDynamic("getDisplayString")(getDisplayString)
    __obj.updateDynamic("getFirstDayOfWeek")(getFirstDayOfWeek)
    __obj.updateDynamic("getGenitiveMonths2")(getGenitiveMonths2)
    __obj.updateDynamic("getLoadedCalendar")(getLoadedCalendar)
    __obj.updateDynamic("getLoadedCalendar2")(getLoadedCalendar2)
    __obj.updateDynamic("getMinimumNumberOfDaysForFirstWeek")(getMinimumNumberOfDaysForFirstWeek)
    __obj.updateDynamic("getMonths")(getMonths)
    __obj.updateDynamic("getMonths2")(getMonths2)
    __obj.updateDynamic("getNumberOfDaysInWeek")(getNumberOfDaysInWeek)
    __obj.updateDynamic("getNumberOfMonthsInYear")(getNumberOfMonthsInYear)
    __obj.updateDynamic("getPartitiveMonths2")(getPartitiveMonths2)
    __obj.updateDynamic("getUniqueID")(getUniqueID)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("loadCalendar")(loadCalendar)
    __obj.updateDynamic("loadDefaultCalendar")(loadDefaultCalendar)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDateTime")(setDateTime)
    __obj.updateDynamic("setFirstDayOfWeek")(setFirstDayOfWeek)
    __obj.updateDynamic("setMinimumNumberOfDaysForFirstWeek")(setMinimumNumberOfDaysForFirstWeek)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[XCalendar3]
  }
}

