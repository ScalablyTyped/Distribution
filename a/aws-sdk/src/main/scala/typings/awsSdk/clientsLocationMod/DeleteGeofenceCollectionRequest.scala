package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGeofenceCollectionRequest extends StObject {
  
  /**
    * The name of the geofence collection to be deleted.
    */
  var CollectionName: ResourceName
}
object DeleteGeofenceCollectionRequest {
  
  inline def apply(CollectionName: ResourceName): DeleteGeofenceCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGeofenceCollectionRequest]
  }
  
  extension [Self <: DeleteGeofenceCollectionRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
  }
}
