package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAcceleratorResponse extends js.Object {
  /**
    * The description of the accelerator.
    */
  var Accelerator: js.UndefOr[Accelerator] = js.undefined
}

object DescribeAcceleratorResponse {
  @scala.inline
  def apply(Accelerator: Accelerator = null): DescribeAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerator != null) __obj.updateDynamic("Accelerator")(Accelerator)
    __obj.asInstanceOf[DescribeAcceleratorResponse]
  }
}

