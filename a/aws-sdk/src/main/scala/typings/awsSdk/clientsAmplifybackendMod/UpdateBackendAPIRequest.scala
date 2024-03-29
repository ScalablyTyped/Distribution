package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAPIRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * Defines the resource configuration for the data model in your Amplify project.
    */
  var ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined
  
  /**
    * The name of this resource.
    */
  var ResourceName: string
}
object UpdateBackendAPIRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string, ResourceName: string): UpdateBackendAPIRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], ResourceName = ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackendAPIRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBackendAPIRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setResourceConfig(value: BackendAPIResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
  }
}
