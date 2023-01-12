package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreStorage extends StObject {
  
  /**
    * S3-customer-managed; When you choose customer-managed storage, the retentionPeriod parameter is ignored. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.undefined
  
  /**
    *  Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var iotSiteWiseMultiLayerStorage: js.UndefOr[DatastoreIotSiteWiseMultiLayerStorage] = js.undefined
  
  /**
    * Used to store data in an Amazon S3 bucket managed by IoT Analytics. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.undefined
}
object DatastoreStorage {
  
  inline def apply(): DatastoreStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastoreStorage] (val x: Self) extends AnyVal {
    
    inline def setCustomerManagedS3(value: CustomerManagedDatastoreS3Storage): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    inline def setIotSiteWiseMultiLayerStorage(value: DatastoreIotSiteWiseMultiLayerStorage): Self = StObject.set(x, "iotSiteWiseMultiLayerStorage", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseMultiLayerStorageUndefined: Self = StObject.set(x, "iotSiteWiseMultiLayerStorage", js.undefined)
    
    inline def setServiceManagedS3(value: ServiceManagedDatastoreS3Storage): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    inline def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
