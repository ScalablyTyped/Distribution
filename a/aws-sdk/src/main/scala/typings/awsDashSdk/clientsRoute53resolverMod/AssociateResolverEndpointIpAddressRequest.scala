package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateResolverEndpointIpAddressRequest extends js.Object {
  /**
    * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
    */
  var IpAddress: IpAddressUpdate
  /**
    * The ID of the resolver endpoint that you want to associate IP addresses with.
    */
  var ResolverEndpointId: ResourceId
}

object AssociateResolverEndpointIpAddressRequest {
  @scala.inline
  def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): AssociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress, ResolverEndpointId = ResolverEndpointId)
  
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressRequest]
  }
}

