package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendStorageRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The name of the storage resource.
    */
  var ResourceName: string
}
object GetBackendStorageRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string, ResourceName: string): GetBackendStorageRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], ResourceName = ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendStorageRequest]
  }
  
  extension [Self <: GetBackendStorageRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
  }
}
