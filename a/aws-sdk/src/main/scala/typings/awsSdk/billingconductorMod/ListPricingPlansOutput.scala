package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingPlansOutput extends StObject {
  
  /**
    *  The billing period for which the described pricing plans are applicable. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * The pagination token used on subsequent calls to get pricing plans. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of PricingPlanListElement retrieved. 
    */
  var PricingPlans: js.UndefOr[PricingPlanList] = js.undefined
}
object ListPricingPlansOutput {
  
  inline def apply(): ListPricingPlansOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingPlansOutput]
  }
  
  extension [Self <: ListPricingPlansOutput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingPlans(value: PricingPlanList): Self = StObject.set(x, "PricingPlans", value.asInstanceOf[js.Any])
    
    inline def setPricingPlansUndefined: Self = StObject.set(x, "PricingPlans", js.undefined)
    
    inline def setPricingPlansVarargs(value: PricingPlanListElement*): Self = StObject.set(x, "PricingPlans", js.Array(value*))
  }
}
