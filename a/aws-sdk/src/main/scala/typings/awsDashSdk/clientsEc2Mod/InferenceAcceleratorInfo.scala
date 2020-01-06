package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAcceleratorInfo extends js.Object {
  /**
    * Describes the Inference accelerators for the instance type.
    */
  var Accelerators: js.UndefOr[InferenceDeviceInfoList] = js.native
}

object InferenceAcceleratorInfo {
  @scala.inline
  def apply(Accelerators: InferenceDeviceInfoList = null): InferenceAcceleratorInfo = {
    val __obj = js.Dynamic.literal()
    if (Accelerators != null) __obj.updateDynamic("Accelerators")(Accelerators.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceAcceleratorInfo]
  }
}

