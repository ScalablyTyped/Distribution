package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutGeofenceResponse extends StObject {
  
  /**
    * Contains additional error details for each geofence that failed to be stored in a geofence collection.
    */
  var Errors: BatchPutGeofenceErrorList
  
  /**
    * Contains each geofence that was successfully stored in a geofence collection.
    */
  var Successes: BatchPutGeofenceSuccessList
}
object BatchPutGeofenceResponse {
  
  inline def apply(Errors: BatchPutGeofenceErrorList, Successes: BatchPutGeofenceSuccessList): BatchPutGeofenceResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any], Successes = Successes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutGeofenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutGeofenceResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchPutGeofenceErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchPutGeofenceError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setSuccesses(value: BatchPutGeofenceSuccessList): Self = StObject.set(x, "Successes", value.asInstanceOf[js.Any])
    
    inline def setSuccessesVarargs(value: BatchPutGeofenceSuccess*): Self = StObject.set(x, "Successes", js.Array(value*))
  }
}
