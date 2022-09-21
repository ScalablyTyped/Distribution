package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendConfigResponse extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[string] = js.undefined
  
  /**
    * The app ID for the backend manager.
    */
  var BackendManagerAppId: js.UndefOr[string] = js.undefined
  
  /**
    * If the request fails, this error is returned.
    */
  var Error: js.UndefOr[string] = js.undefined
  
  /**
    * Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
    */
  var LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj] = js.undefined
}
object UpdateBackendConfigResponse {
  
  inline def apply(): UpdateBackendConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendConfigResponse]
  }
  
  extension [Self <: UpdateBackendConfigResponse](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setBackendManagerAppId(value: string): Self = StObject.set(x, "BackendManagerAppId", value.asInstanceOf[js.Any])
    
    inline def setBackendManagerAppIdUndefined: Self = StObject.set(x, "BackendManagerAppId", js.undefined)
    
    inline def setError(value: string): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setLoginAuthConfig(value: LoginAuthConfigReqObj): Self = StObject.set(x, "LoginAuthConfig", value.asInstanceOf[js.Any])
    
    inline def setLoginAuthConfigUndefined: Self = StObject.set(x, "LoginAuthConfig", js.undefined)
  }
}
