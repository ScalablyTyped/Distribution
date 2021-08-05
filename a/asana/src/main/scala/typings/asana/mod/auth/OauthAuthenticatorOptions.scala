package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthenticatorOptions extends StObject {
  
  var credentials: js.UndefOr[Credentials | String] = js.undefined
  
  var flowType: js.UndefOr[FlowType] = js.undefined
}
object OauthAuthenticatorOptions {
  
  inline def apply(): OauthAuthenticatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthAuthenticatorOptions]
  }
  
  extension [Self <: OauthAuthenticatorOptions](x: Self) {
    
    inline def setCredentials(value: Credentials | String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setFlowType(value: FlowType): Self = StObject.set(x, "flowType", value.asInstanceOf[js.Any])
    
    inline def setFlowTypeUndefined: Self = StObject.set(x, "flowType", js.undefined)
  }
}
