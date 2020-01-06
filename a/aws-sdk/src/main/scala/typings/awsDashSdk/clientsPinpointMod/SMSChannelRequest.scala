package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.native
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[__string] = js.native
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[__string] = js.native
}

object SMSChannelRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, SenderId: __string = null, ShortCode: __string = null): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelRequest]
  }
}

