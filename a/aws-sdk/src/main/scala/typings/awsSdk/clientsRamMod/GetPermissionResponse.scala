package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionResponse extends StObject {
  
  /**
    * An object that contains information about the permission.
    */
  var permission: js.UndefOr[ResourceSharePermissionDetail] = js.undefined
}
object GetPermissionResponse {
  
  inline def apply(): GetPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: ResourceSharePermissionDetail): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
