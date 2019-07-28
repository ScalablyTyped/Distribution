package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeSecurityGroupIngressRequest extends js.Object {
  /**
    * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use -1 to specify all ICMP types.
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
    * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). Use -1 to specify all.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all ICMP codes for the ICMP type.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object RevokeSecurityGroupIngressRequest {
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
  ): RevokeSecurityGroupIngressRequest = {
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
    __obj.asInstanceOf[RevokeSecurityGroupIngressRequest]
  }
}

