package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteGeofenceError extends StObject {
  
  /**
    * Contains details associated to the batch error.
    */
  var Error: BatchItemError
  
  /**
    * The geofence associated with the error message.
    */
  var GeofenceId: Id
}
object BatchDeleteGeofenceError {
  
  inline def apply(Error: BatchItemError, GeofenceId: Id): BatchDeleteGeofenceError = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteGeofenceError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteGeofenceError] (val x: Self) extends AnyVal {
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
  }
}
