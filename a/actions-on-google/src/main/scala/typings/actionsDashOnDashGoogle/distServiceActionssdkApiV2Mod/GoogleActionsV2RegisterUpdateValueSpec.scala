package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2RegisterUpdateValueSpec extends js.Object {
  /**
    * The list of arguments to necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.undefined
  /**
    * The trigger context that defines how the update will be triggered.
    * This may modify the dialog in order to narrow down the user's preferences
    * for getting his or her updates.
    */
  var triggerContext: js.UndefOr[GoogleActionsV2TriggerContext] = js.undefined
}

object GoogleActionsV2RegisterUpdateValueSpec {
  @scala.inline
  def apply(
    arguments: js.Array[GoogleActionsV2Argument] = null,
    intent: String = null,
    triggerContext: GoogleActionsV2TriggerContext = null
  ): GoogleActionsV2RegisterUpdateValueSpec = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (triggerContext != null) __obj.updateDynamic("triggerContext")(triggerContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValueSpec]
  }
}

