package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesAssociatedToCustomLineItemInput extends StObject {
  
  /**
    *  The ARN of the custom line item for which the resource associations will be listed. 
    */
  var Arn: CustomLineItemArn
  
  /**
    *  The billing period for which the resource associations will be listed. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    *  (Optional) A ListResourcesAssociatedToCustomLineItemFilter that can specify the types of resources that should be retrieved. 
    */
  var Filters: js.UndefOr[ListResourcesAssociatedToCustomLineItemFilter] = js.undefined
  
  /**
    *  (Optional) The maximum number of resource associations to be retrieved. 
    */
  var MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined
  
  /**
    *  (Optional) The pagination token returned by a previous request. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListResourcesAssociatedToCustomLineItemInput {
  
  inline def apply(Arn: CustomLineItemArn): ListResourcesAssociatedToCustomLineItemInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemInput]
  }
  
  extension [Self <: ListResourcesAssociatedToCustomLineItemInput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListResourcesAssociatedToCustomLineItemFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxCustomLineItemResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
