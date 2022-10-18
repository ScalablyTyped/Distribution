package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceLaunchSpecification extends StObject {
  
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * The architecture of the instance.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  
  /**
    * The security group IDs.
    */
  var GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The security group names.
    */
  var GroupNames: js.UndefOr[SecurityGroupStringList] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  
  /**
    * The instance type. For more information about the instance types that you can import, see Instance Types in the VM Import/Export User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * Indicates whether monitoring is enabled.
    */
  var Monitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[typings.awsSdk.clientsEc2Mod.Placement] = js.undefined
  
  /**
    * [EC2-VPC] An available IP address from the IP address range of the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-VPC] The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetId] = js.undefined
  
  /**
    * The Base64-encoded user data to make available to the instance.
    */
  var UserData: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserData] = js.undefined
}
object ImportInstanceLaunchSpecification {
  
  inline def apply(): ImportInstanceLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceLaunchSpecification]
  }
  
  extension [Self <: ImportInstanceLaunchSpecification](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    inline def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setGroupIds(value: SecurityGroupIdStringList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value*))
    
    inline def setGroupNames(value: SecurityGroupStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    inline def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    inline def setGroupNamesVarargs(value: SecurityGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value*))
    
    inline def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setMonitoring(value: Boolean): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUserData(value: UserData): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
