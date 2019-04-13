package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDevicePoolRequest extends js.Object {
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
  var name: Name
  /**
    * The ARN of the project for the device pool.
    */
  var projectArn: AmazonResourceName
  /**
    * The device pool's rules.
    */
  var rules: Rules
}

object CreateDevicePoolRequest {
  @scala.inline
  def apply(
    name: Name,
    projectArn: AmazonResourceName,
    rules: Rules,
    description: Message = null,
    maxDevices: js.UndefOr[Integer] = js.undefined
  ): CreateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(name = name, projectArn = projectArn, rules = rules)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(maxDevices)) __obj.updateDynamic("maxDevices")(maxDevices)
    __obj.asInstanceOf[CreateDevicePoolRequest]
  }
}

