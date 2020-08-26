package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionSettings extends js.Object {
  /**
    * The chat conversation retention settings.
    */
  var ConversationRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.ConversationRetentionSettings] = js.native
  /**
    * The chat room retention settings.
    */
  var RoomRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.RoomRetentionSettings] = js.native
}

object RetentionSettings {
  @scala.inline
  def apply(): RetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionSettings]
  }
  @scala.inline
  implicit class RetentionSettingsOps[Self <: RetentionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConversationRetentionSettings(value: ConversationRetentionSettings): Self = this.set("ConversationRetentionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationRetentionSettings: Self = this.set("ConversationRetentionSettings", js.undefined)
    @scala.inline
    def setRoomRetentionSettings(value: RoomRetentionSettings): Self = this.set("RoomRetentionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomRetentionSettings: Self = this.set("RoomRetentionSettings", js.undefined)
  }
  
}

