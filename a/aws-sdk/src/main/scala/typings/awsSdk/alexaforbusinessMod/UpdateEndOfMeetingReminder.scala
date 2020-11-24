package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndOfMeetingReminder extends js.Object {
  
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Updates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}
object UpdateEndOfMeetingReminder {
  
  @scala.inline
  def apply(): UpdateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndOfMeetingReminder]
  }
  
  @scala.inline
  implicit class UpdateEndOfMeetingReminderOps[Self <: UpdateEndOfMeetingReminder] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setReminderAtMinutesVarargs(value: Minutes*): Self = this.set("ReminderAtMinutes", js.Array(value :_*))
    
    @scala.inline
    def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = this.set("ReminderAtMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderAtMinutes: Self = this.set("ReminderAtMinutes", js.undefined)
    
    @scala.inline
    def setReminderType(value: EndOfMeetingReminderType): Self = this.set("ReminderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderType: Self = this.set("ReminderType", js.undefined)
  }
}
