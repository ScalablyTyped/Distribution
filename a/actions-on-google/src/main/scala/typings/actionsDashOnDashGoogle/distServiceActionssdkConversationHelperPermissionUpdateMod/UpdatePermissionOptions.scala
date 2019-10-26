package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePermissionOptions extends js.Object {
  /**
    * The necessary arguments to fulfill the intent triggered on update.
    * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
    * @public
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  /**
    * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
    * @public
    */
  var intent: String
}

object UpdatePermissionOptions {
  @scala.inline
  def apply(intent: String, arguments: js.Array[GoogleActionsV2Argument] = null): UpdatePermissionOptions = {
    val __obj = js.Dynamic.literal(intent = intent)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    __obj.asInstanceOf[UpdatePermissionOptions]
  }
}

