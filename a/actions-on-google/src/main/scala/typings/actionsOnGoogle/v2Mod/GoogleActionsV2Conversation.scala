package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Conversation extends js.Object {
  /**
    * Unique ID for the multi-turn conversation. It's assigned for the first
    * turn. After that it remains the same for subsequent conversation turns
    * until the conversation is terminated.
    */
  var conversationId: js.UndefOr[String] = js.native
  /**
    * Opaque token specified by the Action in the last conversation turn. It can
    * be used by an Action to track the conversation or to store conversation
    * related data.
    */
  var conversationToken: js.UndefOr[String] = js.native
  /**
    * Type indicates the state of the conversation in its lifecycle.
    */
  var `type`: js.UndefOr[GoogleActionsV2ConversationType] = js.native
}

object GoogleActionsV2Conversation {
  @scala.inline
  def apply(): GoogleActionsV2Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Conversation]
  }
  @scala.inline
  implicit class GoogleActionsV2ConversationOps[Self <: GoogleActionsV2Conversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConversationId(value: String): Self = this.set("conversationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationId: Self = this.set("conversationId", js.undefined)
    @scala.inline
    def setConversationToken(value: String): Self = this.set("conversationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationToken: Self = this.set("conversationToken", js.undefined)
    @scala.inline
    def setType(value: GoogleActionsV2ConversationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

