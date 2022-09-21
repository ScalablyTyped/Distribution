package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingPlansAssociatedWithPricingRuleOutput extends StObject {
  
  /**
    *  The pricing plan billing period for which associations will be listed. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  The pagination token to be used on subsequent calls. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The list containing pricing plans associated with the requested pricing rule. 
    */
  var PricingPlanArns: js.UndefOr[typings.awsSdk.billingconductorMod.PricingPlanArns] = js.undefined
  
  /**
    *  The pricing rule Amazon Resource Name (ARN) for which associations will be listed. 
    */
  var PricingRuleArn: js.UndefOr[typings.awsSdk.billingconductorMod.PricingRuleArn] = js.undefined
}
object ListPricingPlansAssociatedWithPricingRuleOutput {
  
  inline def apply(): ListPricingPlansAssociatedWithPricingRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingPlansAssociatedWithPricingRuleOutput]
  }
  
  extension [Self <: ListPricingPlansAssociatedWithPricingRuleOutput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingPlanArns(value: PricingPlanArns): Self = StObject.set(x, "PricingPlanArns", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanArnsUndefined: Self = StObject.set(x, "PricingPlanArns", js.undefined)
    
    inline def setPricingPlanArnsVarargs(value: PricingPlanArn*): Self = StObject.set(x, "PricingPlanArns", js.Array(value*))
    
    inline def setPricingRuleArn(value: PricingRuleArn): Self = StObject.set(x, "PricingRuleArn", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArnUndefined: Self = StObject.set(x, "PricingRuleArn", js.undefined)
  }
}
