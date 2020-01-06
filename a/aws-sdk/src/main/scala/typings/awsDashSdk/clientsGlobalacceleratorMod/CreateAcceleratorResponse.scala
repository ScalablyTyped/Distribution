package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorResponse extends js.Object {
  /**
    * The accelerator that is created by specifying a listener and the supported IP address types.
    */
  var Accelerator: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerator] = js.native
}

object CreateAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): CreateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorResponse]
  }
}

