package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDevicePositionResponse extends StObject {
  
  /**
    * Contains error details for each device that failed to update its position.
    */
  var Errors: BatchUpdateDevicePositionErrorList
}
object BatchUpdateDevicePositionResponse {
  
  inline def apply(Errors: BatchUpdateDevicePositionErrorList): BatchUpdateDevicePositionResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDevicePositionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateDevicePositionResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchUpdateDevicePositionErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchUpdateDevicePositionError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
