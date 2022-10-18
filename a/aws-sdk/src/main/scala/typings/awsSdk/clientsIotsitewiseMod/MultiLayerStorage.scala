package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiLayerStorage extends StObject {
  
  /**
    * Contains information about a customer managed Amazon S3 bucket.
    */
  var customerManagedS3Storage: CustomerManagedS3Storage
}
object MultiLayerStorage {
  
  inline def apply(customerManagedS3Storage: CustomerManagedS3Storage): MultiLayerStorage = {
    val __obj = js.Dynamic.literal(customerManagedS3Storage = customerManagedS3Storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLayerStorage]
  }
  
  extension [Self <: MultiLayerStorage](x: Self) {
    
    inline def setCustomerManagedS3Storage(value: CustomerManagedS3Storage): Self = StObject.set(x, "customerManagedS3Storage", value.asInstanceOf[js.Any])
  }
}
