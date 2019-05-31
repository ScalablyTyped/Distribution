package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * The name of the input into which the message payload will be transformed.
    */
  var inputName: InputName
  /**
    * The ID you wish to assign to the message. Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId
  /**
    * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in which case you must decode it).
    */
  var payload: Payload
}

object Message {
  @scala.inline
  def apply(inputName: InputName, messageId: MessageId, payload: Payload): Message = {
    val __obj = js.Dynamic.literal(inputName = inputName, messageId = messageId, payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

