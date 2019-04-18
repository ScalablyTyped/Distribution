package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeSecurityGroupIngressRequest extends js.Object {
  /**
    * The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6 type number, use -1 to specify all types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
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
    * The sets of IP permissions. Can be used to specify multiple rules in a single command.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). (VPC only) Use -1 to specify all protocols. If you specify -1, or a protocol number other than tcp, udp, icmp, or 58 (ICMPv6), traffic on all ports is allowed, regardless of any ports you specify. For tcp, udp, and icmp, you must specify a port range. For protocol 58 (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is allowed.
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
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6 code number, use -1 to specify all codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object AuthorizeSecurityGroupIngressRequest {
  @scala.inline
  def apply(
    CidrIp: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    FromPort: js.UndefOr[Integer] = js.undefined,
    GroupId: String = null,
    GroupName: String = null,
    IpPermissions: IpPermissionList = null,
    IpProtocol: String = null,
    SourceSecurityGroupName: String = null,
    SourceSecurityGroupOwnerId: String = null,
    ToPort: js.UndefOr[Integer] = js.undefined
  ): AuthorizeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions)
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol)
    if (SourceSecurityGroupName != null) __obj.updateDynamic("SourceSecurityGroupName")(SourceSecurityGroupName)
    if (SourceSecurityGroupOwnerId != null) __obj.updateDynamic("SourceSecurityGroupOwnerId")(SourceSecurityGroupOwnerId)
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort)
    __obj.asInstanceOf[AuthorizeSecurityGroupIngressRequest]
  }
}

