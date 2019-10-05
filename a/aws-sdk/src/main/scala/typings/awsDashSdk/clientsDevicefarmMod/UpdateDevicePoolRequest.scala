package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDevicePoolRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Device Farm device pool you wish to update.
    */
  var arn: AmazonResourceName
  /**
    * Sets whether the maxDevices parameter applies to your device pool. If you set this parameter to true, the maxDevices parameter does not apply, and Device Farm does not limit the number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that meet the criteria that are specified for the rules parameter. If you use this parameter in your request, you cannot use the maxDevices parameter in the same request.
    */
  var clearMaxDevices: js.UndefOr[Boolean] = js.undefined
  /**
    * A description of the device pool you wish to update.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and that meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests. If you use this parameter in your request, you cannot use the clearMaxDevices parameter in the same request.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
  /**
    * A string representing the name of the device pool you wish to update.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose to update rules for your request, the update will replace the existing rules.
    */
  var rules: js.UndefOr[Rules] = js.undefined
}

object UpdateDevicePoolRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    clearMaxDevices: js.UndefOr[scala.Boolean] = js.undefined,
    description: Message = null,
    maxDevices: Int | scala.Double = null,
    name: Name = null,
    rules: Rules = null
  ): UpdateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (!js.isUndefined(clearMaxDevices)) __obj.updateDynamic("clearMaxDevices")(clearMaxDevices)
    if (description != null) __obj.updateDynamic("description")(description)
    if (maxDevices != null) __obj.updateDynamic("maxDevices")(maxDevices.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[UpdateDevicePoolRequest]
  }
}

