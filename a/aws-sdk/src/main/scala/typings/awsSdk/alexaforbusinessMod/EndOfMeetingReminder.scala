package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndOfMeetingReminder extends StObject {
  
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}
object EndOfMeetingReminder {
  
  @scala.inline
  def apply(): EndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfMeetingReminder]
  }
  
  @scala.inline
  implicit class EndOfMeetingReminderMutableBuilder[Self <: EndOfMeetingReminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = StObject.set(x, "ReminderAtMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderAtMinutesUndefined: Self = StObject.set(x, "ReminderAtMinutes", js.undefined)
    
    @scala.inline
    def setReminderAtMinutesVarargs(value: Minutes*): Self = StObject.set(x, "ReminderAtMinutes", js.Array(value :_*))
    
    @scala.inline
    def setReminderType(value: EndOfMeetingReminderType): Self = StObject.set(x, "ReminderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderTypeUndefined: Self = StObject.set(x, "ReminderType", js.undefined)
  }
}
