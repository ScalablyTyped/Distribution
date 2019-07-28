package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAcceleratorResponse extends js.Object {
  /**
    * Information about the updated accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerator] = js.undefined
}

object UpdateAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): UpdateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator)
    __obj.asInstanceOf[UpdateAcceleratorResponse]
  }
}

