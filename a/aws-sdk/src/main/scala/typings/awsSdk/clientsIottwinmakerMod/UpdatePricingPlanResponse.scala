package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePricingPlanResponse extends StObject {
  
  /**
    * Update the current pricing plan.
    */
  var currentPricingPlan: PricingPlan
  
  /**
    * Update the pending pricing plan.
    */
  var pendingPricingPlan: js.UndefOr[PricingPlan] = js.undefined
}
object UpdatePricingPlanResponse {
  
  inline def apply(currentPricingPlan: PricingPlan): UpdatePricingPlanResponse = {
    val __obj = js.Dynamic.literal(currentPricingPlan = currentPricingPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePricingPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePricingPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentPricingPlan(value: PricingPlan): Self = StObject.set(x, "currentPricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPricingPlan(value: PricingPlan): Self = StObject.set(x, "pendingPricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPricingPlanUndefined: Self = StObject.set(x, "pendingPricingPlan", js.undefined)
  }
}
