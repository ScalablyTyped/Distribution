package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRumMetricDefinitionsError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: String
  
  /**
    * The error message for this metric definition.
    */
  var ErrorMessage: String
  
  /**
    * The metric definition that caused this error.
    */
  var MetricDefinition: MetricDefinitionRequest
}
object BatchCreateRumMetricDefinitionsError {
  
  inline def apply(ErrorCode: String, ErrorMessage: String, MetricDefinition: MetricDefinitionRequest): BatchCreateRumMetricDefinitionsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], MetricDefinition = MetricDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRumMetricDefinitionsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateRumMetricDefinitionsError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinition(value: MetricDefinitionRequest): Self = StObject.set(x, "MetricDefinition", value.asInstanceOf[js.Any])
  }
}
