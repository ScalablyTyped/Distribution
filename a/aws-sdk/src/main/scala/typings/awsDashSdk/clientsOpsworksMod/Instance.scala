package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
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
  var Architecture: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Architecture] = js.undefined
  /**
    * The instance's Amazon Resource Number (ARN).
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * For load-based or time-based instances, the type.
    */
  var AutoScalingType: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.AutoScalingType] = js.undefined
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.BlockDeviceMappings] = js.undefined
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
  var ReportedOs: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.ReportedOs] = js.undefined
  /**
    * The instance's root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.RootDeviceType] = js.undefined
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
  var VirtualizationType: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.VirtualizationType] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    AgentVersion: String = null,
    AmiId: String = null,
    Architecture: Architecture = null,
    Arn: String = null,
    AutoScalingType: AutoScalingType = null,
    AvailabilityZone: String = null,
    BlockDeviceMappings: BlockDeviceMappings = null,
    CreatedAt: DateTime = null,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    Ec2InstanceId: String = null,
    EcsClusterArn: String = null,
    EcsContainerInstanceArn: String = null,
    ElasticIp: String = null,
    Hostname: String = null,
    InfrastructureClass: String = null,
    InstallUpdatesOnBoot: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceId: String = null,
    InstanceProfileArn: String = null,
    InstanceType: String = null,
    LastServiceErrorId: String = null,
    LayerIds: Strings = null,
    Os: String = null,
    Platform: String = null,
    PrivateDns: String = null,
    PrivateIp: String = null,
    PublicDns: String = null,
    PublicIp: String = null,
    RegisteredBy: String = null,
    ReportedAgentVersion: String = null,
    ReportedOs: ReportedOs = null,
    RootDeviceType: RootDeviceType = null,
    RootDeviceVolumeId: String = null,
    SecurityGroupIds: Strings = null,
    SshHostDsaKeyFingerprint: String = null,
    SshHostRsaKeyFingerprint: String = null,
    SshKeyName: String = null,
    StackId: String = null,
    Status: String = null,
    SubnetId: String = null,
    Tenancy: String = null,
    VirtualizationType: VirtualizationType = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion)
    if (AmiId != null) __obj.updateDynamic("AmiId")(AmiId)
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AutoScalingType != null) __obj.updateDynamic("AutoScalingType")(AutoScalingType.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId)
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn)
    if (EcsContainerInstanceArn != null) __obj.updateDynamic("EcsContainerInstanceArn")(EcsContainerInstanceArn)
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp)
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (InfrastructureClass != null) __obj.updateDynamic("InfrastructureClass")(InfrastructureClass)
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceProfileArn != null) __obj.updateDynamic("InstanceProfileArn")(InstanceProfileArn)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (LastServiceErrorId != null) __obj.updateDynamic("LastServiceErrorId")(LastServiceErrorId)
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds)
    if (Os != null) __obj.updateDynamic("Os")(Os)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (PrivateDns != null) __obj.updateDynamic("PrivateDns")(PrivateDns)
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp)
    if (PublicDns != null) __obj.updateDynamic("PublicDns")(PublicDns)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    if (RegisteredBy != null) __obj.updateDynamic("RegisteredBy")(RegisteredBy)
    if (ReportedAgentVersion != null) __obj.updateDynamic("ReportedAgentVersion")(ReportedAgentVersion)
    if (ReportedOs != null) __obj.updateDynamic("ReportedOs")(ReportedOs)
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (RootDeviceVolumeId != null) __obj.updateDynamic("RootDeviceVolumeId")(RootDeviceVolumeId)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SshHostDsaKeyFingerprint != null) __obj.updateDynamic("SshHostDsaKeyFingerprint")(SshHostDsaKeyFingerprint)
    if (SshHostRsaKeyFingerprint != null) __obj.updateDynamic("SshHostRsaKeyFingerprint")(SshHostRsaKeyFingerprint)
    if (SshKeyName != null) __obj.updateDynamic("SshKeyName")(SshKeyName)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy)
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

