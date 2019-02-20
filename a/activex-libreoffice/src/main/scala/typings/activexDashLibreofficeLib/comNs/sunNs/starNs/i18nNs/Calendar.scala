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

