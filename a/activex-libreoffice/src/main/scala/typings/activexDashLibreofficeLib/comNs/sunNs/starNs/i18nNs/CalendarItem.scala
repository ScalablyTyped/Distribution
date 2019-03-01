package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * A sequence of CalendarItems is contained in {@link Calendar.Days} , {@link Calendar.Months} , {@link Calendar.Eras}
  */
trait CalendarItem extends js.Object {
  var AbbrevName: java.lang.String
  var FullName: java.lang.String
  /** A unique ID for an entry of this type, usually the lower case abbreviated English name, for example, **"sun"** for Sunday. */
  var ID: java.lang.String
}

object CalendarItem {
  @scala.inline
  def apply(AbbrevName: java.lang.String, FullName: java.lang.String, ID: java.lang.String): CalendarItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AbbrevName")(AbbrevName)
    __obj.updateDynamic("FullName")(FullName)
    __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[CalendarItem]
  }
}

