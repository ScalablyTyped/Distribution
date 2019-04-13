package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunInstancesRequest extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  /**
    * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined
  /**
    * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification] = js.undefined
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[CpuOptionsRequest] = js.undefined
  /**
    * The credit option for CPU usage of the instance. Valid values are standard and unlimited. To change this attribute after launch, use ModifyInstanceCreditSpecification. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide. Default: standard (T2 instances) or unlimited (T3 instances)
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute to false after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance. Default: false 
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * An elastic GPU to associate with the instance.
    */
  var ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications] = js.undefined
  /**
    *  An elastic inference accelerator. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[ElasticInferenceAccelerators] = js.undefined
  /**
    * Indicates whether an instance is enabled for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[HibernationOptionsRequest] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined
  /**
    * The ID of the AMI, which you can get by calling DescribeImages. An AMI is required to launch an instance and must be specified here or in a launch template.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  /**
    * The market (purchasing) option for the instances. For RunInstances, persistent Spot Instance requests are only supported when InstanceInterruptionBehavior is set to either hibernate or stop.
    */
  var InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest] = js.undefined
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide. Default: m1.small 
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * [EC2-VPC] Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * The launch template to use to launch the instances. Any parameters that you specify in RunInstances override the same parameters in the launch template. You can specify either the name or ID of a launch template, but not both.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LicenseSpecificationListRequest] = js.undefined
  /**
    * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches the largest possible number of instances above MinCount. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 FAQ.
    */
  var MaxCount: Integer
  /**
    * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches no instances. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 General FAQ.
    */
  var MinCount: Integer
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined
  /**
    * One or more network interfaces. You cannot specify this option and the network interfaces option in the same request.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[Placement] = js.undefined
  /**
    * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet. Only one private IP address can be designated as primary. You can't specify this option if you've specified the option to designate a private IP address as the primary IP address in a network interface specification. You cannot specify this option if you're launching more than one instance in the request. You cannot specify this option and the network interfaces option in the same request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. Default: Amazon EC2 uses the default security group. You cannot specify this option and the network interfaces option in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  /**
    * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify this option and the network interfaces option in the same request. Default: Amazon EC2 uses the default security group.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined
  /**
    * [EC2-VPC] The ID of the subnet to launch the instance into. You cannot specify this option and the network interfaces option in the same request.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
    */
  var UserData: js.UndefOr[String] = js.undefined
}

object RunInstancesRequest {
  @scala.inline
  def apply(
    MaxCount: Integer,
    MinCount: Integer,
    AdditionalInfo: String = null,
    BlockDeviceMappings: BlockDeviceMappingRequestList = null,
    CapacityReservationSpecification: CapacityReservationSpecification = null,
    ClientToken: String = null,
    CpuOptions: CpuOptionsRequest = null,
    CreditSpecification: CreditSpecificationRequest = null,
    DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    ElasticGpuSpecification: ElasticGpuSpecifications = null,
    ElasticInferenceAccelerators: ElasticInferenceAccelerators = null,
    HibernationOptions: HibernationOptionsRequest = null,
    IamInstanceProfile: IamInstanceProfileSpecification = null,
    ImageId: String = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceMarketOptions: InstanceMarketOptionsRequest = null,
    InstanceType: InstanceType = null,
    Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    KernelId: String = null,
    KeyName: String = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    LicenseSpecifications: LicenseSpecificationListRequest = null,
    Monitoring: RunInstancesMonitoringEnabled = null,
    NetworkInterfaces: InstanceNetworkInterfaceSpecificationList = null,
    Placement: Placement = null,
    PrivateIpAddress: String = null,
    RamdiskId: String = null,
    SecurityGroupIds: SecurityGroupIdStringList = null,
    SecurityGroups: SecurityGroupStringList = null,
    SubnetId: String = null,
    TagSpecifications: TagSpecificationList = null,
    UserData: String = null
  ): RunInstancesRequest = {
    val __obj = js.Dynamic.literal(MaxCount = MaxCount, MinCount = MinCount)
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions)
    if (CreditSpecification != null) __obj.updateDynamic("CreditSpecification")(CreditSpecification)
    if (!js.isUndefined(DisableApiTermination)) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (ElasticGpuSpecification != null) __obj.updateDynamic("ElasticGpuSpecification")(ElasticGpuSpecification)
    if (ElasticInferenceAccelerators != null) __obj.updateDynamic("ElasticInferenceAccelerators")(ElasticInferenceAccelerators)
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceMarketOptions != null) __obj.updateDynamic("InstanceMarketOptions")(InstanceMarketOptions)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Ipv6AddressCount)) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount)
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses)
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[RunInstancesRequest]
  }
}

