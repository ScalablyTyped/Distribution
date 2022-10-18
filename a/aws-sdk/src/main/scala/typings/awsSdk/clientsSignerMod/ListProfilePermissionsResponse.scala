package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilePermissionsResponse extends StObject {
  
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of permissions associated with the Signing Profile.
    */
  var permissions: js.UndefOr[Permissions] = js.undefined
  
  /**
    * Total size of the policy associated with the Signing Profile in bytes.
    */
  var policySizeBytes: js.UndefOr[PolicySizeBytes] = js.undefined
  
  /**
    * The identifier for the current revision of profile permissions.
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object ListProfilePermissionsResponse {
  
  inline def apply(): ListProfilePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfilePermissionsResponse]
  }
  
  extension [Self <: ListProfilePermissionsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissions(value: Permissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setPolicySizeBytes(value: PolicySizeBytes): Self = StObject.set(x, "policySizeBytes", value.asInstanceOf[js.Any])
    
    inline def setPolicySizeBytesUndefined: Self = StObject.set(x, "policySizeBytes", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
