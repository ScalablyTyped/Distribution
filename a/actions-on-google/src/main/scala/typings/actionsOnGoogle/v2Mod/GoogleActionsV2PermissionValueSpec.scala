package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2PermissionValueSpec extends StObject {
  
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
  implicit class GoogleActionsV2PermissionValueSpecMutableBuilder[Self <: GoogleActionsV2PermissionValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptContext(value: String): Self = StObject.set(x, "optContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptContextUndefined: Self = StObject.set(x, "optContext", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[GoogleActionsV2PermissionValueSpecPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setUpdatePermissionValueSpec(value: GoogleActionsV2UpdatePermissionValueSpec): Self = StObject.set(x, "updatePermissionValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePermissionValueSpecUndefined: Self = StObject.set(x, "updatePermissionValueSpec", js.undefined)
  }
}
