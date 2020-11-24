package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.Reminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReminderObject extends js.Object {
  
  val ReminderObject: Reminder = js.native
}
object ReminderObject {
  
  @scala.inline
  def apply(ReminderObject: Reminder): ReminderObject = {
    val __obj = js.Dynamic.literal(ReminderObject = ReminderObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReminderObject]
  }
  
  @scala.inline
  implicit class ReminderObjectOps[Self <: ReminderObject] (val x: Self) extends AnyVal {
    
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
    def setReminderObject(value: Reminder): Self = this.set("ReminderObject", value.asInstanceOf[js.Any])
  }
}
