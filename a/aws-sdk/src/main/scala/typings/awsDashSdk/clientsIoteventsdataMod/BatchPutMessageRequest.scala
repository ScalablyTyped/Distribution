package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutMessageRequest extends js.Object {
  /**
    * The list of messages to send. Each message has the following format: '{ "messageId": "string", "inputName": "string", "payload": "string"}' 
    */
  var messages: Messages
}

object BatchPutMessageRequest {
  @scala.inline
  def apply(messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(messages = messages)
  
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
}

