package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumePermission extends StObject {
  
  /**
    * The group to be added or removed. The possible value is all.
    */
  var Group: js.UndefOr[PermissionGroup] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account to be added or removed.
    */
  var UserId: js.UndefOr[String] = js.undefined
}
object CreateVolumePermission {
  
  inline def apply(): CreateVolumePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermission]
  }
  
  extension [Self <: CreateVolumePermission](x: Self) {
    
    inline def setGroup(value: PermissionGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
