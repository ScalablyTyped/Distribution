package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeeringConnectionOptions extends js.Object {
  /**
    * If true, the public DNS hostnames of instances in the specified VPC resolve to private IP addresses when queried from instances in the peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object PeeringConnectionOptions {
  @scala.inline
  def apply(
    AllowDnsResolutionFromRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): PeeringConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowDnsResolutionFromRemoteVpc)) __obj.updateDynamic("AllowDnsResolutionFromRemoteVpc")(AllowDnsResolutionFromRemoteVpc)
    if (!js.isUndefined(AllowEgressFromLocalClassicLinkToRemoteVpc)) __obj.updateDynamic("AllowEgressFromLocalClassicLinkToRemoteVpc")(AllowEgressFromLocalClassicLinkToRemoteVpc)
    if (!js.isUndefined(AllowEgressFromLocalVpcToRemoteClassicLink)) __obj.updateDynamic("AllowEgressFromLocalVpcToRemoteClassicLink")(AllowEgressFromLocalVpcToRemoteClassicLink)
    __obj.asInstanceOf[PeeringConnectionOptions]
  }
}

