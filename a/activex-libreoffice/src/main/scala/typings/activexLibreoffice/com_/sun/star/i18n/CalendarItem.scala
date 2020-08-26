package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * A sequence of CalendarItems is contained in {@link Calendar.Days} , {@link Calendar.Months} , {@link Calendar.Eras}
  */
@js.native
trait CalendarItem extends js.Object {
  var AbbrevName: String = js.native
  var FullName: String = js.native
  /** A unique ID for an entry of this type, usually the lower case abbreviated English name, for example, **"sun"** for Sunday. */
  var ID: String = js.native
}

object CalendarItem {
  @scala.inline
  def apply(AbbrevName: String, FullName: String, ID: String): CalendarItem = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarItem]
  }
  @scala.inline
  implicit class CalendarItemOps[Self <: CalendarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbrevName(value: String): Self = this.set("AbbrevName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
  }
  
}

