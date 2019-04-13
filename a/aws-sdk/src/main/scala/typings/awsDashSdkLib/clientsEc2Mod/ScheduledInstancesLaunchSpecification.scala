package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstancesLaunchSpecification extends js.Object {
  /**
    * One or more block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.undefined
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI).
    */
  var ImageId: String
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.undefined
  /**
    * One or more network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.undefined
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[ScheduledInstancesPlacement] = js.undefined
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  /**
    * The IDs of one or more security groups.
    */
  var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The base64-encoded MIME user data.
    */
  var UserData: js.UndefOr[String] = js.undefined
}

object ScheduledInstancesLaunchSpecification {
  @scala.inline
  def apply(
    ImageId: String,
    BlockDeviceMappings: ScheduledInstancesBlockDeviceMappingSet = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    IamInstanceProfile: ScheduledInstancesIamInstanceProfile = null,
    InstanceType: String = null,
    KernelId: String = null,
    KeyName: String = null,
    Monitoring: ScheduledInstancesMonitoring = null,
    NetworkInterfaces: ScheduledInstancesNetworkInterfaceSet = null,
    Placement: ScheduledInstancesPlacement = null,
    RamdiskId: String = null,
    SecurityGroupIds: ScheduledInstancesSecurityGroupIdSet = null,
    SubnetId: String = null,
    UserData: String = null
  ): ScheduledInstancesLaunchSpecification = {
    val __obj = js.Dynamic.literal(ImageId = ImageId)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[ScheduledInstancesLaunchSpecification]
  }
}

