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
    * The metadata options for the instances. For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.native
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
    LaunchConfigurationName: XmlStringMaxLen255
  ): LaunchConfiguration = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfiguration]
  }
  @scala.inline
  implicit class LaunchConfigurationOps[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedTime(value: TimestampType): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: XmlStringMaxLen255): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = this.set("AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("AssociatePublicIpAddress", js.undefined)
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappings): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setClassicLinkVPCId(value: XmlStringMaxLen255): Self = this.set("ClassicLinkVPCId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassicLinkVPCId: Self = this.set("ClassicLinkVPCId", js.undefined)
    @scala.inline
    def setClassicLinkVPCSecurityGroupsVarargs(value: XmlStringMaxLen255*): Self = this.set("ClassicLinkVPCSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setClassicLinkVPCSecurityGroups(value: ClassicLinkVPCSecurityGroups): Self = this.set("ClassicLinkVPCSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassicLinkVPCSecurityGroups: Self = this.set("ClassicLinkVPCSecurityGroups", js.undefined)
    @scala.inline
    def setEbsOptimized(value: EbsOptimized): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: XmlStringMaxLen1600): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    @scala.inline
    def setInstanceMonitoring(value: InstanceMonitoring): Self = this.set("InstanceMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceMonitoring: Self = this.set("InstanceMonitoring", js.undefined)
    @scala.inline
    def setKernelId(value: XmlStringMaxLen255): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setKeyName(value: XmlStringMaxLen255): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setLaunchConfigurationARN(value: ResourceName): Self = this.set("LaunchConfigurationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchConfigurationARN: Self = this.set("LaunchConfigurationARN", js.undefined)
    @scala.inline
    def setMetadataOptions(value: InstanceMetadataOptions): Self = this.set("MetadataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataOptions: Self = this.set("MetadataOptions", js.undefined)
    @scala.inline
    def setPlacementTenancy(value: XmlStringMaxLen64): Self = this.set("PlacementTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTenancy: Self = this.set("PlacementTenancy", js.undefined)
    @scala.inline
    def setRamdiskId(value: XmlStringMaxLen255): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: XmlString*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setSpotPrice(value: SpotPrice): Self = this.set("SpotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("SpotPrice", js.undefined)
    @scala.inline
    def setUserData(value: XmlStringUserData): Self = this.set("UserData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
  
}

