package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewaysRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    outpost-arn - The Amazon Resource Name (ARN) of the Outpost.    owner-id - The ID of the Amazon Web Services account that owns the local gateway.    state - The state of the association.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the local gateways.
    */
  var LocalGatewayIds: js.UndefOr[LocalGatewayIdSet] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewaysRequest {
  
  inline def apply(): DescribeLocalGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewaysRequest]
  }
  
  extension [Self <: DescribeLocalGatewaysRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLocalGatewayIds(value: LocalGatewayIdSet): Self = StObject.set(x, "LocalGatewayIds", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdsUndefined: Self = StObject.set(x, "LocalGatewayIds", js.undefined)
    
    inline def setLocalGatewayIdsVarargs(value: LocalGatewayId*): Self = StObject.set(x, "LocalGatewayIds", js.Array(value*))
    
    inline def setMaxResults(value: LocalGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
