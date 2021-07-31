package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSetting extends StObject {
  
  /**
    * The action that is enabled or disabled.
    */
  var Action: typings.awsSdk.appstreamMod.Action
  
  /**
    * Indicates whether the action is enabled or disabled.
    */
  var Permission: typings.awsSdk.appstreamMod.Permission
}
object UserSetting {
  
  @scala.inline
  def apply(Action: Action, Permission: Permission): UserSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSetting]
  }
  
  @scala.inline
  implicit class UserSettingMutableBuilder[Self <: UserSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
  }
}
