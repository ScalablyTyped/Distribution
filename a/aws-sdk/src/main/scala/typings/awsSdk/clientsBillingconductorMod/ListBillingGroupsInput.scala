package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsInput extends StObject {
  
  /**
    * The preferred billing period to get billing groups. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * A ListBillingGroupsFilter that specifies the billing group and pricing plan to retrieve billing group information. 
    */
  var Filters: js.UndefOr[ListBillingGroupsFilter] = js.undefined
  
  /**
    * The maximum number of billing groups to retrieve. 
    */
  var MaxResults: js.UndefOr[MaxBillingGroupResults] = js.undefined
  
  /**
    * The pagination token that's used on subsequent calls to get billing groups. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListBillingGroupsInput {
  
  inline def apply(): ListBillingGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBillingGroupsInput] (val x: Self) extends AnyVal {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListBillingGroupsFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxBillingGroupResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
