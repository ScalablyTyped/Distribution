package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutGeofenceRequest extends StObject {
  
  /**
    * The geofence collection storing the geofences.
    */
  var CollectionName: ResourceName
  
  /**
    * The batch of geofences to be stored in a geofence collection.
    */
  var Entries: BatchPutGeofenceRequestEntriesList
}
object BatchPutGeofenceRequest {
  
  inline def apply(CollectionName: ResourceName, Entries: BatchPutGeofenceRequestEntriesList): BatchPutGeofenceRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutGeofenceRequest]
  }
  
  extension [Self <: BatchPutGeofenceRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: BatchPutGeofenceRequestEntriesList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: BatchPutGeofenceRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
  }
}
