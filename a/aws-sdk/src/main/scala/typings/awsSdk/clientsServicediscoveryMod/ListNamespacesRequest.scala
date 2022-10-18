package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamespacesRequest extends StObject {
  
  /**
    * A complex type that contains specifications for the namespaces that you want to list. If you specify more than one filter, a namespace must match all filters to be returned by ListNamespaces.
    */
  var Filters: js.UndefOr[NamespaceFilters] = js.undefined
  
  /**
    * The maximum number of namespaces that you want Cloud Map to return in the response to a ListNamespaces request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 namespaces.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  
  /**
    * For the first ListNamespaces request, omit this value. If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}
object ListNamespacesRequest {
  
  inline def apply(): ListNamespacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesRequest]
  }
  
  extension [Self <: ListNamespacesRequest](x: Self) {
    
    inline def setFilters(value: NamespaceFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: NamespaceFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
