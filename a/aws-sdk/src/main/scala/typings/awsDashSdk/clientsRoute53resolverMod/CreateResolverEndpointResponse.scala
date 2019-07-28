package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolverEndpointResponse extends js.Object {
  /**
    * Information about the CreateResolverEndpoint request, including the status of the request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}

object CreateResolverEndpointResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): CreateResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint)
    __obj.asInstanceOf[CreateResolverEndpointResponse]
  }
}

