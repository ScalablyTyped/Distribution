package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePool extends js.Object {
  /**
    * The device pool's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The device pool's description.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and that meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
  /**
    * The device pool's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * Information about the device pool's rules.
    */
  var rules: js.UndefOr[Rules] = js.undefined
  /**
    * The device pool's type. Allowed values include:   CURATED: A device pool that is created and managed by AWS Device Farm.   PRIVATE: A device pool that is created and managed by the device pool developer.  
    */
  var `type`: js.UndefOr[DevicePoolType] = js.undefined
}

object DevicePool {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    description: Message = null,
    maxDevices: js.UndefOr[Integer] = js.undefined,
    name: Name = null,
    rules: Rules = null,
    `type`: DevicePoolType = null
  ): DevicePool = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(maxDevices)) __obj.updateDynamic("maxDevices")(maxDevices)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePool]
  }
}

