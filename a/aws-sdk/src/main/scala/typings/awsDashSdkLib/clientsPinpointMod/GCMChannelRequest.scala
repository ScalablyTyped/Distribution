package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCMChannelRequest extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  var ApiKey: js.UndefOr[__string] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object GCMChannelRequest {
  @scala.inline
  def apply(ApiKey: __string = null, Enabled: js.UndefOr[__boolean] = js.undefined): GCMChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ApiKey != null) __obj.updateDynamic("ApiKey")(ApiKey)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[GCMChannelRequest]
  }
}

