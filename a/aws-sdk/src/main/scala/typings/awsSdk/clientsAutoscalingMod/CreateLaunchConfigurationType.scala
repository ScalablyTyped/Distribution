package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchConfigurationType extends StObject {
  
  /**
    * Specifies whether to assign a public IPv4 address to the group's instances. If the instance is launched into a default subnet, the default is to assign a public IPv4 address, unless you disabled the option to assign a public IPv4 address on the subnet. If the instance is launched into a nondefault subnet, the default is not to assign a public IPv4 address, unless you enabled the option to assign a public IPv4 address on the subnet. If you specify true, each instance in the Auto Scaling group receives a unique public IPv4 address. For more information, see Launching Auto Scaling instances in a VPC in the Amazon EC2 Auto Scaling User Guide. If you specify this property, you must specify at least one subnet for VPCZoneIdentifier when you create your group.
    */
  var AssociatePublicIpAddress: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AssociatePublicIpAddress] = js.undefined
  
  /**
    * The block device mapping entries that define the block devices to attach to the instances at launch. By default, the block devices specified in the block device mapping for the AMI are used. For more information, see Block device mappings in the Amazon EC2 User Guide for Linux Instances.
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
    * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For more information, see Amazon EBS-optimized instances in the Amazon EC2 User Guide for Linux Instances. The default value is false.
    */
  var EbsOptimized: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.EbsOptimized] = js.undefined
  
  /**
    * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. For more information, see IAM role for applications that run on Amazon EC2 instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
  
  /**
    * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see Finding a Linux AMI in the Amazon EC2 User Guide for Linux Instances. If you specify InstanceId, an ImageId is not required.
    */
  var ImageId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes from the instance, except for the block device mapping. To create a launch configuration with a block device mapping or override any other instance attributes, specify them as part of the same request. For more information, see Creating a launch configuration using an EC2 instance in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
  
  /**
    * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring. The default value is true (enabled).  When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information, see Configure Monitoring for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide. 
    */
  var InstanceMonitoring: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceMonitoring] = js.undefined
  
  /**
    * Specifies the instance type of the EC2 instance. For information about available instance types, see Available instance types in the Amazon EC2 User Guide for Linux Instances. If you specify InstanceId, an InstanceType is not required.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The ID of the kernel associated with the AMI.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User provided kernels in the Amazon EC2 User Guide for Linux Instances. 
    */
  var KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The name of the key pair. For more information, see Amazon EC2 key pairs and Linux instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The name of the launch configuration. This name must be unique per Region per account.
    */
  var LaunchConfigurationName: XmlStringMaxLen255
  
  /**
    * The metadata options for the instances. For more information, see Configuring the Instance Metadata Options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined
  
  /**
    * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set to default), you must set the value of this property to dedicated. For more information, see Configuring instance tenancy with Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide. If you specify PlacementTenancy, you must specify at least one subnet for VPCZoneIdentifier when you create your group. Valid values: default | dedicated 
    */
  var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * The ID of the RAM disk to select.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User provided kernels in the Amazon EC2 User Guide for Linux Instances. 
    */
  var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * A list that contains the security group IDs to assign to the instances in the Auto Scaling group. For more information, see Control traffic to resources using security groups in the Amazon Virtual Private Cloud User Guide.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SecurityGroups] = js.undefined
  
  /**
    * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot price. For more information, see Request Spot Instances for fault-tolerant and flexible applications in the Amazon EC2 Auto Scaling User Guide. Valid Range: Minimum value of 0.001  When you change your maximum price by creating a new launch configuration, running instances will continue to run as long as the maximum price for those running instances is higher than the current Spot price. 
    */
  var SpotPrice: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SpotPrice] = js.undefined
  
  /**
    * The user data to make available to the launched EC2 instances. For more information, see Instance metadata and user data (Linux) and Instance metadata and user data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[XmlStringUserData] = js.undefined
}
object CreateLaunchConfigurationType {
  
  inline def apply(LaunchConfigurationName: XmlStringMaxLen255): CreateLaunchConfigurationType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLaunchConfigurationType] (val x: Self) extends AnyVal {
    
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
    
    inline def setEbsOptimized(value: EbsOptimized): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setIamInstanceProfile(value: XmlStringMaxLen1600): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: XmlStringMaxLen255): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceMonitoring(value: InstanceMonitoring): Self = StObject.set(x, "InstanceMonitoring", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoringUndefined: Self = StObject.set(x, "InstanceMonitoring", js.undefined)
    
    inline def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: XmlStringMaxLen255): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: XmlStringMaxLen255): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
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
