package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PermissionValueSpec extends js.Object {
  /**
    * The context why agent needs to request permission.
    */
  var optContext: js.UndefOr[String] = js.native
  /**
    * List of permissions requested by the agent.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2PermissionValueSpecPermissions]] = js.native
  /**
    * Additional information needed to fulfill update permission request.
    */
  var updatePermissionValueSpec: js.UndefOr[GoogleActionsV2UpdatePermissionValueSpec] = js.native
}

object GoogleActionsV2PermissionValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2PermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PermissionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2PermissionValueSpecOps[Self <: GoogleActionsV2PermissionValueSpec] (val x: Self) extends AnyVal {
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
    def setOptContext(value: String): Self = this.set("optContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptContext: Self = this.set("optContext", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[GoogleActionsV2PermissionValueSpecPermissions]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setUpdatePermissionValueSpec(value: GoogleActionsV2UpdatePermissionValueSpec): Self = this.set("updatePermissionValueSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePermissionValueSpec: Self = this.set("updatePermissionValueSpec", js.undefined)
  }
  
}

