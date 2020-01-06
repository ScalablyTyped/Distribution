package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendRawEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendRawEmail action. 
    */
  var MessageId: typings.awsDashSdk.clientsSesMod.MessageId = js.native
}

object SendRawEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendRawEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendRawEmailResponse]
  }
}

