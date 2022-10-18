package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendStorageResourceConfig extends StObject {
  
  /**
    * The authorization configuration for the storage S3 bucket.
    */
  var Permissions: BackendStoragePermissions
  
  /**
    * The name of the storage service.
    */
  var ServiceName: typings.awsSdk.clientsAmplifybackendMod.ServiceName
}
object UpdateBackendStorageResourceConfig {
  
  inline def apply(Permissions: BackendStoragePermissions, ServiceName: ServiceName): UpdateBackendStorageResourceConfig = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackendStorageResourceConfig]
  }
  
  extension [Self <: UpdateBackendStorageResourceConfig](x: Self) {
    
    inline def setPermissions(value: BackendStoragePermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
