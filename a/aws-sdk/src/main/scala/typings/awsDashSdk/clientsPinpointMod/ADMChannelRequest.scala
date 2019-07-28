package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: __string
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: __string
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object ADMChannelRequest {
  @scala.inline
  def apply(ClientId: __string, ClientSecret: __string, Enabled: js.UndefOr[__boolean] = js.undefined): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, ClientSecret = ClientSecret)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[ADMChannelRequest]
  }
}

