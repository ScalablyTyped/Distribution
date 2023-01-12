package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRumMetricDefinitionsError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: String
  
  /**
    * The error message for this metric definition.
    */
  var ErrorMessage: String
  
  /**
    * The ID of the metric definition that caused this error.
    */
  var MetricDefinitionId: typings.awsSdk.clientsRumMod.MetricDefinitionId
}
object BatchDeleteRumMetricDefinitionsError {
  
  inline def apply(ErrorCode: String, ErrorMessage: String, MetricDefinitionId: MetricDefinitionId): BatchDeleteRumMetricDefinitionsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], MetricDefinitionId = MetricDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteRumMetricDefinitionsError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionId(value: MetricDefinitionId): Self = StObject.set(x, "MetricDefinitionId", value.asInstanceOf[js.Any])
  }
}
