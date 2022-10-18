package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLaunchTemplateData extends StObject {
  
  /**
    * The block device mapping.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList] = js.undefined
  
  /**
    * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest] = js.undefined
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest] = js.undefined
  
  /**
    * The credit option for CPU usage of the instance. Valid only for T instances.
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined
  
  /**
    * Indicates whether to enable the instance for stop protection. For more information, see Stop Protection.
    */
  var DisableApiStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An elastic GPU to associate with the instance.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList] = js.undefined
  
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorList] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for Amazon Web Services Nitro Enclaves. For more information, see  What is Amazon Web Services Nitro Enclaves? in the Amazon Web Services Nitro Enclaves User Guide. You can't enable Amazon Web Services Nitro Enclaves and hibernation on the same instance.
    */
  var EnclaveOptions: js.UndefOr[LaunchTemplateEnclaveOptionsRequest] = js.undefined
  
  /**
    * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the hibernation prerequisites. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of an IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImageId] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.undefined
  
  /**
    * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with these attributes. If you specify InstanceRequirements, you can't specify InstanceType.
    */
  var InstanceRequirements: js.UndefOr[InstanceRequirementsRequest] = js.undefined
  
  /**
    * The instance type. For more information, see Instance types in the Amazon Elastic Compute Cloud User Guide. If you specify InstanceType, you can't specify InstanceRequirements.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User provided kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KernelId] = js.undefined
  
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.undefined
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest] = js.undefined
  
  /**
    * The maintenance options for the instance.
    */
  var MaintenanceOptions: js.UndefOr[LaunchTemplateInstanceMaintenanceOptionsRequest] = js.undefined
  
  /**
    * The metadata options for the instance. For more information, see Instance metadata and user data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptionsRequest] = js.undefined
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest] = js.undefined
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList] = js.undefined
  
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacementRequest] = js.undefined
  
  /**
    * The options for the instance hostname. The default values are inherited from the subnet.
    */
  var PrivateDnsNameOptions: js.UndefOr[LaunchTemplatePrivateDnsNameOptionsRequest] = js.undefined
  
  /**
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User provided kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamDiskId: js.UndefOr[RamdiskId] = js.undefined
  
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined
  
  /**
    * The tags to apply to the resources that are created during instance launch. You can specify tags for the following resources only:   Instances   Volumes   Elastic graphics   Spot Instance requests   Network interfaces   To tag a resource after it has been created, see CreateTags.  To tag the launch template itself, you must use the TagSpecification parameter. 
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.undefined
  
  /**
    * The user data to make available to the instance. You must provide base64-encoded text. User data is limited to 16 KB. For more information, see Run commands on your Linux instance at launch (Linux) or Work with instance user data (Windows) in the Amazon Elastic Compute Cloud User Guide. If you are creating the launch template for use with Batch, the user data must be provided in the  MIME multi-part archive format. For more information, see Amazon EC2 user data in launch templates in the Batch User Guide.
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object RequestLaunchTemplateData {
  
  inline def apply(): RequestLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLaunchTemplateData]
  }
  
  extension [Self <: RequestLaunchTemplateData](x: Self) {
    
    inline def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingRequestList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMappingRequest*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationRequest): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    inline def setCpuOptions(value: LaunchTemplateCpuOptionsRequest): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    inline def setCreditSpecification(value: CreditSpecificationRequest): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setCreditSpecificationUndefined: Self = StObject.set(x, "CreditSpecification", js.undefined)
    
    inline def setDisableApiStop(value: Boolean): Self = StObject.set(x, "DisableApiStop", value.asInstanceOf[js.Any])
    
    inline def setDisableApiStopUndefined: Self = StObject.set(x, "DisableApiStop", js.undefined)
    
    inline def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setElasticGpuSpecifications(value: ElasticGpuSpecificationList): Self = StObject.set(x, "ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "ElasticGpuSpecifications", js.undefined)
    
    inline def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecification*): Self = StObject.set(x, "ElasticGpuSpecifications", js.Array(value*))
    
    inline def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorList): Self = StObject.set(x, "ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorsUndefined: Self = StObject.set(x, "ElasticInferenceAccelerators", js.undefined)
    
    inline def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAccelerator*): Self = StObject.set(x, "ElasticInferenceAccelerators", js.Array(value*))
    
    inline def setEnclaveOptions(value: LaunchTemplateEnclaveOptionsRequest): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setHibernationOptions(value: LaunchTemplateHibernationOptionsRequest): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    inline def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    inline def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecificationRequest): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptionsRequest): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    inline def setInstanceRequirements(value: InstanceRequirementsRequest): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsUndefined: Self = StObject.set(x, "InstanceRequirements", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLicenseSpecifications(value: LaunchTemplateLicenseSpecificationListRequest): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfigurationRequest*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value*))
    
    inline def setMaintenanceOptions(value: LaunchTemplateInstanceMaintenanceOptionsRequest): Self = StObject.set(x, "MaintenanceOptions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceOptionsUndefined: Self = StObject.set(x, "MaintenanceOptions", js.undefined)
    
    inline def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptionsRequest): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setMonitoring(value: LaunchTemplatesMonitoringRequest): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequest*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setPlacement(value: LaunchTemplatePlacementRequest): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPrivateDnsNameOptions(value: LaunchTemplatePrivateDnsNameOptionsRequest): Self = StObject.set(x, "PrivateDnsNameOptions", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameOptionsUndefined: Self = StObject.set(x, "PrivateDnsNameOptions", js.undefined)
    
    inline def setRamDiskId(value: RamdiskId): Self = StObject.set(x, "RamDiskId", value.asInstanceOf[js.Any])
    
    inline def setRamDiskIdUndefined: Self = StObject.set(x, "RamDiskId", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSecurityGroups(value: SecurityGroupStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupName*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setTagSpecifications(value: LaunchTemplateTagSpecificationRequestList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecificationRequest*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
