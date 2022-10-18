package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2PermissionValueSpec extends StObject {
  
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
  
  inline def apply(): GoogleActionsV2PermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PermissionValueSpec]
  }
  
  extension [Self <: GoogleActionsV2PermissionValueSpec](x: Self) {
    
    inline def setOptContext(value: String): Self = StObject.set(x, "optContext", value.asInstanceOf[js.Any])
    
    inline def setOptContextUndefined: Self = StObject.set(x, "optContext", js.undefined)
    
    inline def setPermissions(value: js.Array[GoogleActionsV2PermissionValueSpecPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setUpdatePermissionValueSpec(value: GoogleActionsV2UpdatePermissionValueSpec): Self = StObject.set(x, "updatePermissionValueSpec", value.asInstanceOf[js.Any])
    
    inline def setUpdatePermissionValueSpecUndefined: Self = StObject.set(x, "updatePermissionValueSpec", js.undefined)
  }
}
