package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateResolverEndpointIpAddressResponse extends js.Object {
  /**
    * The response to an AssociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}

object AssociateResolverEndpointIpAddressResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): AssociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint)
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
  }
}

