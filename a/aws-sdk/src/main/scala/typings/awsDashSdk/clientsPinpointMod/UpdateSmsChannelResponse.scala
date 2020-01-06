package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSmsChannelResponse extends js.Object {
  var SMSChannelResponse: typings.awsDashSdk.clientsPinpointMod.SMSChannelResponse = js.native
}

object UpdateSmsChannelResponse {
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): UpdateSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSmsChannelResponse]
  }
}

