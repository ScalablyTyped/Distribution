package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverEndpointResponse extends js.Object {
  /**
    * The response to an UpdateResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}

object UpdateResolverEndpointResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): UpdateResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint)
    __obj.asInstanceOf[UpdateResolverEndpointResponse]
  }
}

