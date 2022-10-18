package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSpotLaunchSpecification extends StObject {
  
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.undefined
  
  /**
    * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImageId] = js.undefined
  
  /**
    * The instance type. Only one instance type can be specified.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KernelId] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.undefined
  
  /**
    * Indicates whether basic or detailed monitoring is enabled for the instance. Default: Disabled
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined
  
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.undefined
  
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.clientsEc2Mod.RamdiskId] = js.undefined
  
  /**
    * One or more security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupIdList] = js.undefined
  
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupList] = js.undefined
  
  /**
    * The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetId] = js.undefined
  
  /**
    * The Base64-encoded user data for the instance. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object RequestSpotLaunchSpecification {
  
  inline def apply(): RequestSpotLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotLaunchSpecification]
  }
  
  extension [Self <: RequestSpotLaunchSpecification](x: Self) {
    
    inline def setAddressingType(value: String): Self = StObject.set(x, "AddressingType", value.asInstanceOf[js.Any])
    
    inline def setAddressingTypeUndefined: Self = StObject.set(x, "AddressingType", js.undefined)
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setMonitoring(value: RunInstancesMonitoringEnabled): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setPlacement(value: SpotPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setRamdiskId(value: RamdiskId): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSecurityGroupIds(value: RequestSpotLaunchSpecificationSecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSecurityGroups(value: RequestSpotLaunchSpecificationSecurityGroupList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
