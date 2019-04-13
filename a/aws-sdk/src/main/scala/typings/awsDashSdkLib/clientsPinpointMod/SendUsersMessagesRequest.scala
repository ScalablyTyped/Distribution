package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessagesRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var SendUsersMessageRequest: awsDashSdkLib.clientsPinpointMod.SendUsersMessageRequest
}

object SendUsersMessagesRequest {
  @scala.inline
  def apply(ApplicationId: __string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SendUsersMessageRequest = SendUsersMessageRequest)
  
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
}

