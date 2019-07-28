package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * A sequence of CalendarItems is contained in {@link Calendar.Days} , {@link Calendar.Months} , {@link Calendar.Eras}
  */
trait CalendarItem extends js.Object {
  var AbbrevName: String
  var FullName: String
  /** A unique ID for an entry of this type, usually the lower case abbreviated English name, for example, **"sun"** for Sunday. */
  var ID: String
}

object CalendarItem {
  @scala.inline
  def apply(AbbrevName: String, FullName: String, ID: String): CalendarItem = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName, FullName = FullName, ID = ID)
  
    __obj.asInstanceOf[CalendarItem]
  }
}

