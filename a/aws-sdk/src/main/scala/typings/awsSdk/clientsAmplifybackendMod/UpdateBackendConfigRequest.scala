package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendConfigRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * Describes the Amazon Cognito configuration for Admin UI access.
    */
  var LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj] = js.undefined
}
object UpdateBackendConfigRequest {
  
  inline def apply(AppId: string): UpdateBackendConfigRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackendConfigRequest]
  }
  
  extension [Self <: UpdateBackendConfigRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setLoginAuthConfig(value: LoginAuthConfigReqObj): Self = StObject.set(x, "LoginAuthConfig", value.asInstanceOf[js.Any])
    
    inline def setLoginAuthConfigUndefined: Self = StObject.set(x, "LoginAuthConfig", js.undefined)
  }
}
