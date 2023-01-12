package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RStudioServerProAppSettings extends StObject {
  
  /**
    * Indicates whether the current user has access to the RStudioServerPro app.
    */
  var AccessStatus: js.UndefOr[RStudioServerProAccessStatus] = js.undefined
  
  /**
    * The level of permissions that the user has within the RStudioServerPro app. This value defaults to `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
    */
  var UserGroup: js.UndefOr[RStudioServerProUserGroup] = js.undefined
}
object RStudioServerProAppSettings {
  
  inline def apply(): RStudioServerProAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RStudioServerProAppSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RStudioServerProAppSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessStatus(value: RStudioServerProAccessStatus): Self = StObject.set(x, "AccessStatus", value.asInstanceOf[js.Any])
    
    inline def setAccessStatusUndefined: Self = StObject.set(x, "AccessStatus", js.undefined)
    
    inline def setUserGroup(value: RStudioServerProUserGroup): Self = StObject.set(x, "UserGroup", value.asInstanceOf[js.Any])
    
    inline def setUserGroupUndefined: Self = StObject.set(x, "UserGroup", js.undefined)
  }
}
