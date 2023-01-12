package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingPlansInput extends StObject {
  
  /**
    * The preferred billing period to get pricing plan. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * A ListPricingPlansFilter that specifies the Amazon Resource Name (ARNs) of pricing plans to retrieve pricing plans information.
    */
  var Filters: js.UndefOr[ListPricingPlansFilter] = js.undefined
  
  /**
    * The maximum number of pricing plans to retrieve.
    */
  var MaxResults: js.UndefOr[MaxPricingPlanResults] = js.undefined
  
  /**
    * The pagination token that's used on subsequent call to get pricing plans. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListPricingPlansInput {
  
  inline def apply(): ListPricingPlansInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingPlansInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPricingPlansInput] (val x: Self) extends AnyVal {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListPricingPlansFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxPricingPlanResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
