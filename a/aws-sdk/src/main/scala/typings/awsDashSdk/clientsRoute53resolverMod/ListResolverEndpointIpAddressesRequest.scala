package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverEndpointIpAddressesRequest extends js.Object {
  /**
    * The maximum number of IP addresses that you want to return in the response to a ListResolverEndpointIpAddresses request. If you don't specify a value for MaxResults, Resolver returns up to 100 IP addresses. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  /**
    * For the first ListResolverEndpointIpAddresses request, omit this value. If the specified resolver endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  /**
    * The ID of the resolver endpoint that you want to get IP addresses for.
    */
  var ResolverEndpointId: ResourceId
}

object ListResolverEndpointIpAddressesRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListResolverEndpointIpAddressesRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResolverEndpointIpAddressesRequest]
  }
}

