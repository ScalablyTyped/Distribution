package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserSettingsRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  
  /**
    * The user ID.
    */
  var UserId: String = js.native
  
  /**
    * The user settings to update.
    */
  var UserSettings: typings.awsSdk.chimeMod.UserSettings = js.native
}
object UpdateUserSettingsRequest {
  
  @scala.inline
  def apply(AccountId: String, UserId: String, UserSettings: UserSettings): UpdateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserSettings = UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateUserSettingsRequestOps[Self <: UpdateUserSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
  }
}
