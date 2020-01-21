package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Input extends js.Object {
  /**
    * A list of provided argument values for the input requested by the Action.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  /**
    * Indicates the user's intent. For the first conversation turn, the intent
    * will refer to the triggering intent for the Action. For
    * subsequent conversation turns, the intent will be a common Actions on
    * Google intent (starts with 'actions.').
    * For example, if the expected input is `actions.intent.OPTION`, then the
    * the intent specified here will either be `actions.intent.OPTION` if the
    * Google Assistant was able to satisfy that intent, or
    * `actions.intent.TEXT` if the user provided other information.
    * See https://developers.google.com/actions/reference/rest/intents.
    */
  var intent: js.UndefOr[String] = js.undefined
  /**
    * Raw input transcription from each turn of conversation.
    * Multiple conversation turns may be required for Actions on Google to
    * provide some types of input to the Action.
    */
  var rawInputs: js.UndefOr[js.Array[GoogleActionsV2RawInput]] = js.undefined
}

object GoogleActionsV2Input {
  @scala.inline
  def apply(
    arguments: js.Array[GoogleActionsV2Argument] = null,
    intent: String = null,
    rawInputs: js.Array[GoogleActionsV2RawInput] = null
  ): GoogleActionsV2Input = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (rawInputs != null) __obj.updateDynamic("rawInputs")(rawInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Input]
  }
}

