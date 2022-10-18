package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datastore extends StObject {
  
  /**
    * The ARN of the data store.
    */
  var arn: js.UndefOr[DatastoreArn] = js.undefined
  
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Contains information about the partition dimensions in a data store. 
    */
  var datastorePartitions: js.UndefOr[DatastorePartitions] = js.undefined
  
  /**
    * Contains the configuration information of file formats. IoT Analytics data stores support JSON and Parquet. The default file format is JSON. You can specify only one format. You can't change the file format after you create the data store.
    */
  var fileFormatConfiguration: js.UndefOr[FileFormatConfiguration] = js.undefined
  
  /**
    * The last time when a new message arrived in the data store. IoT Analytics updates this value at most once per minute for Amazon Simple Storage Service one data store. Hence, the lastMessageArrivalTime value is an approximation. This feature only applies to messages that arrived in the data store after October 23, 2020. 
    */
  var lastMessageArrivalTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the data store.
    */
  var name: js.UndefOr[DatastoreName] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * The status of a data store:  CREATING  The data store is being created.  ACTIVE  The data store has been created and can be used.  DELETING  The data store is being deleted.  
    */
  var status: js.UndefOr[DatastoreStatus] = js.undefined
  
  /**
    * Where data in a data store is stored.. You can choose serviceManagedS3 storage, customerManagedS3 storage, or iotSiteWiseMultiLayerStorage storage. The default is serviceManagedS3. You can't change the choice of Amazon S3 storage after your data store is created. 
    */
  var storage: js.UndefOr[DatastoreStorage] = js.undefined
}
object Datastore {
  
  inline def apply(): Datastore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datastore]
  }
  
  extension [Self <: Datastore](x: Self) {
    
    inline def setArn(value: DatastoreArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatastorePartitions(value: DatastorePartitions): Self = StObject.set(x, "datastorePartitions", value.asInstanceOf[js.Any])
    
    inline def setDatastorePartitionsUndefined: Self = StObject.set(x, "datastorePartitions", js.undefined)
    
    inline def setFileFormatConfiguration(value: FileFormatConfiguration): Self = StObject.set(x, "fileFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFileFormatConfigurationUndefined: Self = StObject.set(x, "fileFormatConfiguration", js.undefined)
    
    inline def setLastMessageArrivalTime(value: js.Date): Self = StObject.set(x, "lastMessageArrivalTime", value.asInstanceOf[js.Any])
    
    inline def setLastMessageArrivalTimeUndefined: Self = StObject.set(x, "lastMessageArrivalTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: DatastoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setStatus(value: DatastoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorage(value: DatastoreStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
