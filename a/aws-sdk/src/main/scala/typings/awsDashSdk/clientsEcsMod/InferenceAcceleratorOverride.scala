package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAcceleratorOverride extends js.Object {
  /**
    * The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: js.UndefOr[String] = js.native
}

object InferenceAcceleratorOverride {
  @scala.inline
  def apply(deviceName: String = null, deviceType: String = null): InferenceAcceleratorOverride = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceAcceleratorOverride]
  }
}

