package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGroupResolutionConfiguration extends StObject {
  
  /**
    * The identity store provider (mode) you want to use to get users and groups. IAM Identity Center (successor to Single Sign-On) is currently the only available mode. Your users and groups must exist in an IAM Identity Center identity source in order to use this mode.
    */
  var UserGroupResolutionMode: typings.awsSdk.clientsKendraMod.UserGroupResolutionMode
}
object UserGroupResolutionConfiguration {
  
  inline def apply(UserGroupResolutionMode: UserGroupResolutionMode): UserGroupResolutionConfiguration = {
    val __obj = js.Dynamic.literal(UserGroupResolutionMode = UserGroupResolutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupResolutionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserGroupResolutionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setUserGroupResolutionMode(value: UserGroupResolutionMode): Self = StObject.set(x, "UserGroupResolutionMode", value.asInstanceOf[js.Any])
  }
}
