package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGcmChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var GCMChannelRequest: typings.awsDashSdk.clientsPinpointMod.GCMChannelRequest = js.native
}

object UpdateGcmChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateGcmChannelRequest]
  }
}

