package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeAuthorizationMessageRequest extends js.Object {
  /**
    * The encoded message that was returned with the response.
    */
  var EncodedMessage: encodedMessageType
}

object DecodeAuthorizationMessageRequest {
  @scala.inline
  def apply(EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal(EncodedMessage = EncodedMessage)
  
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
}

