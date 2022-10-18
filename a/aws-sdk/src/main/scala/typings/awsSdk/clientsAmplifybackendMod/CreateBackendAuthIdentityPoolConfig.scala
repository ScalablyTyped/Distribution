package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthIdentityPoolConfig extends StObject {
  
  /**
    * Name of the Amazon Cognito identity pool used for authorization.
    */
  var IdentityPoolName: string
  
  /**
    * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
    */
  var UnauthenticatedLogin: boolean
}
object CreateBackendAuthIdentityPoolConfig {
  
  inline def apply(IdentityPoolName: string, UnauthenticatedLogin: boolean): CreateBackendAuthIdentityPoolConfig = {
    val __obj = js.Dynamic.literal(IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any], UnauthenticatedLogin = UnauthenticatedLogin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthIdentityPoolConfig]
  }
  
  extension [Self <: CreateBackendAuthIdentityPoolConfig](x: Self) {
    
    inline def setIdentityPoolName(value: string): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticatedLogin(value: boolean): Self = StObject.set(x, "UnauthenticatedLogin", value.asInstanceOf[js.Any])
  }
}
