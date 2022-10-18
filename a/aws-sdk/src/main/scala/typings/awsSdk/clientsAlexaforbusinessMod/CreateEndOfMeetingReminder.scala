package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndOfMeetingReminder extends StObject {
  
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: Boolean
  
  /**
    *  A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: EndOfMeetingReminderMinutesList
  
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: EndOfMeetingReminderType
}
object CreateEndOfMeetingReminder {
  
  inline def apply(
    Enabled: Boolean,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList,
    ReminderType: EndOfMeetingReminderType
  ): CreateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReminderAtMinutes = ReminderAtMinutes.asInstanceOf[js.Any], ReminderType = ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndOfMeetingReminder]
  }
  
  extension [Self <: CreateEndOfMeetingReminder](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = StObject.set(x, "ReminderAtMinutes", value.asInstanceOf[js.Any])
    
    inline def setReminderAtMinutesVarargs(value: Minutes*): Self = StObject.set(x, "ReminderAtMinutes", js.Array(value*))
    
    inline def setReminderType(value: EndOfMeetingReminderType): Self = StObject.set(x, "ReminderType", value.asInstanceOf[js.Any])
  }
}
