package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackendEnvironmentRequest extends StObject {
  
  /**
    *  The unique ID of an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name of a backend environment of an Amplify app. 
    */
  var environmentName: EnvironmentName
}
object DeleteBackendEnvironmentRequest {
  
  inline def apply(appId: AppId, environmentName: EnvironmentName): DeleteBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendEnvironmentRequest]
  }
  
  extension [Self <: DeleteBackendEnvironmentRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
