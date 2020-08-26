package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchConfigurationType extends js.Object {
  /**
    * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public IP address to the group's instances. If you specify true, each instance in the Auto Scaling group receives a unique public IP address. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide. If you specify this parameter, you must specify at least one subnet for VPCZoneIdentifier when you create your group.  If the instance is launched into a default subnet, the default is to assign a public IP address, unless you disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP address on the subnet. 
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsSdk.autoscalingMod.AssociatePublicIpAddress] = js.native
  /**
    * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and EBS volumes. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.autoscalingMod.BlockDeviceMappings] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide. This parameter can only be used if you are launching EC2-Classic instances.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic Instances to a VPC in the Amazon EC2 Auto Scaling User Guide. If you specify the ClassicLinkVPCId parameter, you must specify this parameter.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typings.awsSdk.autoscalingMod.ClassicLinkVPCSecurityGroups] = js.native
  /**
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For more information, see Amazon EBS-Optimized Instances in the Amazon EC2 User Guide for Linux Instances. The default value is false.
    */
  var EbsOptimized: js.UndefOr[typings.awsSdk.autoscalingMod.EbsOptimized] = js.native
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM Role for Applications That Run on Amazon EC2 Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see Finding an AMI in the Amazon EC2 User Guide for Linux Instances. If you do not specify InstanceId, you must specify ImageId.
    */
  var ImageId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes from the instance, except for the block device mapping. To create a launch configuration with a block device mapping or override any other instance attributes, specify them as part of the same request. For more information, see Create a Launch Configuration Using an EC2 Instance in the Amazon EC2 Auto Scaling User Guide. If you do not specify InstanceId, you must specify both ImageId and InstanceType.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring. The default value is true (enabled).  When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide. 
    */
  var InstanceMonitoring: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceMonitoring] = js.native
  /**
    * Specifies the instance type of the EC2 instance. For information about available instance types, see Available Instance Types in the Amazon EC2 User Guide for Linux Instances.  If you do not specify InstanceId, you must specify InstanceType.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The ID of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the key pair. For more information, see Amazon EC2 Key Pairs in the Amazon EC2 User Guide for Linux Instances.
    */
  var KeyName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the launch configuration. This name must be unique per Region per account.
    */
  var LaunchConfigurationName: XmlStringMaxLen255 = js.native
  /**
    * The metadata options for the instances. For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.native
  /**
    * The tenancy of the instance. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set to default), you must set the value of this parameter to dedicated. If you specify PlacementTenancy, you must specify at least one subnet for VPCZoneIdentifier when you create your group. For more information, see Instance Placement Tenancy in the Amazon EC2 Auto Scaling User Guide. Valid Values: default | dedicated 
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The ID of the RAM disk to select.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * A list that contains the security groups to assign to the instances in the Auto Scaling group. [EC2-VPC] Specify the security group IDs. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide. [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see Amazon EC2 Security Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.autoscalingMod.SecurityGroups] = js.native
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Launching Spot Instances in Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.  When you change your maximum price by creating a new launch configuration, running instances will continue to run as long as the maximum price for those running instances is higher than the current Spot price. 
    */
  var SpotPrice: js.UndefOr[typings.awsSdk.autoscalingMod.SpotPrice] = js.native
  /**
    * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see Instance Metadata and User Data in the Amazon EC2 User Guide for Linux Instances.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.native
}

object CreateLaunchConfigurationType {
  @scala.inline
  def apply(LaunchConfigurationName: XmlStringMaxLen255): CreateLaunchConfigurationType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchConfigurationType]
  }
  @scala.inline
  implicit class CreateLaunchConfigurationTypeOps[Self <: CreateLaunchConfigurationType] (val x: Self) extends AnyVal {
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
    def setImageId(value: XmlStringMaxLen255): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setInstanceMonitoring(value: InstanceMonitoring): Self = this.set("InstanceMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceMonitoring: Self = this.set("InstanceMonitoring", js.undefined)
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setKernelId(value: XmlStringMaxLen255): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setKeyName(value: XmlStringMaxLen255): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
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

