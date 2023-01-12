package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutGeofenceRequest extends StObject {
  
  /**
    * The geofence collection to store the geofence in.
    */
  var CollectionName: ResourceName
  
  /**
    * An identifier for the geofence. For example, ExampleGeofence-1.
    */
  var GeofenceId: Id
  
  /**
    * Contains the details to specify the position of the geofence. Can be either a polygon or a circle. Including both will return a validation error.  Each  geofence polygon can have a maximum of 1,000 vertices. 
    */
  var Geometry: GeofenceGeometry
}
object PutGeofenceRequest {
  
  inline def apply(CollectionName: ResourceName, GeofenceId: Id, Geometry: GeofenceGeometry): PutGeofenceRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutGeofenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutGeofenceRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: GeofenceGeometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
  }
}
