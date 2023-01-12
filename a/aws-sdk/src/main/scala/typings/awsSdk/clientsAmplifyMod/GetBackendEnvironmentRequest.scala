package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendEnvironmentRequest extends StObject {
  
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name for the backend environment. 
    */
  var environmentName: EnvironmentName
}
object GetBackendEnvironmentRequest {
  
  inline def apply(appId: AppId, environmentName: EnvironmentName): GetBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBackendEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
