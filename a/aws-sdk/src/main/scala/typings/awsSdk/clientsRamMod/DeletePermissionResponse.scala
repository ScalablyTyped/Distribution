package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionResponse extends StObject {
  
  /**
    * The idempotency identifier associated with this request. If you want to repeat the same operation in an idempotent manner then you must include this value in the clientToken request parameter of that later call. All other parameters must also have the same values that you used in the first call.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * This operation is performed asynchronously, and this response parameter indicates the current status.
    */
  var permissionStatus: js.UndefOr[PermissionStatus] = js.undefined
  
  /**
    * A boolean that indicates whether the delete operations succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}
object DeletePermissionResponse {
  
  inline def apply(): DeletePermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPermissionStatus(value: PermissionStatus): Self = StObject.set(x, "permissionStatus", value.asInstanceOf[js.Any])
    
    inline def setPermissionStatusUndefined: Self = StObject.set(x, "permissionStatus", js.undefined)
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
