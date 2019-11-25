package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2PermissionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2PermissionValueSpecPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionOptions extends js.Object {
  /**
    * Context why the permission is being asked.
    * It's the TTS prompt prefix (action phrase) we ask the user.
    * @public
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Extra properties to be spread into the value.
    * For advanced usages like used in {@link UpdatePermission}
    * @public
    */
  var extra: js.UndefOr[GoogleActionsV2PermissionValueSpec] = js.undefined
  /**
    * Array or string of permissions App supports,
    * each of which comes from {@link GoogleActionsV2PermissionValueSpecPermissions}.
    * @public
    */
  var permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
}

object PermissionOptions {
  @scala.inline
  def apply(
    permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions],
    context: String = null,
    extra: GoogleActionsV2PermissionValueSpec = null
  ): PermissionOptions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOptions]
  }
}

