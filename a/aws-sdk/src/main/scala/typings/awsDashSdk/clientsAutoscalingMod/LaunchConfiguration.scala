package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfiguration extends js.Object {
  /**
    * [EC2-VPC] Indicates whether to assign a public IP address to each instance.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AssociatePublicIpAddress] = js.undefined
  /**
    * A block device mapping, which specifies the block devices for the instance.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.BlockDeviceMappings] = js.undefined
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. This parameter can only be used if you are launching EC2-Classic instances. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide. Conditional: This parameter is required if you specify a ClassicLink-enabled VPC, and cannot be used otherwise.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.ClassicLinkVPCSecurityGroups] = js.undefined
  /**
    * The creation date and time for the launch configuration.
    */
  var CreatedTime: TimestampType
  /**
    * Controls whether the instance is optimized for EBS I/O (true) or not (false).
    */
  var EbsOptimized: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.EbsOptimized] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI).
    */
  var ImageId: XmlStringMaxLen255
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.
    */
  var InstanceMonitoring: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.InstanceMonitoring] = js.undefined
  /**
    * The instance type for the instances.
    */
  var InstanceType: XmlStringMaxLen255
  /**
    * The ID of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the launch configuration.
    */
  var LaunchConfigurationARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: XmlStringMaxLen255
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs in an isolated, single-tenant hardware and can only be launched into a VPC.
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
  /**
    * The ID of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The security groups to associate with the instances.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SecurityGroups] = js.undefined
  /**
    * The price to bid when launching Spot Instances.
    */
  var SpotPrice: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SpotPrice] = js.undefined
  /**
    * The user data available to the instances.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.undefined
}

object LaunchConfiguration {
  @scala.inline
  def apply(
    CreatedTime: TimestampType,
    ImageId: XmlStringMaxLen255,
    InstanceType: XmlStringMaxLen255,
    LaunchConfigurationName: XmlStringMaxLen255,
    AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
    BlockDeviceMappings: BlockDeviceMappings = null,
    ClassicLinkVPCId: XmlStringMaxLen255 = null,
    ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups = null,
    EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined,
    IamInstanceProfile: XmlStringMaxLen1600 = null,
    InstanceMonitoring: InstanceMonitoring = null,
    KernelId: XmlStringMaxLen255 = null,
    KeyName: XmlStringMaxLen255 = null,
    LaunchConfigurationARN: ResourceName = null,
    PlacementTenancy: XmlStringMaxLen64 = null,
    RamdiskId: XmlStringMaxLen255 = null,
    SecurityGroups: SecurityGroups = null,
    SpotPrice: SpotPrice = null,
    UserData: XmlStringUserData = null
  ): LaunchConfiguration = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, ImageId = ImageId, InstanceType = InstanceType, LaunchConfigurationName = LaunchConfigurationName)
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (ClassicLinkVPCId != null) __obj.updateDynamic("ClassicLinkVPCId")(ClassicLinkVPCId)
    if (ClassicLinkVPCSecurityGroups != null) __obj.updateDynamic("ClassicLinkVPCSecurityGroups")(ClassicLinkVPCSecurityGroups)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (InstanceMonitoring != null) __obj.updateDynamic("InstanceMonitoring")(InstanceMonitoring)
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (LaunchConfigurationARN != null) __obj.updateDynamic("LaunchConfigurationARN")(LaunchConfigurationARN)
    if (PlacementTenancy != null) __obj.updateDynamic("PlacementTenancy")(PlacementTenancy)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[LaunchConfiguration]
  }
}

