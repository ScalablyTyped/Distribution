package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAcceleratorAttributesResponse extends js.Object {
  /**
    * The attributes of the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.AcceleratorAttributes] = js.undefined
}

object DescribeAcceleratorAttributesResponse {
  @scala.inline
  def apply(AcceleratorAttributes: AcceleratorAttributes = null): DescribeAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorAttributes != null) __obj.updateDynamic("AcceleratorAttributes")(AcceleratorAttributes)
    __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
  }
}

