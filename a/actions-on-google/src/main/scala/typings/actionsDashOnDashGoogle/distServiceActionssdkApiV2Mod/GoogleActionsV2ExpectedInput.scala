package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2ExpectedInput extends js.Object {
  /**
    * The customized prompt used to ask user for input.
    */
  var inputPrompt: js.UndefOr[GoogleActionsV2InputPrompt] = js.undefined
  /**
    * List of intents that can be used to fulfill this input.
    * To have Actions on Google just return the raw user input, the app
    * should ask for the `actions.intent.TEXT` intent.
    */
  var possibleIntents: js.UndefOr[js.Array[GoogleActionsV2ExpectedIntent]] = js.undefined
  /**
    * List of phrases the Action wants Google to use for speech biasing.
    * Up to 1000 phrases are allowed.
    */
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleActionsV2ExpectedInput {
  @scala.inline
  def apply(
    inputPrompt: GoogleActionsV2InputPrompt = null,
    possibleIntents: js.Array[GoogleActionsV2ExpectedIntent] = null,
    speechBiasingHints: js.Array[String] = null
  ): GoogleActionsV2ExpectedInput = {
    val __obj = js.Dynamic.literal()
    if (inputPrompt != null) __obj.updateDynamic("inputPrompt")(inputPrompt)
    if (possibleIntents != null) __obj.updateDynamic("possibleIntents")(possibleIntents)
    if (speechBiasingHints != null) __obj.updateDynamic("speechBiasingHints")(speechBiasingHints)
    __obj.asInstanceOf[GoogleActionsV2ExpectedInput]
  }
}

