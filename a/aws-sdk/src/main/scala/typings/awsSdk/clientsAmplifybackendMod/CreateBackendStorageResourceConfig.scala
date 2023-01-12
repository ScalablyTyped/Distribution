package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendStorageResourceConfig extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var BucketName: js.UndefOr[string] = js.undefined
  
  /**
    * The authorization configuration for the storage S3 bucket.
    */
  var Permissions: BackendStoragePermissions
  
  /**
    * The name of the storage service.
    */
  var ServiceName: typings.awsSdk.clientsAmplifybackendMod.ServiceName
}
object CreateBackendStorageResourceConfig {
  
  inline def apply(Permissions: BackendStoragePermissions, ServiceName: ServiceName): CreateBackendStorageResourceConfig = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendStorageResourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackendStorageResourceConfig] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: string): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setPermissions(value: BackendStoragePermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
