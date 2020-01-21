package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfiguration extends js.Object {
  /**
    * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's instances. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsSdk.autoscalingMod.AssociatePublicIpAddress] = js.native
  /**
    * A block device mapping, which specifies the block devices for the instance. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.autoscalingMod.BlockDeviceMappings] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typings.awsSdk.autoscalingMod.ClassicLinkVPCSecurityGroups] = js.native
  /**
    * The creation date and time for the launch configuration.
    */
  var CreatedTime: TimestampType = js.native
  /**
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false). For more information, see Amazon EBS-Optimized Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimized: js.UndefOr[typings.awsSdk.autoscalingMod.EbsOptimized] = js.native
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM Role for Applications That Run on Amazon EC2 Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances. For more information, see Finding an AMI in the Amazon EC2 User Guide for Linux Instances.
    */
  var ImageId: XmlStringMaxLen255 = js.native
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring. For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceMonitoring: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceMonitoring] = js.native
  /**
    * The instance type for the instances. For information about available instance types, see Available Instance Types in the Amazon EC2 User Guide for Linux Instances. 
    */
  var InstanceType: XmlStringMaxLen255 = js.native
  /**
    * The ID of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the key pair. For more information, see Amazon EC2 Key Pairs in the Amazon EC2 User Guide for Linux Instances.
    */
  var KeyName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the launch configuration.
    */
  var LaunchConfigurationARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: XmlStringMaxLen255 = js.native
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. For more information, see Instance Placement Tenancy in the Amazon EC2 Auto Scaling User Guide.
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The ID of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * A list that contains the security groups to assign to the instances in the Auto Scaling group. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.autoscalingMod.SecurityGroups] = js.native
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Launching Spot Instances in Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var SpotPrice: js.UndefOr[typings.awsSdk.autoscalingMod.SpotPrice] = js.native
  /**
    * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.native
}

object LaunchConfiguration {
  @scala.inline
  def apply(
    CreatedTime: TimestampType,
    ImageId: XmlStringMaxLen255,
    InstanceType: XmlStringMaxLen255,
    LaunchConfigurationName: XmlStringMaxLen255,
    AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
    BlockDeviceMappings: BlockDeviceMappings = null,
    ClassicLinkVPCId: XmlStringMaxLen255 = null,
    ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
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
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (ClassicLinkVPCId != null) __obj.updateDynamic("ClassicLinkVPCId")(ClassicLinkVPCId.asInstanceOf[js.Any])
    if (ClassicLinkVPCSecurityGroups != null) __obj.updateDynamic("ClassicLinkVPCSecurityGroups")(ClassicLinkVPCSecurityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (InstanceMonitoring != null) __obj.updateDynamic("InstanceMonitoring")(InstanceMonitoring.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (LaunchConfigurationARN != null) __obj.updateDynamic("LaunchConfigurationARN")(LaunchConfigurationARN.asInstanceOf[js.Any])
    if (PlacementTenancy != null) __obj.updateDynamic("PlacementTenancy")(PlacementTenancy.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfiguration]
  }
}

