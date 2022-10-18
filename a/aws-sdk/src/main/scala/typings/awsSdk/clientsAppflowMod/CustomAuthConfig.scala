package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAuthConfig extends StObject {
  
  /**
    * Information about authentication parameters required for authentication.
    */
  var authParameters: js.UndefOr[AuthParameterList] = js.undefined
  
  /**
    * The authentication type that the custom connector uses.
    */
  var customAuthenticationType: js.UndefOr[CustomAuthenticationType] = js.undefined
}
object CustomAuthConfig {
  
  inline def apply(): CustomAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAuthConfig]
  }
  
  extension [Self <: CustomAuthConfig](x: Self) {
    
    inline def setAuthParameters(value: AuthParameterList): Self = StObject.set(x, "authParameters", value.asInstanceOf[js.Any])
    
    inline def setAuthParametersUndefined: Self = StObject.set(x, "authParameters", js.undefined)
    
    inline def setAuthParametersVarargs(value: AuthParameter*): Self = StObject.set(x, "authParameters", js.Array(value*))
    
    inline def setCustomAuthenticationType(value: CustomAuthenticationType): Self = StObject.set(x, "customAuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setCustomAuthenticationTypeUndefined: Self = StObject.set(x, "customAuthenticationType", js.undefined)
  }
}
