package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: awsDashSdkLib.clientsSesMod.MessageId
}

object SendEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId)
  
    __obj.asInstanceOf[SendEmailResponse]
  }
}

