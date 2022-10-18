package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatastoreRequest extends StObject {
  
  /**
    * The name of the data store.
    */
  var datastoreName: DatastoreName
  
  /**
    *  Contains information about the partition dimensions in a data store. 
    */
  var datastorePartitions: js.UndefOr[DatastorePartitions] = js.undefined
  
  /**
    * Where data in a data store is stored.. You can choose serviceManagedS3 storage, customerManagedS3 storage, or iotSiteWiseMultiLayerStorage storage. The default is serviceManagedS3. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined
  
  /**
    * Contains the configuration information of file formats. IoT Analytics data stores support JSON and Parquet. The default file format is JSON. You can specify only one format. You can't change the file format after you create the data store.
    */
  var fileFormatConfiguration: js.UndefOr[FileFormatConfiguration] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * Metadata which can be used to manage the data store.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateDatastoreRequest {
  
  inline def apply(datastoreName: DatastoreName): CreateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatastoreRequest]
  }
  
  extension [Self <: CreateDatastoreRequest](x: Self) {
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastorePartitions(value: DatastorePartitions): Self = StObject.set(x, "datastorePartitions", value.asInstanceOf[js.Any])
    
    inline def setDatastorePartitionsUndefined: Self = StObject.set(x, "datastorePartitions", js.undefined)
    
    inline def setDatastoreStorage(value: DatastoreStorage): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    inline def setFileFormatConfiguration(value: FileFormatConfiguration): Self = StObject.set(x, "fileFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFileFormatConfigurationUndefined: Self = StObject.set(x, "fileFormatConfiguration", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
