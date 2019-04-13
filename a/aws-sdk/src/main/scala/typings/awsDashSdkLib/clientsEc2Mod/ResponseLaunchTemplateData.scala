package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseLaunchTemplateData extends js.Object {
  /**
    * The block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.undefined
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.undefined
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.undefined
  /**
    * The credit option for CPU usage of the instance.
    */
  var CreditSpecification: js.UndefOr[CreditSpecification] = js.undefined
  /**
    * If set to true, indicates that the instance cannot be terminated using the Amazon EC2 console, command line tool, or API.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The elastic GPU specification.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.undefined
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList] = js.undefined
  /**
    * Indicates whether an instance is configured for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.undefined
  /**
    * The ID of the AMI that was used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The ID of the kernel, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList] = js.undefined
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.undefined
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.undefined
  /**
    * The placement of the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacement] = js.undefined
  /**
    * The ID of the RAM disk, if applicable.
    */
  var RamDiskId: js.UndefOr[String] = js.undefined
  /**
    * The security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The security group names.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The tags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.undefined
  /**
    * The user data for the instance. 
    */
  var UserData: js.UndefOr[String] = js.undefined
}

object ResponseLaunchTemplateData {
  @scala.inline
  def apply(
    BlockDeviceMappings: LaunchTemplateBlockDeviceMappingList = null,
    CapacityReservationSpecification: LaunchTemplateCapacityReservationSpecificationResponse = null,
    CpuOptions: LaunchTemplateCpuOptions = null,
    CreditSpecification: CreditSpecification = null,
    DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
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
    __obj.asInstanceOf[ResponseLaunchTemplateData]
  }
}

