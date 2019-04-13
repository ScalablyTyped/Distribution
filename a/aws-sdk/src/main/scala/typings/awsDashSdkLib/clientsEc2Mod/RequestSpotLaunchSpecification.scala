package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSpotLaunchSpecification extends js.Object {
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.undefined
  /**
    * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  /**
    * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether basic or detailed monitoring is enabled for the instance. Default: Disabled
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.undefined
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  /**
    * One or more security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The Base64-encoded user data for the instance.
    */
  var UserData: js.UndefOr[String] = js.undefined
}

object RequestSpotLaunchSpecification {
  @scala.inline
  def apply(
    AddressingType: String = null,
    BlockDeviceMappings: BlockDeviceMappingList = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    IamInstanceProfile: IamInstanceProfileSpecification = null,
    ImageId: String = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    Monitoring: RunInstancesMonitoringEnabled = null,
    NetworkInterfaces: InstanceNetworkInterfaceSpecificationList = null,
    Placement: SpotPlacement = null,
    RamdiskId: String = null,
    SecurityGroupIds: ValueStringList = null,
    SecurityGroups: ValueStringList = null,
    SubnetId: String = null,
    UserData: String = null
  ): RequestSpotLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    if (AddressingType != null) __obj.updateDynamic("AddressingType")(AddressingType)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[RequestSpotLaunchSpecification]
  }
}

