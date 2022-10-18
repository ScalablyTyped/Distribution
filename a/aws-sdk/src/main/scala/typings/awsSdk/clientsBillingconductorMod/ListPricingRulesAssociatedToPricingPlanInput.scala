package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingRulesAssociatedToPricingPlanInput extends StObject {
  
  /**
    *  The billing period for which the pricing rule associations are to be listed. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * The optional maximum number of pricing rule associations to retrieve.
    */
  var MaxResults: js.UndefOr[MaxPricingPlanResults] = js.undefined
  
  /**
    *  The optional pagination token returned by a previous call. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing plan for which associations are to be listed.
    */
  var PricingPlanArn: typings.awsSdk.clientsBillingconductorMod.PricingPlanArn
}
object ListPricingRulesAssociatedToPricingPlanInput {
  
  inline def apply(PricingPlanArn: PricingPlanArn): ListPricingRulesAssociatedToPricingPlanInput = {
    val __obj = js.Dynamic.literal(PricingPlanArn = PricingPlanArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPricingRulesAssociatedToPricingPlanInput]
  }
  
  extension [Self <: ListPricingRulesAssociatedToPricingPlanInput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setMaxResults(value: MaxPricingPlanResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPricingPlanArn(value: PricingPlanArn): Self = StObject.set(x, "PricingPlanArn", value.asInstanceOf[js.Any])
  }
}
