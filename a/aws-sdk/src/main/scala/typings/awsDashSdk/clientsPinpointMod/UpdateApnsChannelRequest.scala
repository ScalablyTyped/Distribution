package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsChannelRequest extends js.Object {
  var APNSChannelRequest: typings.awsDashSdk.clientsPinpointMod.APNSChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
}

object UpdateApnsChannelRequest {
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: __string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
}

