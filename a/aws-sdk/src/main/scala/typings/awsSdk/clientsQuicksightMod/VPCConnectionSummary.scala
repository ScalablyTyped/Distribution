package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCConnectionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC connection.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The availability status of the VPC connection.
    */
  var AvailabilityStatus: js.UndefOr[VPCConnectionAvailabilityStatus] = js.undefined
  
  /**
    * The time that the VPC connection was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of IP addresses of DNS resolver endpoints for the VPC connection.
    */
  var DnsResolvers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The time that the VPC connection was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The display name for the VPC connection.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A list of network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  
  /**
    * The ARN of the IAM role associated with the VPC connection.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon EC2 security group IDs associated with the VPC connection.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * The status of the VPC connection.
    */
  var Status: js.UndefOr[VPCConnectionResourceStatus] = js.undefined
  
  /**
    * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services Region in an Amazon Web Services account.
    */
  var VPCConnectionId: js.UndefOr[VPCConnectionResourceIdUnrestricted] = js.undefined
  
  /**
    * The Amazon EC2 VPC ID associated with the VPC connection.
    */
  var VPCId: js.UndefOr[String] = js.undefined
}
object VPCConnectionSummary {
  
  inline def apply(): VPCConnectionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCConnectionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VPCConnectionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailabilityStatus(value: VPCConnectionAvailabilityStatus): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDnsResolvers(value: StringList): Self = StObject.set(x, "DnsResolvers", value.asInstanceOf[js.Any])
    
    inline def setDnsResolversUndefined: Self = StObject.set(x, "DnsResolvers", js.undefined)
    
    inline def setDnsResolversVarargs(value: String*): Self = StObject.set(x, "DnsResolvers", js.Array(value*))
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setStatus(value: VPCConnectionResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdUnrestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionIdUndefined: Self = StObject.set(x, "VPCConnectionId", js.undefined)
    
    inline def setVPCId(value: String): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    inline def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
