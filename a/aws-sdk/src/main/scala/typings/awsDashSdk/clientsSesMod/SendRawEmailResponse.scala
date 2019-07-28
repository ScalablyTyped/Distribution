package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendRawEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendRawEmail action. 
    */
  var MessageId: typings.awsDashSdk.clientsSesMod.MessageId
}

object SendRawEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendRawEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId)
  
    __obj.asInstanceOf[SendRawEmailResponse]
  }
}

