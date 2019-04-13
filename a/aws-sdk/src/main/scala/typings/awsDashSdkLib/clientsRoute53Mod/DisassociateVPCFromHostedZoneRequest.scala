package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateVPCFromHostedZoneRequest extends js.Object {
  /**
    *  Optional: A comment about the disassociation request.
    */
  var Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
  /**
    * The ID of the private hosted zone that you want to disassociate a VPC from.
    */
  var HostedZoneId: ResourceId
  /**
    * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
    */
  var VPC: awsDashSdkLib.clientsRoute53Mod.VPC
}

object DisassociateVPCFromHostedZoneRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC, Comment: DisassociateVPCComment = null): DisassociateVPCFromHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId, VPC = VPC)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
  }
}

