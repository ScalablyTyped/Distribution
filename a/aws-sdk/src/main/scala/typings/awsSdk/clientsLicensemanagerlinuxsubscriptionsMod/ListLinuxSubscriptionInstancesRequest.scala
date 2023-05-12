package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLinuxSubscriptionInstancesRequest extends StObject {
  
  /**
    * An array of structures that you can use to filter the results to those that match one or more sets of key-value pairs that you specify. For example, you can filter by the name of AmiID with an optional operator to see subscriptions that match, partially match, or don't match a certain Amazon Machine Image (AMI) ID. The valid names for this filter are:    AmiID     InstanceID     AccountID     Status     Region     UsageOperation     ProductCode     InstanceType    The valid Operators for this filter are:    contains     equals     Notequal   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[ListLinuxSubscriptionInstancesRequestNextTokenString] = js.undefined
}
object ListLinuxSubscriptionInstancesRequest {
  
  inline def apply(): ListLinuxSubscriptionInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLinuxSubscriptionInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLinuxSubscriptionInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ListLinuxSubscriptionInstancesRequestNextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
