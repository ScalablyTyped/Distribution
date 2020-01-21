package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2InputPrompt extends js.Object {
  /**
    * Initial prompts asking user to provide an input.
    * Only a single initial_prompt is supported.
    */
  var initialPrompts: js.UndefOr[js.Array[GoogleActionsV2SpeechResponse]] = js.undefined
  /**
    * Prompt used to ask user when there is no input from user.
    */
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
  /**
    * Prompt payload.
    */
  var richInitialPrompt: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
}

object GoogleActionsV2InputPrompt {
  @scala.inline
  def apply(
    initialPrompts: js.Array[GoogleActionsV2SpeechResponse] = null,
    noInputPrompts: js.Array[GoogleActionsV2SimpleResponse] = null,
    richInitialPrompt: GoogleActionsV2RichResponse = null
  ): GoogleActionsV2InputPrompt = {
    val __obj = js.Dynamic.literal()
    if (initialPrompts != null) __obj.updateDynamic("initialPrompts")(initialPrompts.asInstanceOf[js.Any])
    if (noInputPrompts != null) __obj.updateDynamic("noInputPrompts")(noInputPrompts.asInstanceOf[js.Any])
    if (richInitialPrompt != null) __obj.updateDynamic("richInitialPrompt")(richInitialPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2InputPrompt]
  }
}

