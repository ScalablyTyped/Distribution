package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The agent version. This parameter is set to INHERIT if the instance inherits the default stack setting or to a a version number for a fixed agent version.
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A custom AMI ID to be used to create the instance. For more information, see Instances 
    */
  var AmiId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance architecture: "i386" or "x86_64".
    */
  var Architecture: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Architecture] = js.undefined
  
  /**
    * The instance's Amazon Resource Number (ARN).
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * For load-based or time-based instances, the type.
    */
  var AutoScalingType: js.UndefOr[typings.awsSdk.clientsOpsworksMod.AutoScalingType] = js.undefined
  
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.clientsOpsworksMod.BlockDeviceMappings] = js.undefined
  
  /**
    * The time that the instance was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Whether this is an Amazon EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the associated Amazon EC2 instance.
    */
  var Ec2InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * For container instances, the Amazon ECS cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * For container instances, the instance's ARN.
    */
  var EcsContainerInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The instance Elastic IP address .
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
  
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  
  /**
    * For registered instances, the infrastructure class: ec2 or on-premises.
    */
  var InfrastructureClass: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the instance's IAM profile. For more information about IAM ARNs, see Using Identifiers.
    */
  var InstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type, such as t2.micro.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the last service error. For more information, call DescribeServiceErrors.
    */
  var LastServiceErrorId: js.UndefOr[String] = js.undefined
  
  /**
    * An array containing the instance layer IDs.
    */
  var LayerIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The instance's operating system.
    */
  var Os: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's platform.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's private DNS name.
    */
  var PrivateDns: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.undefined
  
  /**
    * The instance public DNS name.
    */
  var PublicDns: js.UndefOr[String] = js.undefined
  
  /**
    * The instance public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * For registered instances, who performed the registration.
    */
  var RegisteredBy: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's reported AWS OpsWorks Stacks agent version.
    */
  var ReportedAgentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * For registered instances, the reported operating system.
    */
  var ReportedOs: js.UndefOr[typings.awsSdk.clientsOpsworksMod.ReportedOs] = js.undefined
  
  /**
    * The instance's root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typings.awsSdk.clientsOpsworksMod.RootDeviceType] = js.undefined
  
  /**
    * The root device volume ID.
    */
  var RootDeviceVolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * An array containing the instance security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The SSH key's Deep Security Agent (DSA) fingerprint.
    */
  var SshHostDsaKeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The SSH key's RSA fingerprint.
    */
  var SshHostRsaKeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's Amazon EC2 key-pair name.
    */
  var SshKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance status:    booting     connection_lost     online     pending     rebooting     requested     running_setup     setup_failed     shutting_down     start_failed     stop_failed     stopped     stopping     terminated     terminating   
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's subnet ID; applicable only if the stack is running in a VPC.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's tenancy option, such as dedicated or host.
    */
  var Tenancy: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's virtualization type: paravirtual or hvm.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.clientsOpsworksMod.VirtualizationType] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutoScalingType(value: AutoScalingType): Self = StObject.set(x, "AutoScalingType", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingTypeUndefined: Self = StObject.set(x, "AutoScalingType", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappings): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setEc2InstanceId(value: String): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    inline def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    inline def setEcsClusterArnUndefined: Self = StObject.set(x, "EcsClusterArn", js.undefined)
    
    inline def setEcsContainerInstanceArn(value: String): Self = StObject.set(x, "EcsContainerInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setEcsContainerInstanceArnUndefined: Self = StObject.set(x, "EcsContainerInstanceArn", js.undefined)
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setInfrastructureClass(value: String): Self = StObject.set(x, "InfrastructureClass", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureClassUndefined: Self = StObject.set(x, "InfrastructureClass", js.undefined)
    
    inline def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceProfileArn(value: String): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileArnUndefined: Self = StObject.set(x, "InstanceProfileArn", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLastServiceErrorId(value: String): Self = StObject.set(x, "LastServiceErrorId", value.asInstanceOf[js.Any])
    
    inline def setLastServiceErrorIdUndefined: Self = StObject.set(x, "LastServiceErrorId", js.undefined)
    
    inline def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "LayerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value*))
    
    inline def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "Os", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPrivateDns(value: String): Self = StObject.set(x, "PrivateDns", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsUndefined: Self = StObject.set(x, "PrivateDns", js.undefined)
    
    inline def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    inline def setPublicDns(value: String): Self = StObject.set(x, "PublicDns", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsUndefined: Self = StObject.set(x, "PublicDns", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setRegisteredBy(value: String): Self = StObject.set(x, "RegisteredBy", value.asInstanceOf[js.Any])
    
    inline def setRegisteredByUndefined: Self = StObject.set(x, "RegisteredBy", js.undefined)
    
    inline def setReportedAgentVersion(value: String): Self = StObject.set(x, "ReportedAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setReportedAgentVersionUndefined: Self = StObject.set(x, "ReportedAgentVersion", js.undefined)
    
    inline def setReportedOs(value: ReportedOs): Self = StObject.set(x, "ReportedOs", value.asInstanceOf[js.Any])
    
    inline def setReportedOsUndefined: Self = StObject.set(x, "ReportedOs", js.undefined)
    
    inline def setRootDeviceType(value: RootDeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    inline def setRootDeviceVolumeId(value: String): Self = StObject.set(x, "RootDeviceVolumeId", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceVolumeIdUndefined: Self = StObject.set(x, "RootDeviceVolumeId", js.undefined)
    
    inline def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSshHostDsaKeyFingerprint(value: String): Self = StObject.set(x, "SshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setSshHostDsaKeyFingerprintUndefined: Self = StObject.set(x, "SshHostDsaKeyFingerprint", js.undefined)
    
    inline def setSshHostRsaKeyFingerprint(value: String): Self = StObject.set(x, "SshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setSshHostRsaKeyFingerprintUndefined: Self = StObject.set(x, "SshHostRsaKeyFingerprint", js.undefined)
    
    inline def setSshKeyName(value: String): Self = StObject.set(x, "SshKeyName", value.asInstanceOf[js.Any])
    
    inline def setSshKeyNameUndefined: Self = StObject.set(x, "SshKeyName", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTenancy(value: String): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    inline def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
