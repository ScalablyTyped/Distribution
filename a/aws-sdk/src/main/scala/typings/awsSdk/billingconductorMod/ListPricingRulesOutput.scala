package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingRulesOutput extends StObject {
  
  /**
    *  The billing period for which the described pricing rules are applicable. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  The pagination token used on subsequent calls to get pricing rules. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  A list containing the described pricing rules. 
    */
  var PricingRules: js.UndefOr[PricingRuleList] = js.undefined
}
object ListPricingRulesOutput {
  
  inline def apply(): ListPricingRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingRulesOutput]
  }
  
  extension [Self <: ListPricingRulesOutput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingRules(value: PricingRuleList): Self = StObject.set(x, "PricingRules", value.asInstanceOf[js.Any])
    
    inline def setPricingRulesUndefined: Self = StObject.set(x, "PricingRules", js.undefined)
    
    inline def setPricingRulesVarargs(value: PricingRuleListElement*): Self = StObject.set(x, "PricingRules", js.Array(value*))
  }
}
