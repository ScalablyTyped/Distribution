package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerInput extends js.Object {
  /**
    * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4.
    */
  var IpAddressType: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.IpAddressType] = js.undefined
  /**
    * The name of the load balancer. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
    */
  var Name: LoadBalancerName
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only route requests from clients with access to the VPC for the load balancer. The default is an Internet-facing load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
  /**
    * [Application Load Balancers] The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SecurityGroups] = js.undefined
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet.
    */
  var SubnetMappings: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SubnetMappings] = js.undefined
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones.
    */
  var Subnets: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Subnets] = js.undefined
  /**
    * One or more tags to assign to the load balancer.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The type of load balancer. The default is application.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
}

object CreateLoadBalancerInput {
  @scala.inline
  def apply(
    Name: LoadBalancerName,
    IpAddressType: IpAddressType = null,
    Scheme: LoadBalancerSchemeEnum = null,
    SecurityGroups: SecurityGroups = null,
    SubnetMappings: SubnetMappings = null,
    Subnets: Subnets = null,
    Tags: TagList = null,
    Type: LoadBalancerTypeEnum = null
  ): CreateLoadBalancerInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetMappings != null) __obj.updateDynamic("SubnetMappings")(SubnetMappings)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerInput]
  }
}

