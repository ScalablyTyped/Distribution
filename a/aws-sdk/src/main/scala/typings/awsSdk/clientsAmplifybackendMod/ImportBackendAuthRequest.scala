package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportBackendAuthRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The ID of the Amazon Cognito identity pool.
    */
  var IdentityPoolId: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Amazon Cognito native client.
    */
  var NativeClientId: string
  
  /**
    * The ID of the Amazon Cognito user pool.
    */
  var UserPoolId: string
  
  /**
    * The ID of the Amazon Cognito web client.
    */
  var WebClientId: string
}
object ImportBackendAuthRequest {
  
  inline def apply(
    AppId: string,
    BackendEnvironmentName: string,
    NativeClientId: string,
    UserPoolId: string,
    WebClientId: string
  ): ImportBackendAuthRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], NativeClientId = NativeClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], WebClientId = WebClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportBackendAuthRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportBackendAuthRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: string): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setNativeClientId(value: string): Self = StObject.set(x, "NativeClientId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: string): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setWebClientId(value: string): Self = StObject.set(x, "WebClientId", value.asInstanceOf[js.Any])
  }
}
