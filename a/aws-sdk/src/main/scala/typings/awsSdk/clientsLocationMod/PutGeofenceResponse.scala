package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutGeofenceResponse extends StObject {
  
  /**
    * The timestamp for when the geofence was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var CreateTime: js.Date
  
  /**
    * The geofence identifier entered in the request.
    */
  var GeofenceId: Id
  
  /**
    * The timestamp for when the geofence was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var UpdateTime: js.Date
}
object PutGeofenceResponse {
  
  inline def apply(CreateTime: js.Date, GeofenceId: Id, UpdateTime: js.Date): PutGeofenceResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutGeofenceResponse]
  }
  
  extension [Self <: PutGeofenceResponse](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
