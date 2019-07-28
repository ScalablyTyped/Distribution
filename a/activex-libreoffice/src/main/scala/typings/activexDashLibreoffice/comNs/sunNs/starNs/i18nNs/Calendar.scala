package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A calendar as returned in a sequence by {@link XLocaleData.getAllCalendars()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Calendar extends js.Object {
  var Days: SafeArray[CalendarItem]
  var Default: Boolean
  var Eras: SafeArray[CalendarItem]
  var MinimumNumberOfDaysForFirstWeek: Double
  var Months: SafeArray[CalendarItem]
  var Name: String
  var StartOfWeek: String
}

object Calendar {
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem],
    Default: Boolean,
    Eras: SafeArray[CalendarItem],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Name: String,
    StartOfWeek: String
  ): Calendar = {
    val __obj = js.Dynamic.literal(Days = Days, Default = Default, Eras = Eras, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, Name = Name, StartOfWeek = StartOfWeek)
  
    __obj.asInstanceOf[Calendar]
  }
}

