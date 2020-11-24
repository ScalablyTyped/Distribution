package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalSettingsInput extends js.Object {
  
  /**
    * A list of resources along with the opt-in preferences for the account.
    */
  var GlobalSettings: js.UndefOr[typings.awsSdk.backupMod.GlobalSettings] = js.native
}
object UpdateGlobalSettingsInput {
  
  @scala.inline
  def apply(): UpdateGlobalSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateGlobalSettingsInputOps[Self <: UpdateGlobalSettingsInput] (val x: Self) extends AnyVal {
    
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
    def setGlobalSettings(value: GlobalSettings): Self = this.set("GlobalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSettings: Self = this.set("GlobalSettings", js.undefined)
  }
}
