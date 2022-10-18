package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryConnectSettingsDescription extends StObject {
  
  /**
    * A list of the Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.AvailabilityZones] = js.undefined
  
  /**
    * The IP addresses of the AD Connector servers.
    */
  var ConnectIps: js.UndefOr[IpAddrs] = js.undefined
  
  /**
    * The user name of the service account in your self-managed directory.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.undefined
  
  /**
    * The security group identifier for the AD Connector directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SecurityGroupId] = js.undefined
  
  /**
    * A list of subnet identifiers in the VPC that the AD Connector is in.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SubnetIds] = js.undefined
  
  /**
    * The identifier of the VPC that the AD Connector is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.VpcId] = js.undefined
}
object DirectoryConnectSettingsDescription {
  
  inline def apply(): DirectoryConnectSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryConnectSettingsDescription]
  }
  
  extension [Self <: DirectoryConnectSettingsDescription](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setConnectIps(value: IpAddrs): Self = StObject.set(x, "ConnectIps", value.asInstanceOf[js.Any])
    
    inline def setConnectIpsUndefined: Self = StObject.set(x, "ConnectIps", js.undefined)
    
    inline def setConnectIpsVarargs(value: IpAddr*): Self = StObject.set(x, "ConnectIps", js.Array(value*))
    
    inline def setCustomerUserName(value: UserName): Self = StObject.set(x, "CustomerUserName", value.asInstanceOf[js.Any])
    
    inline def setCustomerUserNameUndefined: Self = StObject.set(x, "CustomerUserName", js.undefined)
    
    inline def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
