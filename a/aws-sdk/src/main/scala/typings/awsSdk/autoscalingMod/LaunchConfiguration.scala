package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchConfiguration extends StObject {
  
  /**
    * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's instances. For more information, see Launching Auto Scaling instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsSdk.autoscalingMod.AssociatePublicIpAddress] = js.native
  
  /**
    * A block device mapping, which specifies the block devices for the instance. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.autoscalingMod.BlockDeviceMappings] = js.native
  
  /**
    * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId. For more information, see ClassicLink in the Amazon EC2 User Guide for Linux Instances and Linking EC2-Classic instances to a VPC in the Amazon EC2 Auto Scaling User Guide.
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
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM role for applications that run on Amazon EC2 instances in the Amazon EC2 Auto Scaling User Guide.
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
    * The metadata options for the instances. For more information, see Configuring the Instance Metadata Options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.native
  
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. For more information, see Configuring instance tenancy with Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
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
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Requesting Spot Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var SpotPrice: js.UndefOr[typings.awsSdk.autoscalingMod.SpotPrice] = js.native
  
  /**
    * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see Instance metadata and user data in the Amazon EC2 User Guide for Linux Instances.
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
  implicit class LaunchConfigurationMutableBuilder[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappings): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setClassicLinkVPCId(value: XmlStringMaxLen255): Self = StObject.set(x, "ClassicLinkVPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLinkVPCIdUndefined: Self = StObject.set(x, "ClassicLinkVPCId", js.undefined)
    
    @scala.inline
    def setClassicLinkVPCSecurityGroups(value: ClassicLinkVPCSecurityGroups): Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLinkVPCSecurityGroupsUndefined: Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", js.undefined)
    
    @scala.inline
    def setClassicLinkVPCSecurityGroupsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setCreatedTime(value: TimestampType): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimized(value: EbsOptimized): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: XmlStringMaxLen1600): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: XmlStringMaxLen255): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMonitoring(value: InstanceMonitoring): Self = StObject.set(x, "InstanceMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMonitoringUndefined: Self = StObject.set(x, "InstanceMonitoring", js.undefined)
    
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelId(value: XmlStringMaxLen255): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: XmlStringMaxLen255): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationARN(value: ResourceName): Self = StObject.set(x, "LaunchConfigurationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationARNUndefined: Self = StObject.set(x, "LaunchConfigurationARN", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOptions(value: InstanceMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    @scala.inline
    def setPlacementTenancy(value: XmlStringMaxLen64): Self = StObject.set(x, "PlacementTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTenancyUndefined: Self = StObject.set(x, "PlacementTenancy", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: XmlStringMaxLen255): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: XmlString*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSpotPrice(value: SpotPrice): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    @scala.inline
    def setUserData(value: XmlStringUserData): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
