package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthIdentityPoolConfig extends StObject {
  
  /**
    * A boolean value that can be set to allow or disallow guest-level authorization into your Amplify app.
    */
  var UnauthenticatedLogin: js.UndefOr[boolean] = js.undefined
}
object UpdateBackendAuthIdentityPoolConfig {
  
  inline def apply(): UpdateBackendAuthIdentityPoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthIdentityPoolConfig]
  }
  
  extension [Self <: UpdateBackendAuthIdentityPoolConfig](x: Self) {
    
    inline def setUnauthenticatedLogin(value: boolean): Self = StObject.set(x, "UnauthenticatedLogin", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticatedLoginUndefined: Self = StObject.set(x, "UnauthenticatedLogin", js.undefined)
  }
}
