package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePipelineResponse extends StObject {
  
  /**
    * A list of errors if the configuration is invalid.
    */
  var Errors: js.UndefOr[ValidationMessageList] = js.undefined
  
  /**
    * A boolean indicating whether or not the pipeline configuration is valid.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
}
object ValidatePipelineResponse {
  
  inline def apply(): ValidatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatePipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidatePipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: ValidationMessageList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ValidationMessage*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
  }
}
