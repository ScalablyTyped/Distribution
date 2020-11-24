package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserSettingsResponse extends js.Object {
  
  /**
    * The user settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.chimeMod.UserSettings] = js.native
}
object GetUserSettingsResponse {
  
  @scala.inline
  def apply(): GetUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserSettingsResponse]
  }
  
  @scala.inline
  implicit class GetUserSettingsResponseOps[Self <: GetUserSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setUserSettings(value: UserSettings): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
}
