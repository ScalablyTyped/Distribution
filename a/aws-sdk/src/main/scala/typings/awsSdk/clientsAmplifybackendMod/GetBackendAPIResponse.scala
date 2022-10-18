package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendAPIResponse extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: js.UndefOr[string] = js.undefined
  
  /**
    * If the request fails, this error is returned.
    */
  var Error: js.UndefOr[string] = js.undefined
  
  /**
    * The resource configuration for this response object.
    */
  var ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined
  
  /**
    * The name of this resource.
    */
  var ResourceName: js.UndefOr[string] = js.undefined
}
object GetBackendAPIResponse {
  
  inline def apply(): GetBackendAPIResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackendAPIResponse]
  }
  
  extension [Self <: GetBackendAPIResponse](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentNameUndefined: Self = StObject.set(x, "BackendEnvironmentName", js.undefined)
    
    inline def setError(value: string): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setResourceConfig(value: BackendAPIResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
