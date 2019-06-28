package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCMChannelRequest extends js.Object {
  /**
    * The API key, also referred to as a server key, that you received from Google to communicate with Google services.
    */
  var ApiKey: __string
  /**
    * Specifies whether to enable the GCM channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object GCMChannelRequest {
  @scala.inline
  def apply(ApiKey: __string, Enabled: js.UndefOr[__boolean] = js.undefined): GCMChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[GCMChannelRequest]
  }
}

