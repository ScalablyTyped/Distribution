package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorResponse extends js.Object {
  /**
    * Information about the updated accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerator] = js.native
}

object UpdateAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): UpdateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorResponse]
  }
}

