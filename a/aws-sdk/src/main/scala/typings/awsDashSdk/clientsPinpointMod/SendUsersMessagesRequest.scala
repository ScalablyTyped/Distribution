package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessagesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var SendUsersMessageRequest: typings.awsDashSdk.clientsPinpointMod.SendUsersMessageRequest = js.native
}

object SendUsersMessagesRequest {
  @scala.inline
  def apply(ApplicationId: __string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
}

