package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendStorageResourceConfig extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var BucketName: js.UndefOr[string] = js.undefined
  
  /**
    * Returns True if the storage resource has been imported.
    */
  var Imported: boolean
  
  /**
    * The authorization configuration for the storage S3 bucket.
    */
  var Permissions: js.UndefOr[BackendStoragePermissions] = js.undefined
  
  /**
    * The name of the storage service.
    */
  var ServiceName: typings.awsSdk.clientsAmplifybackendMod.ServiceName
}
object GetBackendStorageResourceConfig {
  
  inline def apply(Imported: boolean, ServiceName: ServiceName): GetBackendStorageResourceConfig = {
    val __obj = js.Dynamic.literal(Imported = Imported.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendStorageResourceConfig]
  }
  
  extension [Self <: GetBackendStorageResourceConfig](x: Self) {
    
    inline def setBucketName(value: string): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setImported(value: boolean): Self = StObject.set(x, "Imported", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: BackendStoragePermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
