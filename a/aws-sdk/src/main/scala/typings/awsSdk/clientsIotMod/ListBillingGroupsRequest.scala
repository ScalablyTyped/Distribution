package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  
  /**
    * Limit the results to billing groups whose names have the given prefix.
    */
  var namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBillingGroupsRequest {
  
  inline def apply(): ListBillingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsRequest]
  }
  
  extension [Self <: ListBillingGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamePrefixFilter(value: BillingGroupName): Self = StObject.set(x, "namePrefixFilter", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixFilterUndefined: Self = StObject.set(x, "namePrefixFilter", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
