package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSecurityGroupIngressRequest extends StObject {
  
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
  var GroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
  
  /**
    * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). Use -1 to specify all.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the security group rules.
    */
  var SecurityGroupRuleIds: js.UndefOr[SecurityGroupRuleIdList] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-Classic] The Amazon Web Services account ID of the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all ICMP codes for the ICMP type.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object RevokeSecurityGroupIngressRequest {
  
  inline def apply(): RevokeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeSecurityGroupIngressRequest]
  }
  
  extension [Self <: RevokeSecurityGroupIngressRequest](x: Self) {
    
    inline def setCidrIp(value: String): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    inline def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setIpPermissions(value: IpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    inline def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    inline def setIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value*))
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setSecurityGroupRuleIds(value: SecurityGroupRuleIdList): Self = StObject.set(x, "SecurityGroupRuleIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleIdsUndefined: Self = StObject.set(x, "SecurityGroupRuleIds", js.undefined)
    
    inline def setSecurityGroupRuleIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupRuleIds", js.Array(value*))
    
    inline def setSourceSecurityGroupName(value: String): Self = StObject.set(x, "SourceSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupNameUndefined: Self = StObject.set(x, "SourceSecurityGroupName", js.undefined)
    
    inline def setSourceSecurityGroupOwnerId(value: String): Self = StObject.set(x, "SourceSecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupOwnerIdUndefined: Self = StObject.set(x, "SourceSecurityGroupOwnerId", js.undefined)
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
