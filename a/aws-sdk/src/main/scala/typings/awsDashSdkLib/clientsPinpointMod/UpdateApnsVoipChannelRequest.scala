package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsVoipChannelRequest extends js.Object {
  var APNSVoipChannelRequest: awsDashSdkLib.clientsPinpointMod.APNSVoipChannelRequest
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
}

object UpdateApnsVoipChannelRequest {
  @scala.inline
  def apply(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: __string): UpdateApnsVoipChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
  }
}

