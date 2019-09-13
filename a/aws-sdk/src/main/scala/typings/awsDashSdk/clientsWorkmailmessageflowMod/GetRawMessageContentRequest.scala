package typings.awsDashSdk.clientsWorkmailmessageflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRawMessageContentRequest extends js.Object {
  /**
    * The identifier of the email message to retrieve.
    */
  var messageId: messageIdType
}

object GetRawMessageContentRequest {
  @scala.inline
  def apply(messageId: messageIdType): GetRawMessageContentRequest = {
    val __obj = js.Dynamic.literal(messageId = messageId)
  
    __obj.asInstanceOf[GetRawMessageContentRequest]
  }
}

