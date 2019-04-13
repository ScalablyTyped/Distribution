package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverEndpointsResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If more than MaxResults IP addresses match the specified criteria, you can submit another ListResolverEndpoint request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The resolver endpoints that were created by using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverEndpoints: js.UndefOr[ResolverEndpoints] = js.undefined
}

object ListResolverEndpointsResponse {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResolverEndpoints: ResolverEndpoints = null
  ): ListResolverEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResolverEndpoints != null) __obj.updateDynamic("ResolverEndpoints")(ResolverEndpoints)
    __obj.asInstanceOf[ListResolverEndpointsResponse]
  }
}

