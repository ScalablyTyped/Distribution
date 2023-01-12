package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenResponse extends StObject {
  
  /**
    * A list of authorization token data objects that correspond to the registryIds values in the request.
    */
  var authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
}
object GetAuthorizationTokenResponse {
  
  inline def apply(): GetAuthorizationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAuthorizationTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationData(value: AuthorizationDataList): Self = StObject.set(x, "authorizationData", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationDataUndefined: Self = StObject.set(x, "authorizationData", js.undefined)
    
    inline def setAuthorizationDataVarargs(value: AuthorizationData*): Self = StObject.set(x, "authorizationData", js.Array(value*))
  }
}
