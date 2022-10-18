package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingLaunchConfigurationDetails extends StObject {
  
  /**
    * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's instances.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the block devices for the instance.
    */
  var BlockDeviceMappings: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsList] = js.undefined
  
  /**
    * The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
    */
  var ClassicLinkVpcId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifiers of one or more security groups for the VPC that is specified in ClassicLinkVPCId.
    */
  var ClassicLinkVpcSecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The creation date and time for the launch configuration. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the launch configuration is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name or the ARN of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role.
    */
  var IamInstanceProfile: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates the type of monitoring for instances in the group.
    */
  var InstanceMonitoring: js.UndefOr[AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails] = js.undefined
  
  /**
    * The instance type for the instances.
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the kernel associated with the AMI.
    */
  var KernelId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The metadata options for the instances.
    */
  var MetadataOptions: js.UndefOr[AwsAutoScalingLaunchConfigurationMetadataOptions] = js.undefined
  
  /**
    * The tenancy of the instance. An instance with dedicated tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC.
    */
  var PlacementTenancy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the RAM disk associated with the AMI.
    */
  var RamdiskId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The security groups to assign to the instances in the Auto Scaling group.
    */
  var SecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
    */
  var SpotPrice: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The user data to make available to the launched EC2 instances. Must be base64-encoded text.
    */
  var UserData: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingLaunchConfigurationDetails {
  
  inline def apply(): AwsAutoScalingLaunchConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationDetails]
  }
  
  extension [Self <: AwsAutoScalingLaunchConfigurationDetails](x: Self) {
    
    inline def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    inline def setBlockDeviceMappings(value: AwsAutoScalingLaunchConfigurationBlockDeviceMappingsList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setClassicLinkVpcId(value: NonEmptyString): Self = StObject.set(x, "ClassicLinkVpcId", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkVpcIdUndefined: Self = StObject.set(x, "ClassicLinkVpcId", js.undefined)
    
    inline def setClassicLinkVpcSecurityGroups(value: NonEmptyStringList): Self = StObject.set(x, "ClassicLinkVpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkVpcSecurityGroupsUndefined: Self = StObject.set(x, "ClassicLinkVpcSecurityGroups", js.undefined)
    
    inline def setClassicLinkVpcSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ClassicLinkVpcSecurityGroups", js.Array(value*))
    
    inline def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setIamInstanceProfile(value: NonEmptyString): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceMonitoring(value: AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails): Self = StObject.set(x, "InstanceMonitoring", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoringUndefined: Self = StObject.set(x, "InstanceMonitoring", js.undefined)
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: NonEmptyString): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: NonEmptyString): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLaunchConfigurationName(value: NonEmptyString): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    inline def setMetadataOptions(value: AwsAutoScalingLaunchConfigurationMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setPlacementTenancy(value: NonEmptyString): Self = StObject.set(x, "PlacementTenancy", value.asInstanceOf[js.Any])
    
    inline def setPlacementTenancyUndefined: Self = StObject.set(x, "PlacementTenancy", js.undefined)
    
    inline def setRamdiskId(value: NonEmptyString): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSecurityGroups(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSpotPrice(value: NonEmptyString): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    inline def setUserData(value: NonEmptyString): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
