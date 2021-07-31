package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  
  /**
    * The user ID.
    */
  var UserId: String
  
  /**
    * The user settings to update.
    */
  var UserSettings: typings.awsSdk.chimeMod.UserSettings
}
object UpdateUserSettingsRequest {
  
  @scala.inline
  def apply(AccountId: String, UserId: String, UserSettings: UserSettings): UpdateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserSettings = UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateUserSettingsRequestMutableBuilder[Self <: UpdateUserSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
  }
}
