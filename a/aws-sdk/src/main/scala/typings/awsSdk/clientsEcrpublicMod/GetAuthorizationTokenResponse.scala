package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenResponse extends StObject {
  
  /**
    * An authorization token data object that corresponds to a public registry.
    */
  var authorizationData: js.UndefOr[AuthorizationData] = js.undefined
}
object GetAuthorizationTokenResponse {
  
  inline def apply(): GetAuthorizationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAuthorizationTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationData(value: AuthorizationData): Self = StObject.set(x, "authorizationData", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationDataUndefined: Self = StObject.set(x, "authorizationData", js.undefined)
  }
}
