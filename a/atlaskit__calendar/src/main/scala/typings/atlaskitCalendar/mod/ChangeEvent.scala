package typings.atlaskitCalendar.mod

import typings.atlaskitCalendar.atlaskitCalendarStrings.down
import typings.atlaskitCalendar.atlaskitCalendarStrings.left
import typings.atlaskitCalendar.atlaskitCalendarStrings.next
import typings.atlaskitCalendar.atlaskitCalendarStrings.prev
import typings.atlaskitCalendar.atlaskitCalendarStrings.right
import typings.atlaskitCalendar.atlaskitCalendarStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEvent extends DateObj {
  
  var iso: String = js.native
  
  var `type`: left | up | right | down | prev | next = js.native
}
object ChangeEvent {
  
  @scala.inline
  def apply(
    day: Double,
    iso: String,
    month: Double,
    `type`: left | up | right | down | prev | next,
    year: Double
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setIso(value: String): Self = this.set("iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: left | up | right | down | prev | next): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
