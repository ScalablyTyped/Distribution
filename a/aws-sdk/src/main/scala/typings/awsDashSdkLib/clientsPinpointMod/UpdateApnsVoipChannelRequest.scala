package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsVoipChannelRequest extends js.Object {
  var APNSVoipChannelRequest: awsDashSdkLib.clientsPinpointMod.APNSVoipChannelRequest
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
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

