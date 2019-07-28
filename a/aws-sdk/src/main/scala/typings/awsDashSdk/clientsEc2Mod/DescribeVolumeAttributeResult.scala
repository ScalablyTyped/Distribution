package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumeAttributeResult extends js.Object {
  /**
    * The state of autoEnableIO attribute.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}

object DescribeVolumeAttributeResult {
  @scala.inline
  def apply(
    AutoEnableIO: AttributeBooleanValue = null,
    ProductCodes: ProductCodeList = null,
    VolumeId: String = null
  ): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (AutoEnableIO != null) __obj.updateDynamic("AutoEnableIO")(AutoEnableIO)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
}

