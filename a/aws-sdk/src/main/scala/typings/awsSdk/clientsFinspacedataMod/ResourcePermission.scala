package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePermission extends StObject {
  
  /**
    * Permission for a resource.
    */
  var permission: js.UndefOr[StringValueLength1to250] = js.undefined
}
object ResourcePermission {
  
  inline def apply(): ResourcePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePermission] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: StringValueLength1to250): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
