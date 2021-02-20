package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndOfMeetingReminder extends StObject {
  
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: Boolean = js.native
  
  /**
    *  A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: EndOfMeetingReminderMinutesList = js.native
  
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: EndOfMeetingReminderType = js.native
}
object CreateEndOfMeetingReminder {
  
  @scala.inline
  def apply(
    Enabled: Boolean,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList,
    ReminderType: EndOfMeetingReminderType
  ): CreateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReminderAtMinutes = ReminderAtMinutes.asInstanceOf[js.Any], ReminderType = ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndOfMeetingReminder]
  }
  
  @scala.inline
  implicit class CreateEndOfMeetingReminderMutableBuilder[Self <: CreateEndOfMeetingReminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = StObject.set(x, "ReminderAtMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderAtMinutesVarargs(value: Minutes*): Self = StObject.set(x, "ReminderAtMinutes", js.Array(value :_*))
    
    @scala.inline
    def setReminderType(value: EndOfMeetingReminderType): Self = StObject.set(x, "ReminderType", value.asInstanceOf[js.Any])
  }
}
