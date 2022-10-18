package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSetting extends StObject {
  
  /**
    * The action that is enabled or disabled.
    */
  var Action: typings.awsSdk.clientsAppstreamMod.Action
  
  /**
    * Indicates whether the action is enabled or disabled.
    */
  var Permission: typings.awsSdk.clientsAppstreamMod.Permission
}
object UserSetting {
  
  inline def apply(Action: Action, Permission: Permission): UserSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSetting]
  }
  
  extension [Self <: UserSetting](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
  }
}
