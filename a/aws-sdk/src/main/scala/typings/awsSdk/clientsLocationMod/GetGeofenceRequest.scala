package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeofenceRequest extends StObject {
  
  /**
    * The geofence collection storing the target geofence.
    */
  var CollectionName: ResourceName
  
  /**
    * The geofence you're retrieving details for.
    */
  var GeofenceId: Id
}
object GetGeofenceRequest {
  
  inline def apply(CollectionName: ResourceName, GeofenceId: Id): GetGeofenceRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeofenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGeofenceRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
  }
}
