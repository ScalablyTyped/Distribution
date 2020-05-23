package typings.activexLibreoffice.com_.sun.star.i18n

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
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StartOfWeek = StartOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

