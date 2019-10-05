package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeSecurityGroupIngressRequest extends js.Object {
  /**
    * The IPv4 address range, in CIDR format. You can't specify this parameter when specifying a source security group. To specify an IPv6 address range, use a set of IP permissions. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use -1 to specify all types. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The sets of IP permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). To specify icmpv6, use a set of IP permissions. [VPC only] Use -1 to specify all protocols. If you specify -1 or a protocol other than tcp, udp, or icmp, traffic on all ports is allowed, regardless of any ports you specify. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be in the same VPC.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all codes. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object AuthorizeSecurityGroupIngressRequest {
  @scala.inline
  def apply(
    CidrIp: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    FromPort: Int | scala.Double = null,
    GroupId: String = null,
    GroupName: String = null,
    IpPermissions: IpPermissionList = null,
    IpProtocol: String = null,
    SourceSecurityGroupName: String = null,
    SourceSecurityGroupOwnerId: String = null,
    ToPort: Int | scala.Double = null
  ): AuthorizeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions)
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol)
    if (SourceSecurityGroupName != null) __obj.updateDynamic("SourceSecurityGroupName")(SourceSecurityGroupName)
    if (SourceSecurityGroupOwnerId != null) __obj.updateDynamic("SourceSecurityGroupOwnerId")(SourceSecurityGroupOwnerId)
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeSecurityGroupIngressRequest]
  }
}

