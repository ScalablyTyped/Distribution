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

