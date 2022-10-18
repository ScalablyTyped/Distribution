package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOutboundConnectionsRequest extends StObject {
  
  /**
    *  A list of filters used to match properties for outbound cross-cluster connections. Available  Filter  names for this operation are:  connection-id remote-domain-info.domain-name remote-domain-info.owner-id remote-domain-info.region local-domain-info.domain-name  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribeOutboundConnectionsRequest {
  
  inline def apply(): DescribeOutboundConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOutboundConnectionsRequest]
  }
  
  extension [Self <: DescribeOutboundConnectionsRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
