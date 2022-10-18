package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsResponse extends StObject {
  
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.NextToken] = js.undefined
  
  /**
    * Summary information about each permission assigned by the specified private CA, including the action enabled, the policy provided, and the time of creation.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
}
object ListPermissionsResponse {
  
  inline def apply(): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionsResponse]
  }
  
  extension [Self <: ListPermissionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
