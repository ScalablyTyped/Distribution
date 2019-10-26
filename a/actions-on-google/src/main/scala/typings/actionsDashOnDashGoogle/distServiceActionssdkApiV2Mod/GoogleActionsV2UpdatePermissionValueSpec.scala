package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UpdatePermissionValueSpec extends js.Object {
  /**
    * The list of arguments necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UpdatePermissionValueSpec {
  @scala.inline
  def apply(arguments: js.Array[GoogleActionsV2Argument] = null, intent: String = null): GoogleActionsV2UpdatePermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    __obj.asInstanceOf[GoogleActionsV2UpdatePermissionValueSpec]
  }
}

