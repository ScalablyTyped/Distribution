package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceAttributeRequest extends js.Object {
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[InstanceAttributeName] = js.undefined
  /**
    * Modifies the DeleteOnTermination attribute for volumes that are currently attached. The volume must be owned by the caller. If no value is specified for DeleteOnTermination, the default is true and the volume is deleted when the instance is terminated. To add instance store volumes to an Amazon EBS-backed instance, you must add them when you launch the instance. For more information, see Updating the Block Device Mapping when Launching an Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.undefined
  /**
    * If the value is true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot Instances.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Set to true to enable enhanced networking with ENA for the instance. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * [EC2-VPC] Changes the security groups of the instance. You must specify at least one security group, even if it's just the default security group for the VPC. You must specify the security group ID, not the security group name.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * Specifies whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Changes the instance type to the specified value. For more information, see Instance Types. If the instance type is not valid, the error returned is InvalidInstanceAttributeValue.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Changes the instance's kernel to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Kernel: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Changes the instance's RAM disk to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Ramdisk: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Specifies whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the instance. There is no way to disable enhanced networking with the Intel 82599 Virtual Function interface at this time. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Changes the instance's user data to the specified value. If you are using an AWS SDK or command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
    */
  var UserData: js.UndefOr[BlobAttributeValue] = js.undefined
  /**
    * A new value for the attribute. Use only with the kernel, ramdisk, userData, disableApiTermination, or instanceInitiatedShutdownBehavior attribute.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object ModifyInstanceAttributeRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    Attribute: InstanceAttributeName = null,
    BlockDeviceMappings: InstanceBlockDeviceMappingSpecificationList = null,
    DisableApiTermination: AttributeBooleanValue = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EbsOptimized: AttributeBooleanValue = null,
    EnaSupport: AttributeBooleanValue = null,
    Groups: GroupIdStringList = null,
    InstanceInitiatedShutdownBehavior: AttributeValue = null,
    InstanceType: AttributeValue = null,
    Kernel: AttributeValue = null,
    Ramdisk: AttributeValue = null,
    SourceDestCheck: AttributeBooleanValue = null,
    SriovNetSupport: AttributeValue = null,
    UserData: BlobAttributeValue = null,
    Value: String = null
  ): ModifyInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (DisableApiTermination != null) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (EbsOptimized != null) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (EnaSupport != null) __obj.updateDynamic("EnaSupport")(EnaSupport)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Kernel != null) __obj.updateDynamic("Kernel")(Kernel)
    if (Ramdisk != null) __obj.updateDynamic("Ramdisk")(Ramdisk)
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ModifyInstanceAttributeRequest]
  }
}

