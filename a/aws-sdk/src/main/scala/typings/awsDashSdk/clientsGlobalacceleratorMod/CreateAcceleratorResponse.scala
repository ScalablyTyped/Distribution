package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAcceleratorResponse extends js.Object {
  /**
    * The accelerator that is created by specifying a listener and the supported IP address types.
    */
  var Accelerator: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerator] = js.undefined
}

object CreateAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): CreateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator)
    __obj.asInstanceOf[CreateAcceleratorResponse]
  }
}

