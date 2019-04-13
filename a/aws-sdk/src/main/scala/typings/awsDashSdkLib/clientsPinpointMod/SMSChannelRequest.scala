package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelRequest extends js.Object {
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * ShortCode registered with phone provider.
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

