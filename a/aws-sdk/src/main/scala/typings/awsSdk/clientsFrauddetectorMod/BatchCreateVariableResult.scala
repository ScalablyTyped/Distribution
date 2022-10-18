package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateVariableResult extends StObject {
  
  /**
    * Provides the errors for the BatchCreateVariable request.
    */
  var errors: js.UndefOr[BatchCreateVariableErrorList] = js.undefined
}
object BatchCreateVariableResult {
  
  inline def apply(): BatchCreateVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableResult]
  }
  
  extension [Self <: BatchCreateVariableResult](x: Self) {
    
    inline def setErrors(value: BatchCreateVariableErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchCreateVariableError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
