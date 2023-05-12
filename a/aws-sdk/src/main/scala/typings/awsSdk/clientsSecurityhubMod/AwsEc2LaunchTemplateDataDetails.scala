package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataDetails extends StObject {
  
  /**
    *  Information about a block device mapping for an Amazon EC2 launch template. 
    */
  var BlockDeviceMappingSet: js.UndefOr[AwsEc2LaunchTemplateDataBlockDeviceMappingSetList] = js.undefined
  
  /**
    *  Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time. 
    */
  var CapacityReservationSpecification: js.UndefOr[AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails] = js.undefined
  
  /**
    *  Specifies the CPU options for an instance. For more information, see Optimize CPU options in the Amazon Elastic Compute Cloud User Guide. 
    */
  var CpuOptions: js.UndefOr[AwsEc2LaunchTemplateDataCpuOptionsDetails] = js.undefined
  
  /**
    *  Specifies the credit option for CPU usage of a T2, T3, or T3a instance. 
    */
  var CreditSpecification: js.UndefOr[AwsEc2LaunchTemplateDataCreditSpecificationDetails] = js.undefined
  
  /**
    *  Indicates whether to enable the instance for stop protection. For more information, see Enable stop protection in the Amazon EC2 User Guide. 
    */
  var DisableApiStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API. If set to true, you can. 
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Provides details about Elastic Graphics accelerators to associate with the instance. 
    */
  var ElasticGpuSpecificationSet: js.UndefOr[AwsEc2LaunchTemplateDataElasticGpuSpecificationSetList] = js.undefined
  
  /**
    *  The Amazon Elastic Inference accelerator for the instance. 
    */
  var ElasticInferenceAcceleratorSet: js.UndefOr[AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetList] = js.undefined
  
  /**
    *  Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves. 
    */
  var EnclaveOptions: js.UndefOr[AwsEc2LaunchTemplateDataEnclaveOptionsDetails] = js.undefined
  
  /**
    *  Specifies whether your Amazon EC2 instance is configured for hibernation. 
    */
  var HibernationOptions: js.UndefOr[AwsEc2LaunchTemplateDataHibernationOptionsDetails] = js.undefined
  
  /**
    *  The name or Amazon Resource Name (ARN) of an IAM instance profile. 
    */
  var IamInstanceProfile: js.UndefOr[AwsEc2LaunchTemplateDataIamInstanceProfileDetails] = js.undefined
  
  /**
    *  The ID of the Amazon Machine Image (AMI). 
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Provides the options for specifying the instance initiated shutdown behavior. 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Specifies the market (purchasing) option for an instance. 
    */
  var InstanceMarketOptions: js.UndefOr[AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails] = js.undefined
  
  /**
    *  The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with these attributes. If you specify InstanceRequirements, you can't specify InstanceType. 
    */
  var InstanceRequirements: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsDetails] = js.undefined
  
  /**
    *  The instance type. For more information, see Instance types in the Amazon EC2 User Guide. If you specify InstanceType, you can't specify InstanceRequirements. 
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the kernel. 
    */
  var KernelId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the key pair that allows users to connect to the instance. 
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Specifies a license configuration for an instance. 
    */
  var LicenseSet: js.UndefOr[AwsEc2LaunchTemplateDataLicenseSetList] = js.undefined
  
  /**
    *  The maintenance options of your instance. 
    */
  var MaintenanceOptions: js.UndefOr[AwsEc2LaunchTemplateDataMaintenanceOptionsDetails] = js.undefined
  
  /**
    *  The metadata options for the instance. For more information, see Instance metadata and user data in the Amazon EC2 User Guide. 
    */
  var MetadataOptions: js.UndefOr[AwsEc2LaunchTemplateDataMetadataOptionsDetails] = js.undefined
  
  /**
    *  The monitoring for the instance. 
    */
  var Monitoring: js.UndefOr[AwsEc2LaunchTemplateDataMonitoringDetails] = js.undefined
  
  /**
    *  Specifies the parameters for a network interface that is attached to the instance. 
    */
  var NetworkInterfaceSet: js.UndefOr[AwsEc2LaunchTemplateDataNetworkInterfaceSetList] = js.undefined
  
  /**
    *  Specifies the placement of an instance. 
    */
  var Placement: js.UndefOr[AwsEc2LaunchTemplateDataPlacementDetails] = js.undefined
  
  /**
    *  The options for the instance hostname. 
    */
  var PrivateDnsNameOptions: js.UndefOr[AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails] = js.undefined
  
  /**
    *  The ID of the RAM disk. 
    */
  var RamDiskId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  One or more security group IDs. 
    */
  var SecurityGroupIdSet: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request. 
    */
  var SecurityGroupSet: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The user data to make available to the instance. 
    */
  var UserData: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataDetails] (val x: Self) extends AnyVal {
    
    inline def setBlockDeviceMappingSet(value: AwsEc2LaunchTemplateDataBlockDeviceMappingSetList): Self = StObject.set(x, "BlockDeviceMappingSet", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingSetUndefined: Self = StObject.set(x, "BlockDeviceMappingSet", js.undefined)
    
    inline def setBlockDeviceMappingSetVarargs(value: AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails*): Self = StObject.set(x, "BlockDeviceMappingSet", js.Array(value*))
    
    inline def setCapacityReservationSpecification(value: AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    inline def setCpuOptions(value: AwsEc2LaunchTemplateDataCpuOptionsDetails): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    inline def setCreditSpecification(value: AwsEc2LaunchTemplateDataCreditSpecificationDetails): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setCreditSpecificationUndefined: Self = StObject.set(x, "CreditSpecification", js.undefined)
    
    inline def setDisableApiStop(value: Boolean): Self = StObject.set(x, "DisableApiStop", value.asInstanceOf[js.Any])
    
    inline def setDisableApiStopUndefined: Self = StObject.set(x, "DisableApiStop", js.undefined)
    
    inline def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setElasticGpuSpecificationSet(value: AwsEc2LaunchTemplateDataElasticGpuSpecificationSetList): Self = StObject.set(x, "ElasticGpuSpecificationSet", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuSpecificationSetUndefined: Self = StObject.set(x, "ElasticGpuSpecificationSet", js.undefined)
    
    inline def setElasticGpuSpecificationSetVarargs(value: AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails*): Self = StObject.set(x, "ElasticGpuSpecificationSet", js.Array(value*))
    
    inline def setElasticInferenceAcceleratorSet(value: AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetList): Self = StObject.set(x, "ElasticInferenceAcceleratorSet", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorSetUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorSet", js.undefined)
    
    inline def setElasticInferenceAcceleratorSetVarargs(value: AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails*): Self = StObject.set(x, "ElasticInferenceAcceleratorSet", js.Array(value*))
    
    inline def setEnclaveOptions(value: AwsEc2LaunchTemplateDataEnclaveOptionsDetails): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setHibernationOptions(value: AwsEc2LaunchTemplateDataHibernationOptionsDetails): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    inline def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    inline def setIamInstanceProfile(value: AwsEc2LaunchTemplateDataIamInstanceProfileDetails): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceInitiatedShutdownBehavior(value: NonEmptyString): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceMarketOptions(value: AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    inline def setInstanceRequirements(value: AwsEc2LaunchTemplateDataInstanceRequirementsDetails): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsUndefined: Self = StObject.set(x, "InstanceRequirements", js.undefined)
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: NonEmptyString): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: NonEmptyString): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLicenseSet(value: AwsEc2LaunchTemplateDataLicenseSetList): Self = StObject.set(x, "LicenseSet", value.asInstanceOf[js.Any])
    
    inline def setLicenseSetUndefined: Self = StObject.set(x, "LicenseSet", js.undefined)
    
    inline def setLicenseSetVarargs(value: AwsEc2LaunchTemplateDataLicenseSetDetails*): Self = StObject.set(x, "LicenseSet", js.Array(value*))
    
    inline def setMaintenanceOptions(value: AwsEc2LaunchTemplateDataMaintenanceOptionsDetails): Self = StObject.set(x, "MaintenanceOptions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceOptionsUndefined: Self = StObject.set(x, "MaintenanceOptions", js.undefined)
    
    inline def setMetadataOptions(value: AwsEc2LaunchTemplateDataMetadataOptionsDetails): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setMonitoring(value: AwsEc2LaunchTemplateDataMonitoringDetails): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaceSet(value: AwsEc2LaunchTemplateDataNetworkInterfaceSetList): Self = StObject.set(x, "NetworkInterfaceSet", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceSetUndefined: Self = StObject.set(x, "NetworkInterfaceSet", js.undefined)
    
    inline def setNetworkInterfaceSetVarargs(value: AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails*): Self = StObject.set(x, "NetworkInterfaceSet", js.Array(value*))
    
    inline def setPlacement(value: AwsEc2LaunchTemplateDataPlacementDetails): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPrivateDnsNameOptions(value: AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails): Self = StObject.set(x, "PrivateDnsNameOptions", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameOptionsUndefined: Self = StObject.set(x, "PrivateDnsNameOptions", js.undefined)
    
    inline def setRamDiskId(value: NonEmptyString): Self = StObject.set(x, "RamDiskId", value.asInstanceOf[js.Any])
    
    inline def setRamDiskIdUndefined: Self = StObject.set(x, "RamDiskId", js.undefined)
    
    inline def setSecurityGroupIdSet(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupIdSet", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdSetUndefined: Self = StObject.set(x, "SecurityGroupIdSet", js.undefined)
    
    inline def setSecurityGroupIdSetVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupIdSet", js.Array(value*))
    
    inline def setSecurityGroupSet(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupSet", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupSetUndefined: Self = StObject.set(x, "SecurityGroupSet", js.undefined)
    
    inline def setSecurityGroupSetVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupSet", js.Array(value*))
    
    inline def setUserData(value: NonEmptyString): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
