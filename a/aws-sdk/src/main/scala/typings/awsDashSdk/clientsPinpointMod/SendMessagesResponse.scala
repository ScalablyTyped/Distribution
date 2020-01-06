package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessagesResponse extends js.Object {
  var MessageResponse: typings.awsDashSdk.clientsPinpointMod.MessageResponse = js.native
}

object SendMessagesResponse {
  @scala.inline
  def apply(MessageResponse: MessageResponse): SendMessagesResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessagesResponse]
  }
}

