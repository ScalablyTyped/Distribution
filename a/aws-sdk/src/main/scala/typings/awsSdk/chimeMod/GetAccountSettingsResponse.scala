package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountSettingsResponse extends js.Object {
  
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.chimeMod.AccountSettings] = js.native
}
object GetAccountSettingsResponse {
  
  @scala.inline
  def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  
  @scala.inline
  implicit class GetAccountSettingsResponseOps[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountSettings(value: AccountSettings): Self = this.set("AccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountSettings: Self = this.set("AccountSettings", js.undefined)
  }
}
