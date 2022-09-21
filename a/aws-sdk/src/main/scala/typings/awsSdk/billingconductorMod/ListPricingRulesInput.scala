package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingRulesInput extends StObject {
  
  /**
    *  The preferred billing period to get the pricing plan. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  A DescribePricingRuleFilter that specifies the Amazon Resource Name (ARNs) of pricing rules to retrieve pricing rules information. 
    */
  var Filters: js.UndefOr[ListPricingRulesFilter] = js.undefined
  
  /**
    *  The maximum number of pricing rules to retrieve. 
    */
  var MaxResults: js.UndefOr[MaxPricingRuleResults] = js.undefined
  
  /**
    *  The pagination token used on subsequent call to get pricing rules. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListPricingRulesInput {
  
  inline def apply(): ListPricingRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingRulesInput]
  }
  
  extension [Self <: ListPricingRulesInput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListPricingRulesFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxPricingRuleResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
