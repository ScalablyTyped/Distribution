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
  @scala.inline
  implicit class RedactConversationMessageRequestOps[Self <: RedactConversationMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConversationId(value: NonEmptyString): Self = this.set("ConversationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: NonEmptyString): Self = this.set("MessageId", value.asInstanceOf[js.Any])
  }
  
}

