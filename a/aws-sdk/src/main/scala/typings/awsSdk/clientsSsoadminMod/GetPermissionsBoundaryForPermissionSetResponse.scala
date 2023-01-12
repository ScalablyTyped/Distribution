package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionsBoundaryForPermissionSetResponse extends StObject {
  
  /**
    * The permissions boundary attached to the specified permission set.
    */
  var PermissionsBoundary: js.UndefOr[typings.awsSdk.clientsSsoadminMod.PermissionsBoundary] = js.undefined
}
object GetPermissionsBoundaryForPermissionSetResponse {
  
  inline def apply(): GetPermissionsBoundaryForPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionsBoundaryForPermissionSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPermissionsBoundaryForPermissionSetResponse] (val x: Self) extends AnyVal {
    
    inline def setPermissionsBoundary(value: PermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
  }
}
