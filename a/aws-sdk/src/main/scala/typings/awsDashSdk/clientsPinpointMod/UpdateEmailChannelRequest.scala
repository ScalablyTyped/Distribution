package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var EmailChannelRequest: typings.awsDashSdk.clientsPinpointMod.EmailChannelRequest = js.native
}

object UpdateEmailChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
}

