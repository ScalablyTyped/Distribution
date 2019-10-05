package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclEntry extends js.Object {
  /**
    * The IPv4 network range to allow or deny, in CIDR notation.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
    */
  var Egress: js.UndefOr[Boolean] = js.undefined
  /**
    * ICMP protocol: The ICMP type and code.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IcmpTypeCode] = js.undefined
  /**
    * The IPv6 network range to allow or deny, in CIDR notation.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * TCP or UDP protocols: The range of ports the rule applies to.
    */
  var PortRange: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.PortRange] = js.undefined
  /**
    * The protocol number. A value of "-1" means all protocols.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.RuleAction] = js.undefined
  /**
    * The rule number for the entry. ACL entries are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
}

object NetworkAclEntry {
  @scala.inline
  def apply(
    CidrBlock: String = null,
    Egress: js.UndefOr[scala.Boolean] = js.undefined,
    IcmpTypeCode: IcmpTypeCode = null,
    Ipv6CidrBlock: String = null,
    PortRange: PortRange = null,
    Protocol: String = null,
    RuleAction: RuleAction = null,
    RuleNumber: Int | scala.Double = null
  ): NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock)
    if (!js.isUndefined(Egress)) __obj.updateDynamic("Egress")(Egress)
    if (IcmpTypeCode != null) __obj.updateDynamic("IcmpTypeCode")(IcmpTypeCode)
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock)
    if (PortRange != null) __obj.updateDynamic("PortRange")(PortRange)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol)
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (RuleNumber != null) __obj.updateDynamic("RuleNumber")(RuleNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclEntry]
  }
}

