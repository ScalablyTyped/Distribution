package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackendEnvironmentRequest extends StObject {
  
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  The name for the backend environment. 
    */
  var environmentName: EnvironmentName = js.native
}
object GetBackendEnvironmentRequest {
  
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): GetBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendEnvironmentRequest]
  }
  
  @scala.inline
  implicit class GetBackendEnvironmentRequestMutableBuilder[Self <: GetBackendEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
