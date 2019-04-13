package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateResolverEndpointIpAddressResponse extends js.Object {
  /**
    * The response to an DisassociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
}

object DisassociateResolverEndpointIpAddressResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): DisassociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint)
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressResponse]
  }
}

