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
  var Days: activexDashInteropLib.SafeArray[CalendarItem]
  var Default: scala.Boolean
  var Eras: activexDashInteropLib.SafeArray[CalendarItem]
  var MinimumNumberOfDaysForFirstWeek: scala.Double
  var Months: activexDashInteropLib.SafeArray[CalendarItem]
  var Name: java.lang.String
  var StartOfWeek: java.lang.String
}

object Calendar {
  @scala.inline
  def apply(
    Days: activexDashInteropLib.SafeArray[CalendarItem],
    Default: scala.Boolean,
    Eras: activexDashInteropLib.SafeArray[CalendarItem],
    MinimumNumberOfDaysForFirstWeek: scala.Double,
    Months: activexDashInteropLib.SafeArray[CalendarItem],
    Name: java.lang.String,
    StartOfWeek: java.lang.String
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Days")(Days)
    __obj.updateDynamic("Default")(Default)
    __obj.updateDynamic("Eras")(Eras)
    __obj.updateDynamic("MinimumNumberOfDaysForFirstWeek")(MinimumNumberOfDaysForFirstWeek)
    __obj.updateDynamic("Months")(Months)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("StartOfWeek")(StartOfWeek)
    __obj.asInstanceOf[Calendar]
  }
}

