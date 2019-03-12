package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A calendar as returned in a sequence by {@link XLocaleData.getAllCalendars()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Calendar extends js.Object {
  var Days: stdLib.SafeArray[CalendarItem]
  var Default: scala.Boolean
  var Eras: stdLib.SafeArray[CalendarItem]
  var MinimumNumberOfDaysForFirstWeek: scala.Double
  var Months: stdLib.SafeArray[CalendarItem]
  var Name: java.lang.String
  var StartOfWeek: java.lang.String
}

object Calendar {
  @scala.inline
  def apply(
    Days: stdLib.SafeArray[CalendarItem],
    Default: scala.Boolean,
    Eras: stdLib.SafeArray[CalendarItem],
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: stdLib.SafeArray[CalendarItem],
    Name: java.lang.String,
    StartOfWeek: java.lang.String
  ): Calendar = {
    val __obj = js.Dynamic.literal(Days = Days, Default = Default, Eras = Eras, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, Name = Name, StartOfWeek = StartOfWeek)
  
    __obj.asInstanceOf[Calendar]
  }
}

