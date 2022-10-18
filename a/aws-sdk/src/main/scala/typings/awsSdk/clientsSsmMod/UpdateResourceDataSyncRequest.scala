package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceDataSyncRequest extends StObject {
  
  /**
    * The name of the resource data sync you want to update.
    */
  var SyncName: ResourceDataSyncName
  
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: ResourceDataSyncSource
  
  /**
    * The type of resource data sync. The supported SyncType is SyncFromSource.
    */
  var SyncType: ResourceDataSyncType
}
object UpdateResourceDataSyncRequest {
  
  inline def apply(SyncName: ResourceDataSyncName, SyncSource: ResourceDataSyncSource, SyncType: ResourceDataSyncType): UpdateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any], SyncSource = SyncSource.asInstanceOf[js.Any], SyncType = SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDataSyncRequest]
  }
  
  extension [Self <: UpdateResourceDataSyncRequest](x: Self) {
    
    inline def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    inline def setSyncSource(value: ResourceDataSyncSource): Self = StObject.set(x, "SyncSource", value.asInstanceOf[js.Any])
    
    inline def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
  }
}
