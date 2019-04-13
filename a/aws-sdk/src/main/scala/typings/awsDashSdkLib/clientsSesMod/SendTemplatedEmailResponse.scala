package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendTemplatedEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendTemplatedEmail action. 
    */
  var MessageId: awsDashSdkLib.clientsSesMod.MessageId
}

object SendTemplatedEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId)
  
    __obj.asInstanceOf[SendTemplatedEmailResponse]
  }
}

