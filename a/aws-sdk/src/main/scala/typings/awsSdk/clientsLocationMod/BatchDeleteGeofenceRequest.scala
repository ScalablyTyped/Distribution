package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteGeofenceRequest extends StObject {
  
  /**
    * The geofence collection storing the geofences to be deleted.
    */
  var CollectionName: ResourceName
  
  /**
    * The batch of geofences to be deleted.
    */
  var GeofenceIds: BatchDeleteGeofenceRequestGeofenceIdsList
}
object BatchDeleteGeofenceRequest {
  
  inline def apply(CollectionName: ResourceName, GeofenceIds: BatchDeleteGeofenceRequestGeofenceIdsList): BatchDeleteGeofenceRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], GeofenceIds = GeofenceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteGeofenceRequest]
  }
  
  extension [Self <: BatchDeleteGeofenceRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setGeofenceIds(value: BatchDeleteGeofenceRequestGeofenceIdsList): Self = StObject.set(x, "GeofenceIds", value.asInstanceOf[js.Any])
    
    inline def setGeofenceIdsVarargs(value: Id*): Self = StObject.set(x, "GeofenceIds", js.Array(value*))
  }
}
