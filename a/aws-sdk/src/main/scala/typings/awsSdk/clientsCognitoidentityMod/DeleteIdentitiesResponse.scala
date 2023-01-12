package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentitiesResponse extends StObject {
  
  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
}
object DeleteIdentitiesResponse {
  
  inline def apply(): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIdentitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setUnprocessedIdentityIds(value: UnprocessedIdentityIdList): Self = StObject.set(x, "UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedIdentityIdsUndefined: Self = StObject.set(x, "UnprocessedIdentityIds", js.undefined)
    
    inline def setUnprocessedIdentityIdsVarargs(value: UnprocessedIdentityId*): Self = StObject.set(x, "UnprocessedIdentityIds", js.Array(value*))
  }
}
