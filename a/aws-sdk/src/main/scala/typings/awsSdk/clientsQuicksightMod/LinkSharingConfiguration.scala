package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkSharingConfiguration extends StObject {
  
  /**
    * A structure that contains the permissions of a shareable link.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
}
object LinkSharingConfiguration {
  
  inline def apply(): LinkSharingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSharingConfiguration]
  }
  
  extension [Self <: LinkSharingConfiguration](x: Self) {
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
