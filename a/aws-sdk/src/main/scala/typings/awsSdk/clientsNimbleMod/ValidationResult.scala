package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationResult extends StObject {
  
  /**
    * The current state.
    */
  var state: LaunchProfileValidationState
  
  /**
    * The status code. This will contain the failure reason if the state is VALIDATION_FAILED.
    */
  var statusCode: LaunchProfileValidationStatusCode
  
  /**
    * The status message for the validation result.
    */
  var statusMessage: LaunchProfileValidationStatusMessage
  
  /**
    * The type of the validation result.
    */
  var `type`: LaunchProfileValidationType
}
object ValidationResult {
  
  inline def apply(
    state: LaunchProfileValidationState,
    statusCode: LaunchProfileValidationStatusCode,
    statusMessage: LaunchProfileValidationStatusMessage,
    `type`: LaunchProfileValidationType
  ): ValidationResult = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
    
    inline def setState(value: LaunchProfileValidationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: LaunchProfileValidationStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: LaunchProfileValidationStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setType(value: LaunchProfileValidationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
