package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRegionSettingsInput extends js.Object {
  
  /**
    * Updates the list of services along with the opt-in preferences for the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.native
}
object UpdateRegionSettingsInput {
  
  @scala.inline
  def apply(): UpdateRegionSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegionSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateRegionSettingsInputOps[Self <: UpdateRegionSettingsInput] (val x: Self) extends AnyVal {
    
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
    def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = this.set("ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypeOptInPreference: Self = this.set("ResourceTypeOptInPreference", js.undefined)
  }
}
