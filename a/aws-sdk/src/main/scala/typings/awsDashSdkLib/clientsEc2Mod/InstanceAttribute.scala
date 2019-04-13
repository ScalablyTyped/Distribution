package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAttribute extends js.Object {
  /**
    * The block device mapping of the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined
  /**
    * If the value is true, you can't terminate the instance through the Amazon EC2 console, CLI, or API; otherwise, you can.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Indicates whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * The security groups associated with the instance.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.undefined
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Indicates whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The user data.
    */
  var UserData: js.UndefOr[AttributeValue] = js.undefined
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
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (DisableApiTermination != null) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination)
    if (EbsOptimized != null) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (EnaSupport != null) __obj.updateDynamic("EnaSupport")(EnaSupport)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName)
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[InstanceAttribute]
  }
}

