package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessagesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var MessageRequest: awsDashSdkLib.clientsPinpointMod.MessageRequest
}

object SendMessagesRequest {
  @scala.inline
  def apply(ApplicationId: __string, MessageRequest: MessageRequest): SendMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, MessageRequest = MessageRequest)
  
    __obj.asInstanceOf[SendMessagesRequest]
  }
}

