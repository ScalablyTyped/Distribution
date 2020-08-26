package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2InputPrompt extends js.Object {
  /**
    * Initial prompts asking user to provide an input.
    * Only a single initial_prompt is supported.
    */
  var initialPrompts: js.UndefOr[js.Array[GoogleActionsV2SpeechResponse]] = js.native
  /**
    * Prompt used to ask user when there is no input from user.
    */
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  /**
    * Prompt payload.
    */
  var richInitialPrompt: js.UndefOr[GoogleActionsV2RichResponse] = js.native
}

object GoogleActionsV2InputPrompt {
  @scala.inline
  def apply(): GoogleActionsV2InputPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2InputPrompt]
  }
  @scala.inline
  implicit class GoogleActionsV2InputPromptOps[Self <: GoogleActionsV2InputPrompt] (val x: Self) extends AnyVal {
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
    def setInitialPromptsVarargs(value: GoogleActionsV2SpeechResponse*): Self = this.set("initialPrompts", js.Array(value :_*))
    @scala.inline
    def setInitialPrompts(value: js.Array[GoogleActionsV2SpeechResponse]): Self = this.set("initialPrompts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPrompts: Self = this.set("initialPrompts", js.undefined)
    @scala.inline
    def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = this.set("noInputPrompts", js.Array(value :_*))
    @scala.inline
    def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = this.set("noInputPrompts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInputPrompts: Self = this.set("noInputPrompts", js.undefined)
    @scala.inline
    def setRichInitialPrompt(value: GoogleActionsV2RichResponse): Self = this.set("richInitialPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRichInitialPrompt: Self = this.set("richInitialPrompt", js.undefined)
  }
  
}

