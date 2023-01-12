package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficMirrorSessionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    description: The Traffic Mirror session description.    network-interface-id: The ID of the Traffic Mirror session network interface.    owner-id: The ID of the account that owns the Traffic Mirror session.    packet-length: The assigned number of packets to mirror.     session-number: The assigned session number.     traffic-mirror-filter-id: The ID of the Traffic Mirror filter.    traffic-mirror-session-id: The ID of the Traffic Mirror session.    traffic-mirror-target-id: The ID of the Traffic Mirror target.    virtual-network-id: The virtual network ID of the Traffic Mirror session.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TrafficMirroringMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionIds: js.UndefOr[TrafficMirrorSessionIdList] = js.undefined
}
object DescribeTrafficMirrorSessionsRequest {
  
  inline def apply(): DescribeTrafficMirrorSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrafficMirrorSessionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TrafficMirroringMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficMirrorSessionIds(value: TrafficMirrorSessionIdList): Self = StObject.set(x, "TrafficMirrorSessionIds", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorSessionIdsUndefined: Self = StObject.set(x, "TrafficMirrorSessionIds", js.undefined)
    
    inline def setTrafficMirrorSessionIdsVarargs(value: TrafficMirrorSessionId*): Self = StObject.set(x, "TrafficMirrorSessionIds", js.Array(value*))
  }
}
