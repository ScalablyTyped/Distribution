package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteGeofenceResponse extends StObject {
  
  /**
    * Contains error details for each geofence that failed to delete.
    */
  var Errors: BatchDeleteGeofenceErrorList
}
object BatchDeleteGeofenceResponse {
  
  inline def apply(Errors: BatchDeleteGeofenceErrorList): BatchDeleteGeofenceResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteGeofenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteGeofenceResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchDeleteGeofenceErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchDeleteGeofenceError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
