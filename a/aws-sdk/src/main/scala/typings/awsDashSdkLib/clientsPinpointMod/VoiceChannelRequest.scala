package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the voice channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object VoiceChannelRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[__boolean] = js.undefined): VoiceChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[VoiceChannelRequest]
  }
}

