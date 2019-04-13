package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmailChannelRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var EmailChannelRequest: awsDashSdkLib.clientsPinpointMod.EmailChannelRequest
}

object UpdateEmailChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EmailChannelRequest = EmailChannelRequest)
  
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
}

