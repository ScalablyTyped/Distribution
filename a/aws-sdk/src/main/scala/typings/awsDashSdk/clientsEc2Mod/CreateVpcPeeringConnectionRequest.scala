package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The AWS account ID of the owner of the accepter VPC. Default: Your AWS account ID
    */
  var PeerOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request. Default: The Region in which you make the request.
    */
  var PeerRegion: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
    */
  var PeerVpcId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the requester VPC. You must specify this parameter in the request.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object CreateVpcPeeringConnectionRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PeerOwnerId: String = null,
    PeerRegion: String = null,
    PeerVpcId: String = null,
    VpcId: String = null
  ): CreateVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (PeerOwnerId != null) __obj.updateDynamic("PeerOwnerId")(PeerOwnerId)
    if (PeerRegion != null) __obj.updateDynamic("PeerRegion")(PeerRegion)
    if (PeerVpcId != null) __obj.updateDynamic("PeerVpcId")(PeerVpcId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[CreateVpcPeeringConnectionRequest]
  }
}

