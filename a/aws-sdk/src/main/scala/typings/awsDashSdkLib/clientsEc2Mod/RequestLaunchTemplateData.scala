package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLaunchTemplateData extends js.Object {
  /**
    * The block device mapping.  Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error. This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed using this action. 
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
    * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined
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
    * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the hibernation prerequisites. Hibernation is currently supported only for Amazon Linux. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.undefined
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest] = js.undefined
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
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamDiskId: js.UndefOr[String] = js.undefined
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  /**
    * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.undefined
  /**
    * The Base64-encoded user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows).
    */
  var UserData: js.UndefOr[String] = js.undefined
}

object RequestLaunchTemplateData {
  @scala.inline
  def apply(
    BlockDeviceMappings: LaunchTemplateBlockDeviceMappingRequestList = null,
    CapacityReservationSpecification: LaunchTemplateCapacityReservationSpecificationRequest = null,
    CpuOptions: LaunchTemplateCpuOptionsRequest = null,
    CreditSpecification: CreditSpecificationRequest = null,
    DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    ElasticGpuSpecifications: ElasticGpuSpecificationList = null,
    ElasticInferenceAccelerators: LaunchTemplateElasticInferenceAcceleratorList = null,
    HibernationOptions: LaunchTemplateHibernationOptionsRequest = null,
    IamInstanceProfile: LaunchTemplateIamInstanceProfileSpecificationRequest = null,
    ImageId: String = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceMarketOptions: LaunchTemplateInstanceMarketOptionsRequest = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    LicenseSpecifications: LaunchTemplateLicenseSpecificationListRequest = null,
    Monitoring: LaunchTemplatesMonitoringRequest = null,
    NetworkInterfaces: LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = null,
    Placement: LaunchTemplatePlacementRequest = null,
    RamDiskId: String = null,
    SecurityGroupIds: SecurityGroupIdStringList = null,
    SecurityGroups: SecurityGroupStringList = null,
    TagSpecifications: LaunchTemplateTagSpecificationRequestList = null,
    UserData: String = null
  ): RequestLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification)
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions)
    if (CreditSpecification != null) __obj.updateDynamic("CreditSpecification")(CreditSpecification)
    if (!js.isUndefined(DisableApiTermination)) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (ElasticGpuSpecifications != null) __obj.updateDynamic("ElasticGpuSpecifications")(ElasticGpuSpecifications)
    if (ElasticInferenceAccelerators != null) __obj.updateDynamic("ElasticInferenceAccelerators")(ElasticInferenceAccelerators)
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceMarketOptions != null) __obj.updateDynamic("InstanceMarketOptions")(InstanceMarketOptions)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (RamDiskId != null) __obj.updateDynamic("RamDiskId")(RamDiskId)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[RequestLaunchTemplateData]
  }
}

