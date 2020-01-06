package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAttribute extends js.Object {
  /**
    * The block device mapping of the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.native
  /**
    * If the value is true, you can't terminate the instance through the Amazon EC2 console, CLI, or API; otherwise, you can.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The security groups associated with the instance.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.native
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[AttributeValue] = js.native
  /**
    * Indicates whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
  /**
    * The user data.
    */
  var UserData: js.UndefOr[AttributeValue] = js.native
}

object InstanceAttribute {
  @scala.inline
  def apply(
    BlockDeviceMappings: InstanceBlockDeviceMappingList = null,
    DisableApiTermination: AttributeBooleanValue = null,
    EbsOptimized: AttributeBooleanValue = null,
    EnaSupport: AttributeBooleanValue = null,
    Groups: GroupIdentifierList = null,
    InstanceId: String = null,
    InstanceInitiatedShutdownBehavior: AttributeValue = null,
    InstanceType: AttributeValue = null,
    KernelId: AttributeValue = null,
    ProductCodes: ProductCodeList = null,
    RamdiskId: AttributeValue = null,
    RootDeviceName: AttributeValue = null,
    SourceDestCheck: AttributeBooleanValue = null,
    SriovNetSupport: AttributeValue = null,
    UserData: AttributeValue = null
  ): InstanceAttribute = {
    val __obj = js.Dynamic.literal()
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (DisableApiTermination != null) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination.asInstanceOf[js.Any])
    if (EbsOptimized != null) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    if (EnaSupport != null) __obj.updateDynamic("EnaSupport")(EnaSupport.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName.asInstanceOf[js.Any])
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAttribute]
  }
}

