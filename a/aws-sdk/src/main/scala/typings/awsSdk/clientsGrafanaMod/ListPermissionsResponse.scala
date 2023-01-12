package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsResponse extends StObject {
  
  /**
    * The token to use in a subsequent ListPermissions operation to return the next set of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The permissions returned by the operation.
    */
  var permissions: PermissionEntryList
}
object ListPermissionsResponse {
  
  inline def apply(permissions: PermissionEntryList): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPermissionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissions(value: PermissionEntryList): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: PermissionEntry*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
