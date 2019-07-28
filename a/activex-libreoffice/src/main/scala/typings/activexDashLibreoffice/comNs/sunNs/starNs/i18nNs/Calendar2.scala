package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.std.SafeArray
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
  var Days: SafeArray[CalendarItem2]
  var Default: Boolean
  var Eras: SafeArray[CalendarItem2]
  var GenitiveMonths: SafeArray[CalendarItem2]
  var MinimumNumberOfDaysForFirstWeek: Double
  var Months: SafeArray[CalendarItem2]
  var Name: String
  var PartitiveMonths: SafeArray[CalendarItem2]
  var StartOfWeek: String
}

object Calendar2 {
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem2],
    Default: Boolean,
    Eras: SafeArray[CalendarItem2],
    GenitiveMonths: SafeArray[CalendarItem2],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem2],
    Name: String,
    PartitiveMonths: SafeArray[CalendarItem2],
    StartOfWeek: String
  ): Calendar2 = {
    val __obj = js.Dynamic.literal(Days = Days, Default = Default, Eras = Eras, GenitiveMonths = GenitiveMonths, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, Name = Name, PartitiveMonths = PartitiveMonths, StartOfWeek = StartOfWeek)
  
    __obj.asInstanceOf[Calendar2]
  }
}

