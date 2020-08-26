package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationResponse extends js.Object {
  var expectUserResponse: Boolean = js.native
  var expectedIntent: js.UndefOr[GoogleActionsV2ExpectedIntent] = js.native
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  var richResponse: GoogleActionsV2RichResponse = js.native
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
  var userStorage: String = js.native
}

object ConversationResponse {
  @scala.inline
  def apply(expectUserResponse: Boolean, richResponse: GoogleActionsV2RichResponse, userStorage: String): ConversationResponse = {
    val __obj = js.Dynamic.literal(expectUserResponse = expectUserResponse.asInstanceOf[js.Any], richResponse = richResponse.asInstanceOf[js.Any], userStorage = userStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationResponse]
  }
  @scala.inline
  implicit class ConversationResponseOps[Self <: ConversationResponse] (val x: Self) extends AnyVal {
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
    def setExpectUserResponse(value: Boolean): Self = this.set("expectUserResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setRichResponse(value: GoogleActionsV2RichResponse): Self = this.set("richResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserStorage(value: String): Self = this.set("userStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedIntent(value: GoogleActionsV2ExpectedIntent): Self = this.set("expectedIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedIntent: Self = this.set("expectedIntent", js.undefined)
    @scala.inline
    def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = this.set("noInputPrompts", js.Array(value :_*))
    @scala.inline
    def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = this.set("noInputPrompts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInputPrompts: Self = this.set("noInputPrompts", js.undefined)
    @scala.inline
    def setSpeechBiasingHintsVarargs(value: String*): Self = this.set("speechBiasingHints", js.Array(value :_*))
    @scala.inline
    def setSpeechBiasingHints(value: js.Array[String]): Self = this.set("speechBiasingHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeechBiasingHints: Self = this.set("speechBiasingHints", js.undefined)
  }
  
}

