package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverEndpointResponse extends js.Object {
  /**
    * Information about the resolver endpoint that you specified in a GetResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}

object GetResolverEndpointResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): GetResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint)
    __obj.asInstanceOf[GetResolverEndpointResponse]
  }
}

