package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkAclEntryRequest extends js.Object {
  /**
    * The IPv4 network range to allow or deny, in CIDR notation (for example 172.16.0.0/24).
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet).
    */
  var Egress: Boolean
  /**
    * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IcmpTypeCode] = js.undefined
  /**
    * The IPv6 network range to allow or deny, in CIDR notation (for example 2001:db8:1234:1a00::/64).
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: String
  /**
    * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17 (UDP).
    */
  var PortRange: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.PortRange] = js.undefined
  /**
    * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
    */
  var Protocol: String
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: typings.awsDashSdk.clientsEc2Mod.RuleAction
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number. Constraints: Positive integer from 1 to 32766. The range 32767 to 65535 is reserved for internal use.
    */
  var RuleNumber: Integer
}

object CreateNetworkAclEntryRequest {
  @scala.inline
  def apply(
    Egress: Boolean,
    NetworkAclId: String,
    Protocol: String,
    RuleAction: RuleAction,
    RuleNumber: Integer,
    CidrBlock: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    IcmpTypeCode: IcmpTypeCode = null,
    Ipv6CidrBlock: String = null,
    PortRange: PortRange = null
  ): CreateNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress, NetworkAclId = NetworkAclId, Protocol = Protocol, RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber)
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (IcmpTypeCode != null) __obj.updateDynamic("IcmpTypeCode")(IcmpTypeCode)
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock)
    if (PortRange != null) __obj.updateDynamic("PortRange")(PortRange)
    __obj.asInstanceOf[CreateNetworkAclEntryRequest]
  }
}

