package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteCalculatorRequest extends StObject {
  
  /**
    * The name of the route calculator resource to update.
    */
  var CalculatorName: ResourceName
  
  /**
    * Updates the description for the route calculator resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
}
object UpdateRouteCalculatorRequest {
  
  inline def apply(CalculatorName: ResourceName): UpdateRouteCalculatorRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteCalculatorRequest]
  }
  
  extension [Self <: UpdateRouteCalculatorRequest](x: Self) {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
  }
}
