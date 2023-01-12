package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionSetResponse extends StObject {
  
  /**
    * Defines the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typings.awsSdk.clientsSsoadminMod.PermissionSet] = js.undefined
}
object CreatePermissionSetResponse {
  
  inline def apply(): CreatePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePermissionSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePermissionSetResponse] (val x: Self) extends AnyVal {
    
    inline def setPermissionSet(value: PermissionSet): Self = StObject.set(x, "PermissionSet", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetUndefined: Self = StObject.set(x, "PermissionSet", js.undefined)
  }
}
