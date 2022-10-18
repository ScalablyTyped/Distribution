package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncItem extends StObject {
  
  /**
    * The status reported by the last sync.
    */
  var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined
  
  /**
    * The last time the sync operations returned a status of SUCCESSFUL (UTC).
    */
  var LastSuccessfulSyncTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status message details reported by the last sync.
    */
  var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined
  
  /**
    * The last time the configuration attempted to sync (UTC).
    */
  var LastSyncTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configuration information for the target S3 bucket.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined
  
  /**
    * The date and time the configuration was created (UTC).
    */
  var SyncCreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time the resource data sync was changed. 
    */
  var SyncLastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the resource data sync.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
  
  /**
    * Information about the source where the data was synchronized. 
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSourceWithState] = js.undefined
  
  /**
    * The type of resource data sync. If SyncType is SyncToDestination, then the resource data sync synchronizes data to an S3 bucket. If the SyncType is SyncFromSource then the resource data sync synchronizes data from Organizations or from multiple Amazon Web Services Regions.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
}
object ResourceDataSyncItem {
  
  inline def apply(): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
  
  extension [Self <: ResourceDataSyncItem](x: Self) {
    
    inline def setLastStatus(value: LastResourceDataSyncStatus): Self = StObject.set(x, "LastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "LastStatus", js.undefined)
    
    inline def setLastSuccessfulSyncTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulSyncTimeUndefined: Self = StObject.set(x, "LastSuccessfulSyncTime", js.undefined)
    
    inline def setLastSyncStatusMessage(value: LastResourceDataSyncMessage): Self = StObject.set(x, "LastSyncStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setLastSyncStatusMessageUndefined: Self = StObject.set(x, "LastSyncStatusMessage", js.undefined)
    
    inline def setLastSyncTime(value: js.Date): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "LastSyncTime", js.undefined)
    
    inline def setS3Destination(value: ResourceDataSyncS3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "S3Destination", js.undefined)
    
    inline def setSyncCreatedTime(value: js.Date): Self = StObject.set(x, "SyncCreatedTime", value.asInstanceOf[js.Any])
    
    inline def setSyncCreatedTimeUndefined: Self = StObject.set(x, "SyncCreatedTime", js.undefined)
    
    inline def setSyncLastModifiedTime(value: js.Date): Self = StObject.set(x, "SyncLastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setSyncLastModifiedTimeUndefined: Self = StObject.set(x, "SyncLastModifiedTime", js.undefined)
    
    inline def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    inline def setSyncNameUndefined: Self = StObject.set(x, "SyncName", js.undefined)
    
    inline def setSyncSource(value: ResourceDataSyncSourceWithState): Self = StObject.set(x, "SyncSource", value.asInstanceOf[js.Any])
    
    inline def setSyncSourceUndefined: Self = StObject.set(x, "SyncSource", js.undefined)
    
    inline def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
    
    inline def setSyncTypeUndefined: Self = StObject.set(x, "SyncType", js.undefined)
  }
}
