package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePoolCompatibilityResult extends js.Object {
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.undefined
  /**
    * The device (phone or tablet) that you wish to return information about.
    */
  var device: js.UndefOr[Device] = js.undefined
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.undefined
}

object DevicePoolCompatibilityResult {
  @scala.inline
  def apply(
    compatible: js.UndefOr[scala.Boolean] = js.undefined,
    device: Device = null,
    incompatibilityMessages: IncompatibilityMessages = null
  ): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compatible)) __obj.updateDynamic("compatible")(compatible)
    if (device != null) __obj.updateDynamic("device")(device)
    if (incompatibilityMessages != null) __obj.updateDynamic("incompatibilityMessages")(incompatibilityMessages)
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
}

