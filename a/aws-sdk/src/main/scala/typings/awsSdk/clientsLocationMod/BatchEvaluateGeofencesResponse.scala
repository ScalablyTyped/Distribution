package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEvaluateGeofencesResponse extends StObject {
  
  /**
    * Contains error details for each device that failed to evaluate its position against the given geofence collection.
    */
  var Errors: BatchEvaluateGeofencesErrorList
}
object BatchEvaluateGeofencesResponse {
  
  inline def apply(Errors: BatchEvaluateGeofencesErrorList): BatchEvaluateGeofencesResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEvaluateGeofencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchEvaluateGeofencesResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchEvaluateGeofencesErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchEvaluateGeofencesError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
