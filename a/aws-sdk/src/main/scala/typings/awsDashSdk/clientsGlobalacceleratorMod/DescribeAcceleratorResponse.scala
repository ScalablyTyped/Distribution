package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorResponse extends js.Object {
  /**
    * The description of the accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerator] = js.native
}

object DescribeAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): DescribeAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorResponse]
  }
}

