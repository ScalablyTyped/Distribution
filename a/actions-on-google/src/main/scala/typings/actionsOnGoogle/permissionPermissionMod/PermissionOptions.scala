package typings.actionsOnGoogle.permissionPermissionMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpecPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionOptions extends js.Object {
  
  /**
    * Context why the permission is being asked.
    * It's the TTS prompt prefix (action phrase) we ask the user.
    * @public
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * Extra properties to be spread into the value.
    * For advanced usages like used in {@link UpdatePermission}
    * @public
    */
  var extra: js.UndefOr[GoogleActionsV2PermissionValueSpec] = js.native
  
  /**
    * Array or string of permissions App supports,
    * each of which comes from {@link GoogleActionsV2PermissionValueSpecPermissions}.
    * @public
    */
  var permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions] = js.native
}
object PermissionOptions {
  
  @scala.inline
  def apply(
    permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
  ): PermissionOptions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOptions]
  }
  
  @scala.inline
  implicit class PermissionOptionsOps[Self <: PermissionOptions] (val x: Self) extends AnyVal {
    
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
    def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(
      value: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
    ): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setExtra(value: GoogleActionsV2PermissionValueSpec): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
  }
}
