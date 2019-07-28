package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsChannelRequest extends js.Object {
  var APNSChannelRequest: typings.awsDashSdk.clientsPinpointMod.APNSChannelRequest
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object UpdateApnsChannelRequest {
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: __string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
}

