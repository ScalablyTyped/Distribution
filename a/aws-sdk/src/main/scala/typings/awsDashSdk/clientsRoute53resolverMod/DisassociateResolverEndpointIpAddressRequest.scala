package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
  /**
    * The IPv4 address that you want to remove from a resolver endpoint.
    */
  var IpAddress: IpAddressUpdate = js.native
  /**
    * The ID of the resolver endpoint that you want to disassociate an IP address from.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object DisassociateResolverEndpointIpAddressRequest {
  @scala.inline
  def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): DisassociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressRequest]
  }
}

