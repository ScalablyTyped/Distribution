package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeAppliance extends StObject {
  
  /**
    * The description of the smart home appliance.
    */
  var Description: js.UndefOr[ApplianceDescription] = js.undefined
  
  /**
    * The friendly name of the smart home appliance.
    */
  var FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.undefined
  
  /**
    * The name of the manufacturer of the smart home appliance.
    */
  var ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined
}
object SmartHomeAppliance {
  
  @scala.inline
  def apply(): SmartHomeAppliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartHomeAppliance]
  }
  
  @scala.inline
  implicit class SmartHomeApplianceMutableBuilder[Self <: SmartHomeAppliance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ApplianceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: ApplianceFriendlyName): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "FriendlyName", js.undefined)
    
    @scala.inline
    def setManufacturerName(value: ApplianceManufacturerName): Self = StObject.set(x, "ManufacturerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerNameUndefined: Self = StObject.set(x, "ManufacturerName", js.undefined)
  }
}
