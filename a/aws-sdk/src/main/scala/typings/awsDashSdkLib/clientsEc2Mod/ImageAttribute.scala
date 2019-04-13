package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAttribute extends js.Object {
  /**
    * One or more block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.undefined
  /**
    * One or more launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.undefined
  /**
    * One or more product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
}

object ImageAttribute {
  @scala.inline
  def apply(
    BlockDeviceMappings: BlockDeviceMappingList = null,
    Description: AttributeValue = null,
    ImageId: String = null,
    KernelId: AttributeValue = null,
    LaunchPermissions: LaunchPermissionList = null,
    ProductCodes: ProductCodeList = null,
    RamdiskId: AttributeValue = null,
    SriovNetSupport: AttributeValue = null
  ): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (LaunchPermissions != null) __obj.updateDynamic("LaunchPermissions")(LaunchPermissions)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport)
    __obj.asInstanceOf[ImageAttribute]
  }
}

