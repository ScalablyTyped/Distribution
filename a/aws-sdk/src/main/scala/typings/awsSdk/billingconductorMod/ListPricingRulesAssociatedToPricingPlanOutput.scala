package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingRulesAssociatedToPricingPlanOutput extends StObject {
  
  /**
    *  The billing period for which the pricing rule associations are listed. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  The pagination token to be used on subsequent calls. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
    */
  var PricingPlanArn: js.UndefOr[typings.awsSdk.billingconductorMod.PricingPlanArn] = js.undefined
  
  /**
    *  A list containing pricing rules associated with the requested pricing plan. 
    */
  var PricingRuleArns: js.UndefOr[typings.awsSdk.billingconductorMod.PricingRuleArns] = js.undefined
}
object ListPricingRulesAssociatedToPricingPlanOutput {
  
  inline def apply(): ListPricingRulesAssociatedToPricingPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingRulesAssociatedToPricingPlanOutput]
  }
  
  extension [Self <: ListPricingRulesAssociatedToPricingPlanOutput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingPlanArn(value: PricingPlanArn): Self = StObject.set(x, "PricingPlanArn", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanArnUndefined: Self = StObject.set(x, "PricingPlanArn", js.undefined)
    
    inline def setPricingRuleArns(value: PricingRuleArns): Self = StObject.set(x, "PricingRuleArns", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArnsUndefined: Self = StObject.set(x, "PricingRuleArns", js.undefined)
    
    inline def setPricingRuleArnsVarargs(value: PricingRuleArn*): Self = StObject.set(x, "PricingRuleArns", js.Array(value*))
  }
}
