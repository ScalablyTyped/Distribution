package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndOfMeetingReminder extends StObject {
  
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Updates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.undefined
  
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.undefined
}
object UpdateEndOfMeetingReminder {
  
  inline def apply(): UpdateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndOfMeetingReminder]
  }
  
  extension [Self <: UpdateEndOfMeetingReminder](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = StObject.set(x, "ReminderAtMinutes", value.asInstanceOf[js.Any])
    
    inline def setReminderAtMinutesUndefined: Self = StObject.set(x, "ReminderAtMinutes", js.undefined)
    
    inline def setReminderAtMinutesVarargs(value: Minutes*): Self = StObject.set(x, "ReminderAtMinutes", js.Array(value*))
    
    inline def setReminderType(value: EndOfMeetingReminderType): Self = StObject.set(x, "ReminderType", value.asInstanceOf[js.Any])
    
    inline def setReminderTypeUndefined: Self = StObject.set(x, "ReminderType", js.undefined)
  }
}
