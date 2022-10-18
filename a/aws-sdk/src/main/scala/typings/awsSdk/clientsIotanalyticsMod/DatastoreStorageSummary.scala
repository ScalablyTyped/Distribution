package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreStorageSummary extends StObject {
  
  /**
    * Used to store data in an Amazon S3 bucket managed by IoT Analytics.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary] = js.undefined
  
  /**
    *  Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage. 
    */
  var iotSiteWiseMultiLayerStorage: js.UndefOr[DatastoreIotSiteWiseMultiLayerStorageSummary] = js.undefined
  
  /**
    * Used to store data in an Amazon S3 bucket managed by IoT Analytics.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary] = js.undefined
}
object DatastoreStorageSummary {
  
  inline def apply(): DatastoreStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorageSummary]
  }
  
  extension [Self <: DatastoreStorageSummary](x: Self) {
    
    inline def setCustomerManagedS3(value: CustomerManagedDatastoreS3StorageSummary): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    inline def setIotSiteWiseMultiLayerStorage(value: DatastoreIotSiteWiseMultiLayerStorageSummary): Self = StObject.set(x, "iotSiteWiseMultiLayerStorage", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseMultiLayerStorageUndefined: Self = StObject.set(x, "iotSiteWiseMultiLayerStorage", js.undefined)
    
    inline def setServiceManagedS3(value: ServiceManagedDatastoreS3StorageSummary): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    inline def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
