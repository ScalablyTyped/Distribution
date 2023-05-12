package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVPCConnectionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the account that contains the VPC connection that you want to update.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A list of IP addresses of DNS resolver endpoints for the VPC connection.
    */
  var DnsResolvers: js.UndefOr[DnsResolverList] = js.undefined
  
  /**
    * The display name for the VPC connection.
    */
  var Name: ResourceName
  
  /**
    * An IAM role associated with the VPC connection.
    */
  var RoleArn: typings.awsSdk.clientsQuicksightMod.RoleArn
  
  /**
    * A list of security group IDs for the VPC connection.
    */
  var SecurityGroupIds: SecurityGroupIdList
  
  /**
    * A list of subnet IDs for the VPC connection.
    */
  var SubnetIds: SubnetIdList
  
  /**
    * The ID of the VPC connection that you're updating. This ID is a unique identifier for each Amazon Web Services Region in an Amazon Web Services account.
    */
  var VPCConnectionId: VPCConnectionResourceIdUnrestricted
}
object UpdateVPCConnectionRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    Name: ResourceName,
    RoleArn: RoleArn,
    SecurityGroupIds: SecurityGroupIdList,
    SubnetIds: SubnetIdList,
    VPCConnectionId: VPCConnectionResourceIdUnrestricted
  ): UpdateVPCConnectionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VPCConnectionId = VPCConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVPCConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDnsResolvers(value: DnsResolverList): Self = StObject.set(x, "DnsResolvers", value.asInstanceOf[js.Any])
    
    inline def setDnsResolversUndefined: Self = StObject.set(x, "DnsResolvers", js.undefined)
    
    inline def setDnsResolversVarargs(value: IPv4Address*): Self = StObject.set(x, "DnsResolvers", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdUnrestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
  }
}
