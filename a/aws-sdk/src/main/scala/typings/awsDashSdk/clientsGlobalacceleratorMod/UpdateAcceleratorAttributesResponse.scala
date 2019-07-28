package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAcceleratorAttributesResponse extends js.Object {
  /**
    * Updated attributes for the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.AcceleratorAttributes] = js.undefined
}

object UpdateAcceleratorAttributesResponse {
  @scala.inline
  def apply(AcceleratorAttributes: AcceleratorAttributes = null): UpdateAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorAttributes != null) __obj.updateDynamic("AcceleratorAttributes")(AcceleratorAttributes)
    __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
  }
}

