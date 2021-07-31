package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The Amazon Chime account settings to update.
    */
  var AccountSettings: typings.awsSdk.chimeMod.AccountSettings
}
object UpdateAccountSettingsRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, AccountSettings: AccountSettings): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AccountSettings = AccountSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountSettingsRequestMutableBuilder[Self <: UpdateAccountSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
  }
}
