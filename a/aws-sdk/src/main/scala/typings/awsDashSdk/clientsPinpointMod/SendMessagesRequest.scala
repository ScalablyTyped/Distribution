package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessagesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var MessageRequest: typings.awsDashSdk.clientsPinpointMod.MessageRequest = js.native
}

object SendMessagesRequest {
  @scala.inline
  def apply(ApplicationId: __string, MessageRequest: MessageRequest): SendMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessagesRequest]
  }
}

