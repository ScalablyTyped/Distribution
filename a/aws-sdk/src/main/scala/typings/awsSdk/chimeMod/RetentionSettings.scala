package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionSettings extends StObject {
  
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
  implicit class RetentionSettingsMutableBuilder[Self <: RetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversationRetentionSettings(value: ConversationRetentionSettings): Self = StObject.set(x, "ConversationRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationRetentionSettingsUndefined: Self = StObject.set(x, "ConversationRetentionSettings", js.undefined)
    
    @scala.inline
    def setRoomRetentionSettings(value: RoomRetentionSettings): Self = StObject.set(x, "RoomRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomRetentionSettingsUndefined: Self = StObject.set(x, "RoomRetentionSettings", js.undefined)
  }
}
