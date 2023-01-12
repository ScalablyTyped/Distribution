package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsData extends StObject {
  
  var permissions: js.Array[PermissionData]
}
object PermissionsData {
  
  inline def apply(permissions: js.Array[PermissionData]): PermissionsData = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionsData] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: js.Array[PermissionData]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: PermissionData*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
