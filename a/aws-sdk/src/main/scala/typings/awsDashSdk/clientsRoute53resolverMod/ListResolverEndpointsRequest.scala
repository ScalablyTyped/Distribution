package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverEndpointsRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.  If you submit a second or subsequent ListResolverEndpoints request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Filters] = js.native
  /**
    * The maximum number of resolver endpoints that you want to return in the response to a ListResolverEndpoints request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver endpoints. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.native
  /**
    * For the first ListResolverEndpoints request, omit this value. If you have more than MaxResults resolver endpoints, you can submit another ListResolverEndpoints request to get the next group of resolver endpoints. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.native
}

object ListResolverEndpointsRequest {
  @scala.inline
  def apply(Filters: Filters = null, MaxResults: Int | Double = null, NextToken: NextToken = null): ListResolverEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolverEndpointsRequest]
  }
}

