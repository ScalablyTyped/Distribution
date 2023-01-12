package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayMulticastDomainsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    state - The state of the transit gateway multicast domain. Valid values are pending | available | deleting | deleted.    transit-gateway-id - The ID of the transit gateway.    transit-gateway-multicast-domain-id - The ID of the transit gateway multicast domain.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainIds: js.UndefOr[TransitGatewayMulticastDomainIdStringList] = js.undefined
}
object DescribeTransitGatewayMulticastDomainsRequest {
  
  inline def apply(): DescribeTransitGatewayMulticastDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayMulticastDomainsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTransitGatewayMulticastDomainsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayMulticastDomainIds(value: TransitGatewayMulticastDomainIdStringList): Self = StObject.set(x, "TransitGatewayMulticastDomainIds", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainIdsUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainIds", js.undefined)
    
    inline def setTransitGatewayMulticastDomainIdsVarargs(value: TransitGatewayMulticastDomainId*): Self = StObject.set(x, "TransitGatewayMulticastDomainIds", js.Array(value*))
  }
}
