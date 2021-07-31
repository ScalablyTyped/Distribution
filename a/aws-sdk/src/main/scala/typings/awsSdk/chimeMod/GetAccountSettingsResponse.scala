package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsResponse extends StObject {
  
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.chimeMod.AccountSettings] = js.undefined
}
object GetAccountSettingsResponse {
  
  @scala.inline
  def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  
  @scala.inline
  implicit class GetAccountSettingsResponseMutableBuilder[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountSettingsUndefined: Self = StObject.set(x, "AccountSettings", js.undefined)
  }
}
