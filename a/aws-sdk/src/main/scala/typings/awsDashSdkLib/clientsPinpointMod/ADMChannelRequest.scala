package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you obtained from the Amazon App Distribution Portal.
    */
  var ClientId: js.UndefOr[__string] = js.undefined
  /**
    * The Client Secret that you obtained from the Amazon App Distribution Portal.
    */
  var ClientSecret: js.UndefOr[__string] = js.undefined
  /**
    * Indicates whether or not the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object ADMChannelRequest {
  @scala.inline
  def apply(
    ClientId: __string = null,
    ClientSecret: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined
  ): ADMChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (ClientSecret != null) __obj.updateDynamic("ClientSecret")(ClientSecret)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[ADMChannelRequest]
  }
}

