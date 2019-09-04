package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InferenceAcceleratorOverride extends js.Object {
  /**
    * The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: js.UndefOr[String] = js.undefined
}

object InferenceAcceleratorOverride {
  @scala.inline
  def apply(deviceName: String = null, deviceType: String = null): InferenceAcceleratorOverride = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType)
    __obj.asInstanceOf[InferenceAcceleratorOverride]
  }
}

