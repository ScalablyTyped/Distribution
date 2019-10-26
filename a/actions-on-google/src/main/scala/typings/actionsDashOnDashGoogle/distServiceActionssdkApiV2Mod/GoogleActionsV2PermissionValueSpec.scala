package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2PermissionValueSpec extends js.Object {
  /**
    * The context why agent needs to request permission.
    */
  var optContext: js.UndefOr[String] = js.undefined
  /**
    * List of permissions requested by the agent.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2PermissionValueSpecPermissions]] = js.undefined
  /**
    * Additional information needed to fulfill update permission request.
    */
  var updatePermissionValueSpec: js.UndefOr[GoogleActionsV2UpdatePermissionValueSpec] = js.undefined
}

object GoogleActionsV2PermissionValueSpec {
  @scala.inline
  def apply(
    optContext: String = null,
    permissions: js.Array[GoogleActionsV2PermissionValueSpecPermissions] = null,
    updatePermissionValueSpec: GoogleActionsV2UpdatePermissionValueSpec = null
  ): GoogleActionsV2PermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    if (optContext != null) __obj.updateDynamic("optContext")(optContext)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (updatePermissionValueSpec != null) __obj.updateDynamic("updatePermissionValueSpec")(updatePermissionValueSpec)
    __obj.asInstanceOf[GoogleActionsV2PermissionValueSpec]
  }
}

