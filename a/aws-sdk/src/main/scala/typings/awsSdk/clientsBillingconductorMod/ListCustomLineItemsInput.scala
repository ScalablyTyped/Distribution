package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemsInput extends StObject {
  
  /**
    *  The preferred billing period to get custom line items (FFLIs). 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * A ListCustomLineItemsFilter that specifies the custom line item names and/or billing group Amazon Resource Names (ARNs) to retrieve FFLI information.
    */
  var Filters: js.UndefOr[ListCustomLineItemsFilter] = js.undefined
  
  /**
    *  The maximum number of billing groups to retrieve. 
    */
  var MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined
  
  /**
    *  The pagination token that's used on subsequent calls to get custom line items (FFLIs). 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCustomLineItemsInput {
  
  inline def apply(): ListCustomLineItemsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomLineItemsInput] (val x: Self) extends AnyVal {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListCustomLineItemsFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxCustomLineItemResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
