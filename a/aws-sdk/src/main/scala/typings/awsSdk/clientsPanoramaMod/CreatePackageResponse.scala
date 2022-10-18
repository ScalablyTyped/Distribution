package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageResponse extends StObject {
  
  /**
    * The package's ARN.
    */
  var Arn: js.UndefOr[NodePackageArn] = js.undefined
  
  /**
    * The package's ID.
    */
  var PackageId: js.UndefOr[NodePackageId] = js.undefined
  
  /**
    * The package's storage location.
    */
  var StorageLocation: typings.awsSdk.clientsPanoramaMod.StorageLocation
}
object CreatePackageResponse {
  
  inline def apply(StorageLocation: StorageLocation): CreatePackageResponse = {
    val __obj = js.Dynamic.literal(StorageLocation = StorageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageResponse]
  }
  
  extension [Self <: CreatePackageResponse](x: Self) {
    
    inline def setArn(value: NodePackageArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "PackageId", js.undefined)
    
    inline def setStorageLocation(value: StorageLocation): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
  }
}
