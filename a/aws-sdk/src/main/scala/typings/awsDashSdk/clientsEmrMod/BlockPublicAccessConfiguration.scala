package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPublicAccessConfiguration extends js.Object {
  /**
    * Indicates whether EMR block public access is enabled (true) or disabled (false). By default, the value is false for accounts that have created EMR clusters before July 2019. For accounts created after this, the default is true.
    */
  var BlockPublicSecurityGroupRules: Boolean
  /**
    * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from all public sources. For example, if Port 23 (Telnet) is specified for PermittedPublicSecurityGroupRuleRanges, Amazon EMR allows cluster creation if a security group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port ::/0 as the source. By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of PermittedPublicSecurityGroupRuleRanges.
    */
  var PermittedPublicSecurityGroupRuleRanges: js.UndefOr[PortRanges] = js.undefined
}

object BlockPublicAccessConfiguration {
  @scala.inline
  def apply(BlockPublicSecurityGroupRules: Boolean, PermittedPublicSecurityGroupRuleRanges: PortRanges = null): BlockPublicAccessConfiguration = {
    val __obj = js.Dynamic.literal(BlockPublicSecurityGroupRules = BlockPublicSecurityGroupRules)
    if (PermittedPublicSecurityGroupRuleRanges != null) __obj.updateDynamic("PermittedPublicSecurityGroupRuleRanges")(PermittedPublicSecurityGroupRuleRanges)
    __obj.asInstanceOf[BlockPublicAccessConfiguration]
  }
}

