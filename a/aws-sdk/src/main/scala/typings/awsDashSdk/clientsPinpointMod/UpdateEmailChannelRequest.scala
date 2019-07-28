package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmailChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var EmailChannelRequest: typings.awsDashSdk.clientsPinpointMod.EmailChannelRequest
}

object UpdateEmailChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EmailChannelRequest = EmailChannelRequest)
  
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
}

