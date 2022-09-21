package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the app.
    */
  var AppName: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The resource configuration for creating a backend.
    */
  var ResourceConfig: js.UndefOr[typings.awsSdk.amplifybackendMod.ResourceConfig] = js.undefined
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[string] = js.undefined
}
object CreateBackendRequest {
  
  inline def apply(AppId: string, AppName: string, BackendEnvironmentName: string): CreateBackendRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], AppName = AppName.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendRequest]
  }
  
  extension [Self <: CreateBackendRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppName(value: string): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
