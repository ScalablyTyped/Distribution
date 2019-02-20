package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link Calendar} items as returned in a sequence by {@link XLocaleData3.getAllCalendars2()} .
  *
  * Similar to {@link com.sun.star.i18n.Calendar} this provides additional members with a sequence of possessive (genitive case) and partitive case month
  * names for locales that use them, for example Slavic locales. If a locale does not provide the possessive form in {@link GenitiveMonths} , the names
  * are identical to the nominative case nouns in {@link Calendar.Months} . If a locale does not provide the partitive case in {@link PartitiveMonths} ,
  * the names are identical to {@link GenitiveMonths} .
  *
  * The sequences are of type {@link com.sun.star.i18n.CalendarItem2} instead of {@link com.sun.star.i18n.CalendarItem} , with the additional NarrowName
  * member.
  * @see XLocaleData for links to DTD of XML locale data files.
  * @since LibreOffice 3.5
  */
trait Calendar2 extends js.Object {
  var Days: activexDashInteropLib.SafeArray[CalendarItem2]
  var Default: scala.Boolean
  var Eras: activexDashInteropLib.SafeArray[CalendarItem2]
  var GenitiveMonths: activexDashInteropLib.SafeArray[CalendarItem2]
  var MinimumNumberOfDaysForFirstWeek: scala.Double
  var Months: activexDashInteropLib.SafeArray[CalendarItem2]
  var Name: java.lang.String
  var PartitiveMonths: activexDashInteropLib.SafeArray[CalendarItem2]
  var StartOfWeek: java.lang.String
}

