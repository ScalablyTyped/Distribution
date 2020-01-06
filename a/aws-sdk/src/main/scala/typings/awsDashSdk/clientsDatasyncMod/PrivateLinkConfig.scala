package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateLinkConfig extends js.Object {
  /**
    * The private endpoint that is configured for an agent that has access to IP addresses in a PrivateLink. An agent that is configured with this endpoint will not be accessible over the public Internet.
    */
  var PrivateLinkEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the EC2 resource that hosts an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the subnets that are configured for an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.native
  /**
    * The ID of the VPC endpoint that is configured for an agent. An agent that is configured with a VPC endpoint will not be accessible over the public Internet.
    */
  var VpcEndpointId: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.VpcEndpointId] = js.native
}

object PrivateLinkConfig {
  @scala.inline
  def apply(
    PrivateLinkEndpoint: Endpoint = null,
    SecurityGroupArns: PLSecurityGroupArnList = null,
    SubnetArns: PLSubnetArnList = null,
    VpcEndpointId: VpcEndpointId = null
  ): PrivateLinkConfig = {
    val __obj = js.Dynamic.literal()
    if (PrivateLinkEndpoint != null) __obj.updateDynamic("PrivateLinkEndpoint")(PrivateLinkEndpoint.asInstanceOf[js.Any])
    if (SecurityGroupArns != null) __obj.updateDynamic("SecurityGroupArns")(SecurityGroupArns.asInstanceOf[js.Any])
    if (SubnetArns != null) __obj.updateDynamic("SubnetArns")(SubnetArns.asInstanceOf[js.Any])
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateLinkConfig]
  }
}

