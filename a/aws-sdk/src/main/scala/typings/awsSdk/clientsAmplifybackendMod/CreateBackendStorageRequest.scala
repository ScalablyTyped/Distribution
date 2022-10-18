package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendStorageRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The resource configuration for creating backend storage.
    */
  var ResourceConfig: CreateBackendStorageResourceConfig
  
  /**
    * The name of the storage resource.
    */
  var ResourceName: string
}
object CreateBackendStorageRequest {
  
  inline def apply(
    AppId: string,
    BackendEnvironmentName: string,
    ResourceConfig: CreateBackendStorageResourceConfig,
    ResourceName: string
  ): CreateBackendStorageRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], ResourceName = ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendStorageRequest]
  }
  
  extension [Self <: CreateBackendStorageRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setResourceConfig(value: CreateBackendStorageResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
  }
}
