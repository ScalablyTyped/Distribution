package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatastoreRequest extends StObject {
  
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName
  
  /**
    * Where data in a data store is stored.. You can choose serviceManagedS3 storage, customerManagedS3 storage, or iotSiteWiseMultiLayerStorage storage. The default is serviceManagedS3. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined
  
  /**
    * Contains the configuration information of file formats. IoT Analytics data stores support JSON and Parquet. The default file format is JSON. You can specify only one format. You can't change the file format after you create the data store.
    */
  var fileFormatConfiguration: js.UndefOr[FileFormatConfiguration] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store. The retention period can't be updated if the data store's Amazon S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object UpdateDatastoreRequest {
  
  inline def apply(datastoreName: DatastoreName): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatastoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorage(value: DatastoreStorage): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    inline def setFileFormatConfiguration(value: FileFormatConfiguration): Self = StObject.set(x, "fileFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFileFormatConfigurationUndefined: Self = StObject.set(x, "fileFormatConfiguration", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
