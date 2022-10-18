package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackendStorageRequest extends StObject {
  
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
  
  /**
    * The name of the storage service.
    */
  var ServiceName: typings.awsSdk.clientsAmplifybackendMod.ServiceName
}
object DeleteBackendStorageRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string, ResourceName: string, ServiceName: ServiceName): DeleteBackendStorageRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], ResourceName = ResourceName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendStorageRequest]
  }
  
  extension [Self <: DeleteBackendStorageRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
