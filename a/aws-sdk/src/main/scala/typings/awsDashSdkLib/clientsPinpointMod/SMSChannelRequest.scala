package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[__string] = js.undefined
}

object SMSChannelRequest {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[__boolean] = js.undefined,
    SenderId: __string = null,
    ShortCode: __string = null
  ): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode)
    __obj.asInstanceOf[SMSChannelRequest]
  }
}

