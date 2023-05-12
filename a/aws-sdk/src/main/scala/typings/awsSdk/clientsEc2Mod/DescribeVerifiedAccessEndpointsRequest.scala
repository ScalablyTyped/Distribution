package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessEndpointsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. Filter names and values are case-sensitive.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVerifiedAccessEndpointsMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the Verified Access endpoint.
    */
  var VerifiedAccessEndpointIds: js.UndefOr[VerifiedAccessEndpointIdList] = js.undefined
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroupId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessGroupId] = js.undefined
  
  /**
    * The ID of the Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessInstanceId] = js.undefined
}
object DescribeVerifiedAccessEndpointsRequest {
  
  inline def apply(): DescribeVerifiedAccessEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeVerifiedAccessEndpointsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessEndpointIds(value: VerifiedAccessEndpointIdList): Self = StObject.set(x, "VerifiedAccessEndpointIds", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessEndpointIdsUndefined: Self = StObject.set(x, "VerifiedAccessEndpointIds", js.undefined)
    
    inline def setVerifiedAccessEndpointIdsVarargs(value: VerifiedAccessEndpointId*): Self = StObject.set(x, "VerifiedAccessEndpointIds", js.Array(value*))
    
    inline def setVerifiedAccessGroupId(value: VerifiedAccessGroupId): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupIdUndefined: Self = StObject.set(x, "VerifiedAccessGroupId", js.undefined)
    
    inline def setVerifiedAccessInstanceId(value: VerifiedAccessInstanceId): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
  }
}
