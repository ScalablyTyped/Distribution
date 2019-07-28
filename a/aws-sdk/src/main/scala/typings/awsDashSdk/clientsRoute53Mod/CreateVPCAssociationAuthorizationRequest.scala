package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVPCAssociationAuthorizationRequest extends js.Object {
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  var HostedZoneId: ResourceId
  /**
    * A complex type that contains the VPC ID and region for the VPC that you want to authorize associating with your hosted zone.
    */
  var VPC: typings.awsDashSdk.clientsRoute53Mod.VPC
}

object CreateVPCAssociationAuthorizationRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId, VPC = VPC)
  
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationRequest]
  }
}

