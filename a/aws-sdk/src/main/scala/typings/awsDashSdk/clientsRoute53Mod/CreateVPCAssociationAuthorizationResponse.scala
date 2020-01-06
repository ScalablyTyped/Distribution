package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCAssociationAuthorizationResponse extends js.Object {
  /**
    * The ID of the hosted zone that you authorized associating a VPC with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The VPC that you authorized associating with a hosted zone.
    */
  var VPC: typings.awsDashSdk.clientsRoute53Mod.VPC = js.native
}

object CreateVPCAssociationAuthorizationResponse {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationResponse]
  }
}

