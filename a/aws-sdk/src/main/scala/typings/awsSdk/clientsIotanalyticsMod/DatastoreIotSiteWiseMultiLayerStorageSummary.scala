package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreIotSiteWiseMultiLayerStorageSummary extends StObject {
  
  /**
    * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
    */
  var customerManagedS3Storage: js.UndefOr[IotSiteWiseCustomerManagedDatastoreS3StorageSummary] = js.undefined
}
object DatastoreIotSiteWiseMultiLayerStorageSummary {
  
  inline def apply(): DatastoreIotSiteWiseMultiLayerStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreIotSiteWiseMultiLayerStorageSummary]
  }
  
  extension [Self <: DatastoreIotSiteWiseMultiLayerStorageSummary](x: Self) {
    
    inline def setCustomerManagedS3Storage(value: IotSiteWiseCustomerManagedDatastoreS3StorageSummary): Self = StObject.set(x, "customerManagedS3Storage", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedS3StorageUndefined: Self = StObject.set(x, "customerManagedS3Storage", js.undefined)
  }
}
