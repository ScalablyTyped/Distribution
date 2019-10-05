package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDescription extends js.Object {
  /**
    * The ARN of the device.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * An array of zero or more elements of DeviceAttribute objects providing
    user specified device attributes.
    */
  var Attributes: js.UndefOr[DeviceAttributes] = js.undefined
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[__string] = js.undefined
  /**
    * A Boolean value indicating whether or not the device is enabled.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * A value between 0 and 1 inclusive, representing the fraction of life remaining for the
    device.
    */
  var RemainingLife: js.UndefOr[__doubleMin0Max100] = js.undefined
  /**
    * The tags currently associated with the AWS IoT 1-Click device.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
  /**
    * The type of the device, such as "button".
    */
  var Type: js.UndefOr[__string] = js.undefined
}

object DeviceDescription {
  @scala.inline
  def apply(
    Arn: __string = null,
    Attributes: DeviceAttributes = null,
    DeviceId: __string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    RemainingLife: Int | Double = null,
    Tags: __mapOf__string = null,
    Type: __string = null
  ): DeviceDescription = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (RemainingLife != null) __obj.updateDynamic("RemainingLife")(RemainingLife.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[DeviceDescription]
  }
}

