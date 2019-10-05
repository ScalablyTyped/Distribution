package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfiguration extends js.Object {
  /**
    * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's instances.  For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AssociatePublicIpAddress] = js.undefined
  /**
    * A block device mapping, which specifies the block devices for the instance. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.BlockDeviceMappings] = js.undefined
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.  For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId.  For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.ClassicLinkVPCSecurityGroups] = js.undefined
  /**
    * The creation date and time for the launch configuration.
    */
  var CreatedTime: TimestampType
  /**
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false).  For more information, see Amazon EBS-Optimized Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimized: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.EbsOptimized] = js.undefined
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role.  For more information, see IAM Role for Applications That Run on Amazon EC2 Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.  For more information, see Finding an AMI in the Amazon EC2 User Guide for Linux Instances.
    */
  var ImageId: XmlStringMaxLen255
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.  For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide. 
    */
  var InstanceMonitoring: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.InstanceMonitoring] = js.undefined
  /**
    * The instance type for the instances. For information about available instance types, see Available Instance Types in the Amazon EC2 User Guide for Linux Instances. 
    */
  var InstanceType: XmlStringMaxLen255
  /**
    * The ID of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The name of the key pair. For more information, see Amazon EC2 Key Pairs in the Amazon EC2 User Guide for Linux Instances.
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
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. For more information, see Instance Placement Tenancy in the Amazon EC2 Auto Scaling User Guide.
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
  /**
    * The ID of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * A list that contains the security groups to assign to the instances in the Auto Scaling group.  For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SecurityGroups] = js.undefined
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot market price.  For more information, see Launching Spot Instances in Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var SpotPrice: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SpotPrice] = js.undefined
  /**
    * The Base64-encoded user data to make available to the launched EC2 instances.  For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
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

