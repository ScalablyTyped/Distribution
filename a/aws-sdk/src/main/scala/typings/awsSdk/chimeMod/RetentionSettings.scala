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
  def apply(
    ConversationRetentionSettings: ConversationRetentionSettings = null,
    RoomRetentionSettings: RoomRetentionSettings = null
  ): RetentionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConversationRetentionSettings != null) __obj.updateDynamic("ConversationRetentionSettings")(ConversationRetentionSettings.asInstanceOf[js.Any])
    if (RoomRetentionSettings != null) __obj.updateDynamic("RoomRetentionSettings")(RoomRetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionSettings]
  }
}

