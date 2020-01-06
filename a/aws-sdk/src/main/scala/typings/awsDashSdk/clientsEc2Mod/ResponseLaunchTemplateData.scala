package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseLaunchTemplateData extends js.Object {
  /**
    * The block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.native
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.native
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.native
  /**
    * The credit option for CPU usage of the instance.
    */
  var CreditSpecification: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CreditSpecification] = js.native
  /**
    * If set to true, indicates that the instance cannot be terminated using the Amazon EC2 console, command line tool, or API.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The elastic GPU specification.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.native
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList] = js.native
  /**
    * Indicates whether an instance is configured for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI that was used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList] = js.native
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.native
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement of the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacement] = js.native
  /**
    * The ID of the RAM disk, if applicable.
    */
  var RamDiskId: js.UndefOr[String] = js.native
  /**
    * The security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The security group names.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  /**
    * The tags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.native
  /**
    * The user data for the instance. 
    */
  var UserData: js.UndefOr[String] = js.native
}

object ResponseLaunchTemplateData {
  @scala.inline
  def apply(
    BlockDeviceMappings: LaunchTemplateBlockDeviceMappingList = null,
    CapacityReservationSpecification: LaunchTemplateCapacityReservationSpecificationResponse = null,
    CpuOptions: LaunchTemplateCpuOptions = null,
    CreditSpecification: CreditSpecification = null,
    DisableApiTermination: js.UndefOr[scala.Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    ElasticGpuSpecifications: ElasticGpuSpecificationResponseList = null,
    ElasticInferenceAccelerators: LaunchTemplateElasticInferenceAcceleratorResponseList = null,
    HibernationOptions: LaunchTemplateHibernationOptions = null,
    IamInstanceProfile: LaunchTemplateIamInstanceProfileSpecification = null,
    ImageId: String = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceMarketOptions: LaunchTemplateInstanceMarketOptions = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    LicenseSpecifications: LaunchTemplateLicenseList = null,
    Monitoring: LaunchTemplatesMonitoring = null,
    NetworkInterfaces: LaunchTemplateInstanceNetworkInterfaceSpecificationList = null,
    Placement: LaunchTemplatePlacement = null,
    RamDiskId: String = null,
    SecurityGroupIds: ValueStringList = null,
    SecurityGroups: ValueStringList = null,
    TagSpecifications: LaunchTemplateTagSpecificationList = null,
    UserData: String = null
  ): ResponseLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification.asInstanceOf[js.Any])
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions.asInstanceOf[js.Any])
    if (CreditSpecification != null) __obj.updateDynamic("CreditSpecification")(CreditSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableApiTermination)) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    if (ElasticGpuSpecifications != null) __obj.updateDynamic("ElasticGpuSpecifications")(ElasticGpuSpecifications.asInstanceOf[js.Any])
    if (ElasticInferenceAccelerators != null) __obj.updateDynamic("ElasticInferenceAccelerators")(ElasticInferenceAccelerators.asInstanceOf[js.Any])
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceMarketOptions != null) __obj.updateDynamic("InstanceMarketOptions")(InstanceMarketOptions.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications.asInstanceOf[js.Any])
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (RamDiskId != null) __obj.updateDynamic("RamDiskId")(RamDiskId.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseLaunchTemplateData]
  }
}

