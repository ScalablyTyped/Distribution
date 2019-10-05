package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionOptionsDescription extends js.Object {
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to private IP addresses when queried from instances in a peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a local ClassicLink connection can communicate with the peer VPC over the VPC peering connection.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink connection in the peer VPC over the VPC peering connection.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object VpcPeeringConnectionOptionsDescription {
  @scala.inline
  def apply(
    AllowDnsResolutionFromRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): VpcPeeringConnectionOptionsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowDnsResolutionFromRemoteVpc)) __obj.updateDynamic("AllowDnsResolutionFromRemoteVpc")(AllowDnsResolutionFromRemoteVpc)
    if (!js.isUndefined(AllowEgressFromLocalClassicLinkToRemoteVpc)) __obj.updateDynamic("AllowEgressFromLocalClassicLinkToRemoteVpc")(AllowEgressFromLocalClassicLinkToRemoteVpc)
    if (!js.isUndefined(AllowEgressFromLocalVpcToRemoteClassicLink)) __obj.updateDynamic("AllowEgressFromLocalVpcToRemoteClassicLink")(AllowEgressFromLocalVpcToRemoteClassicLink)
    __obj.asInstanceOf[VpcPeeringConnectionOptionsDescription]
  }
}

