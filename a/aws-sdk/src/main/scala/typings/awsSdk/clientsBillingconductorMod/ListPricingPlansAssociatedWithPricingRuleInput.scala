package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingPlansAssociatedWithPricingRuleInput extends StObject {
  
  /**
    *  The pricing plan billing period for which associations will be listed. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  The optional maximum number of pricing rule associations to retrieve. 
    */
  var MaxResults: js.UndefOr[MaxPricingRuleResults] = js.undefined
  
  /**
    *  The optional pagination token returned by a previous call. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The pricing rule Amazon Resource Name (ARN) for which associations will be listed. 
    */
  var PricingRuleArn: typings.awsSdk.clientsBillingconductorMod.PricingRuleArn
}
object ListPricingPlansAssociatedWithPricingRuleInput {
  
  inline def apply(PricingRuleArn: PricingRuleArn): ListPricingPlansAssociatedWithPricingRuleInput = {
    val __obj = js.Dynamic.literal(PricingRuleArn = PricingRuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPricingPlansAssociatedWithPricingRuleInput]
  }
  
  extension [Self <: ListPricingPlansAssociatedWithPricingRuleInput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setMaxResults(value: MaxPricingRuleResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingRuleArn(value: PricingRuleArn): Self = StObject.set(x, "PricingRuleArn", value.asInstanceOf[js.Any])
  }
}
