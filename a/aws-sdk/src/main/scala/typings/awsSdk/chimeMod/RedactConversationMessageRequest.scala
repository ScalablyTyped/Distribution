package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedactConversationMessageRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The conversation ID.
    */
  var ConversationId: NonEmptyString = js.native
  /**
    * The message ID.
    */
  var MessageId: NonEmptyString = js.native
}

object RedactConversationMessageRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, ConversationId: NonEmptyString, MessageId: NonEmptyString): RedactConversationMessageRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConversationId = ConversationId.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactConversationMessageRequest]
  }
}

