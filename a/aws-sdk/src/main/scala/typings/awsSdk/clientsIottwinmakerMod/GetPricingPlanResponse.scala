package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPricingPlanResponse extends StObject {
  
  /**
    * The chosen pricing plan for the current billing cycle.
    */
  var currentPricingPlan: PricingPlan
  
  /**
    * The pending pricing plan.
    */
  var pendingPricingPlan: js.UndefOr[PricingPlan] = js.undefined
}
object GetPricingPlanResponse {
  
  inline def apply(currentPricingPlan: PricingPlan): GetPricingPlanResponse = {
    val __obj = js.Dynamic.literal(currentPricingPlan = currentPricingPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPricingPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPricingPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentPricingPlan(value: PricingPlan): Self = StObject.set(x, "currentPricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPricingPlan(value: PricingPlan): Self = StObject.set(x, "pendingPricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPricingPlanUndefined: Self = StObject.set(x, "pendingPricingPlan", js.undefined)
  }
}
