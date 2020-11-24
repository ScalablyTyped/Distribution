package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * Derived from {@link com.sun.star.i18n.CalendarItem} this provides an additional member for narrow names.
  * @since LibreOffice 3.5
  */
@js.native
trait CalendarItem2 extends CalendarItem {
  
  /** The narrow name, for example, **"S"** for Sunday or **"J"** for January. */
  var NarrowName: String = js.native
}
object CalendarItem2 {
  
  @scala.inline
  def apply(AbbrevName: String, FullName: String, ID: String, NarrowName: String): CalendarItem2 = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], NarrowName = NarrowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarItem2]
  }
  
  @scala.inline
  implicit class CalendarItem2Ops[Self <: CalendarItem2] (val x: Self) extends AnyVal {
    
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
    def setNarrowName(value: String): Self = this.set("NarrowName", value.asInstanceOf[js.Any])
  }
}
