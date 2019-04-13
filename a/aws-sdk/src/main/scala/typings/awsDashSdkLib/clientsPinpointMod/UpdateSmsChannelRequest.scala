package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSmsChannelRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var SMSChannelRequest: awsDashSdkLib.clientsPinpointMod.SMSChannelRequest
}

object UpdateSmsChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, SMSChannelRequest: SMSChannelRequest): UpdateSmsChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SMSChannelRequest = SMSChannelRequest)
  
    __obj.asInstanceOf[UpdateSmsChannelRequest]
  }
}

