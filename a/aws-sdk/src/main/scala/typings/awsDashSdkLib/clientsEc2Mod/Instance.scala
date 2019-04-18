package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * The AMI launch index, which can be used to find this instance in the launch group.
    */
  var AmiLaunchIndex: js.UndefOr[Integer] = js.undefined
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  /**
    * Any block device mapping entries for the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse] = js.undefined
  /**
    * The idempotency token you provided when you launched the instance, if applicable.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The CPU options for the instance.
    */
  var CpuOptions: js.UndefOr[CpuOptions] = js.undefined
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The Elastic GPU associated with the instance.
    */
  var ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList] = js.undefined
  /**
    *  The elastic inference accelerator associated with the instance. 
    */
  var ElasticInferenceAcceleratorAssociations: js.UndefOr[ElasticInferenceAcceleratorAssociationList] = js.undefined
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the instance is enabled for hibernation.
    */
  var HibernationOptions: js.UndefOr[HibernationOptions] = js.undefined
  /**
    * The hypervisor type of the instance.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.undefined
  /**
    * The IAM instance profile associated with the instance, if applicable.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined
  /**
    * The ID of the AMI used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this is a Spot Instance or a Scheduled Instance.
    */
  var InstanceLifecycle: js.UndefOr[InstanceLifecycleType] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The kernel associated with this instance, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair, if this instance was launched with an associated key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * The time the instance was launched.
    */
  var LaunchTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The license configurations.
    */
  var Licenses: js.UndefOr[LicenseList] = js.undefined
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[Monitoring] = js.undefined
  /**
    * [EC2-VPC] The network interfaces for the instance.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList] = js.undefined
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[Placement] = js.undefined
  /**
    * The value is Windows for Windows instances; otherwise blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  /**
    * (IPv4 only) The private DNS hostname name assigned to the instance. This DNS hostname can only be used inside the Amazon EC2 network. This name is not available until the instance enters the running state.  [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private DNS hostnames if you've enabled DNS resolution and DNS hostnames in your VPC. If you are not using the Amazon-provided DNS server in your VPC, your custom domain name servers must resolve the hostname as appropriate.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The private IPv4 address assigned to the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The product codes attached to this instance, if applicable.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * (IPv4 only) The public DNS name assigned to the instance. This name is not available until the instance enters the running state. For EC2-VPC, this name is only available if you've enabled DNS hostnames for your VPC.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  /**
    * The public IPv4 address assigned to the instance, if applicable.
    */
  var PublicIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The RAM disk associated with this instance, if applicable.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.undefined
  /**
    * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.undefined
  /**
    * The security groups for the instance.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * Specifies whether to enable an instance launched in a VPC to perform NAT. This controls whether source/destination checking is enabled on the instance. A value of true means that checking is enabled, and false means that checking is disabled. The value must be false for the instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * If the request is a Spot Instance request, the ID of the request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.undefined
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.undefined
  /**
    * The reason for the most recent state transition.
    */
  var StateReason: js.UndefOr[StateReason] = js.undefined
  /**
    * The reason for the most recent state transition. This might be an empty string.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  /**
    * [EC2-VPC] The ID of the subnet in which the instance is running.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The virtualization type of the instance.
    */
  var VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
  /**
    * [EC2-VPC] The ID of the VPC in which the instance is running.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    AmiLaunchIndex: js.UndefOr[Integer] = js.undefined,
    Architecture: ArchitectureValues = null,
    BlockDeviceMappings: InstanceBlockDeviceMappingList = null,
    CapacityReservationId: String = null,
    CapacityReservationSpecification: CapacityReservationSpecificationResponse = null,
    ClientToken: String = null,
    CpuOptions: CpuOptions = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    ElasticGpuAssociations: ElasticGpuAssociationList = null,
    ElasticInferenceAcceleratorAssociations: ElasticInferenceAcceleratorAssociationList = null,
    EnaSupport: js.UndefOr[Boolean] = js.undefined,
    HibernationOptions: HibernationOptions = null,
    Hypervisor: HypervisorType = null,
    IamInstanceProfile: IamInstanceProfile = null,
    ImageId: String = null,
    InstanceId: String = null,
    InstanceLifecycle: InstanceLifecycleType = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    LaunchTime: DateTime = null,
    Licenses: LicenseList = null,
    Monitoring: Monitoring = null,
    NetworkInterfaces: InstanceNetworkInterfaceList = null,
    Placement: Placement = null,
    Platform: PlatformValues = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    ProductCodes: ProductCodeList = null,
    PublicDnsName: String = null,
    PublicIpAddress: String = null,
    RamdiskId: String = null,
    RootDeviceName: String = null,
    RootDeviceType: DeviceType = null,
    SecurityGroups: GroupIdentifierList = null,
    SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
    SpotInstanceRequestId: String = null,
    SriovNetSupport: String = null,
    State: InstanceState = null,
    StateReason: StateReason = null,
    StateTransitionReason: String = null,
    SubnetId: String = null,
    Tags: TagList = null,
    VirtualizationType: VirtualizationType = null,
    VpcId: String = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AmiLaunchIndex)) __obj.updateDynamic("AmiLaunchIndex")(AmiLaunchIndex)
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId)
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (ElasticGpuAssociations != null) __obj.updateDynamic("ElasticGpuAssociations")(ElasticGpuAssociations)
    if (ElasticInferenceAcceleratorAssociations != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociations")(ElasticInferenceAcceleratorAssociations)
    if (!js.isUndefined(EnaSupport)) __obj.updateDynamic("EnaSupport")(EnaSupport)
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions)
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceLifecycle != null) __obj.updateDynamic("InstanceLifecycle")(InstanceLifecycle.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime)
    if (Licenses != null) __obj.updateDynamic("Licenses")(Licenses)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName)
    if (PublicIpAddress != null) __obj.updateDynamic("PublicIpAddress")(PublicIpAddress)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName)
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId)
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport)
    if (State != null) __obj.updateDynamic("State")(State)
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason)
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Instance]
  }
}

