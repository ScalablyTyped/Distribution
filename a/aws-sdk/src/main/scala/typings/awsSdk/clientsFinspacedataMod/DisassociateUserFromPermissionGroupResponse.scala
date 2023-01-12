package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateUserFromPermissionGroupResponse extends StObject {
  
  /**
    * The returned status code of the response.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}
object DisassociateUserFromPermissionGroupResponse {
  
  inline def apply(): DisassociateUserFromPermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateUserFromPermissionGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateUserFromPermissionGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
