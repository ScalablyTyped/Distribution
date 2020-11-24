package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeAppliance extends js.Object {
  
  /**
    * The description of the smart home appliance.
    */
  var Description: js.UndefOr[ApplianceDescription] = js.native
  
  /**
    * The friendly name of the smart home appliance.
    */
  var FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.native
  
  /**
    * The name of the manufacturer of the smart home appliance.
    */
  var ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.native
}
object SmartHomeAppliance {
  
  @scala.inline
  def apply(): SmartHomeAppliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartHomeAppliance]
  }
  
  @scala.inline
  implicit class SmartHomeApplianceOps[Self <: SmartHomeAppliance] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: ApplianceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: ApplianceFriendlyName): Self = this.set("FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("FriendlyName", js.undefined)
    
    @scala.inline
    def setManufacturerName(value: ApplianceManufacturerName): Self = this.set("ManufacturerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerName: Self = this.set("ManufacturerName", js.undefined)
  }
}
