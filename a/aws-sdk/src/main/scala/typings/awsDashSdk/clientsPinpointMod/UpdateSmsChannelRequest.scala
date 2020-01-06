package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSmsChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var SMSChannelRequest: typings.awsDashSdk.clientsPinpointMod.SMSChannelRequest = js.native
}

object UpdateSmsChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, SMSChannelRequest: SMSChannelRequest): UpdateSmsChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSmsChannelRequest]
  }
}

