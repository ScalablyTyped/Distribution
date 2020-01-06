package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageRequest extends js.Object {
  /**
    * The list of messages to send. Each message has the following format: '{ "messageId": "string", "inputName": "string", "payload": "string"}' 
    */
  var messages: Messages = js.native
}

object BatchPutMessageRequest {
  @scala.inline
  def apply(messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
}

