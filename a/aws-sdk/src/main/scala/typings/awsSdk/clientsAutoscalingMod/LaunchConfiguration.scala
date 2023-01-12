package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfiguration extends StObject {
  
  /**
    * Specifies whether to assign a public IPv4 address to the group's instances. If the instance is launched into a default subnet, the default is to assign a public IPv4 address, unless you disabled the option to assign a public IPv4 address on the subnet. If the instance is launched into a nondefault subnet, the default is not to assign a public IPv4 address, unless you enabled the option to assign a public IPv4 address on the subnet. For more information, see Launching Auto Scaling instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AssociatePublicIpAddress] = js.undefined
  
  /**
    * The block device mapping entries that define the block devices to attach to the instances at launch. By default, the block devices specified in the block device mapping for the AMI are used. For more information, see Block Device Mapping in the Amazon EC2 User Guide for Linux Instances.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.BlockDeviceMappings] = js.undefined
  
  /**
    * Available for backward compatibility.
    */
  var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * Available for backward compatibility.
    */
  var ClassicLinkVPCSecurityGroups: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ClassicLinkVPCSecurityGroups] = js.undefined
  
  /**
    * The creation date and time for the launch configuration.
    */
  var CreatedTime: js.Date
  
  /**
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false). For more information, see Amazon EBS-Optimized Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimized: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.EbsOptimized] = js.undefined
  
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM role for applications that run on Amazon EC2 instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
  
  /**
    * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances. For more information, see Find a Linux AMI in the Amazon EC2 User Guide for Linux Instances.
    */
  var ImageId: XmlStringMaxLen255
  
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring. For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceMonitoring: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceMonitoring] = js.undefined
  
  /**
    * The instance type for the instances. For information about available instance types, see Available instance types in the Amazon EC2 User Guide for Linux Instances.
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
    * The metadata options for the instances. For more information, see Configuring the Instance Metadata Options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined
  
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. For more information, see Configuring instance tenancy with Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * The ID of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * A list that contains the security groups to assign to the instances in the Auto Scaling group. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SecurityGroups] = js.undefined
  
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Requesting Spot Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var SpotPrice: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SpotPrice] = js.undefined
  
  /**
    * The user data to make available to the launched EC2 instances. For more information, see Instance metadata and user data (Linux) and Instance metadata and user data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.undefined
}
object LaunchConfiguration {
  
  inline def apply(
    CreatedTime: js.Date,
    ImageId: XmlStringMaxLen255,
    InstanceType: XmlStringMaxLen255,
    LaunchConfigurationName: XmlStringMaxLen255
  ): LaunchConfiguration = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappings): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setClassicLinkVPCId(value: XmlStringMaxLen255): Self = StObject.set(x, "ClassicLinkVPCId", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkVPCIdUndefined: Self = StObject.set(x, "ClassicLinkVPCId", js.undefined)
    
    inline def setClassicLinkVPCSecurityGroups(value: ClassicLinkVPCSecurityGroups): Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkVPCSecurityGroupsUndefined: Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", js.undefined)
    
    inline def setClassicLinkVPCSecurityGroupsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ClassicLinkVPCSecurityGroups", js.Array(value*))
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimized(value: EbsOptimized): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setIamInstanceProfile(value: XmlStringMaxLen1600): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: XmlStringMaxLen255): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoring(value: InstanceMonitoring): Self = StObject.set(x, "InstanceMonitoring", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoringUndefined: Self = StObject.set(x, "InstanceMonitoring", js.undefined)
    
    inline def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setKernelId(value: XmlStringMaxLen255): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: XmlStringMaxLen255): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLaunchConfigurationARN(value: ResourceName): Self = StObject.set(x, "LaunchConfigurationARN", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationARNUndefined: Self = StObject.set(x, "LaunchConfigurationARN", js.undefined)
    
    inline def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptions(value: InstanceMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setPlacementTenancy(value: XmlStringMaxLen64): Self = StObject.set(x, "PlacementTenancy", value.asInstanceOf[js.Any])
    
    inline def setPlacementTenancyUndefined: Self = StObject.set(x, "PlacementTenancy", js.undefined)
    
    inline def setRamdiskId(value: XmlStringMaxLen255): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: XmlString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSpotPrice(value: SpotPrice): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    inline def setUserData(value: XmlStringUserData): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
