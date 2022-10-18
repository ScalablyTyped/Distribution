package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreSummary extends StObject {
  
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.undefined
  
  /**
    *  Contains information about the partition dimensions in a data store. 
    */
  var datastorePartitions: js.UndefOr[DatastorePartitions] = js.undefined
  
  /**
    * Where data in a data store is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.undefined
  
  /**
    * The file format of the data in the data store.
    */
  var fileFormatType: js.UndefOr[FileFormatType] = js.undefined
  
  /**
    * The last time when a new message arrived in the data store. IoT Analytics updates this value at most once per minute for Amazon Simple Storage Service one data store. Hence, the lastMessageArrivalTime value is an approximation. This feature only applies to messages that arrived in the data store after October 23, 2020. 
    */
  var lastMessageArrivalTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.undefined
}
object DatastoreSummary {
  
  inline def apply(): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreSummary]
  }
  
  extension [Self <: DatastoreSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "datastoreName", js.undefined)
    
    inline def setDatastorePartitions(value: DatastorePartitions): Self = StObject.set(x, "datastorePartitions", value.asInstanceOf[js.Any])
    
    inline def setDatastorePartitionsUndefined: Self = StObject.set(x, "datastorePartitions", js.undefined)
    
    inline def setDatastoreStorage(value: DatastoreStorageSummary): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    inline def setFileFormatType(value: FileFormatType): Self = StObject.set(x, "fileFormatType", value.asInstanceOf[js.Any])
    
    inline def setFileFormatTypeUndefined: Self = StObject.set(x, "fileFormatType", js.undefined)
    
    inline def setLastMessageArrivalTime(value: js.Date): Self = StObject.set(x, "lastMessageArrivalTime", value.asInstanceOf[js.Any])
    
    inline def setLastMessageArrivalTimeUndefined: Self = StObject.set(x, "lastMessageArrivalTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStatus(value: DatastoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
