package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.Reminder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReminderObject extends StObject {
  
  val ReminderObject: Reminder
}
object ReminderObject {
  
  @scala.inline
  def apply(ReminderObject: Reminder): ReminderObject = {
    val __obj = js.Dynamic.literal(ReminderObject = ReminderObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReminderObject]
  }
  
  @scala.inline
  implicit class ReminderObjectMutableBuilder[Self <: ReminderObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReminderObject(value: Reminder): Self = StObject.set(x, "ReminderObject", value.asInstanceOf[js.Any])
  }
}
