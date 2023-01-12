package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionGroupsByUserResponse extends StObject {
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of returned permission groups.
    */
  var permissionGroups: js.UndefOr[PermissionGroupByUserList] = js.undefined
}
object ListPermissionGroupsByUserResponse {
  
  inline def apply(): ListPermissionGroupsByUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionGroupsByUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPermissionGroupsByUserResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissionGroups(value: PermissionGroupByUserList): Self = StObject.set(x, "permissionGroups", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupsUndefined: Self = StObject.set(x, "permissionGroups", js.undefined)
    
    inline def setPermissionGroupsVarargs(value: PermissionGroupByUser*): Self = StObject.set(x, "permissionGroups", js.Array(value*))
  }
}
