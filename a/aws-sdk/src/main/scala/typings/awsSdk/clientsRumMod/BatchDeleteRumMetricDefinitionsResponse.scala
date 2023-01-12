package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRumMetricDefinitionsResponse extends StObject {
  
  /**
    * An array of error objects, if the operation caused any errors.
    */
  var Errors: BatchDeleteRumMetricDefinitionsErrors
  
  /**
    * The IDs of the metric definitions that were deleted.
    */
  var MetricDefinitionIds: js.UndefOr[typings.awsSdk.clientsRumMod.MetricDefinitionIds] = js.undefined
}
object BatchDeleteRumMetricDefinitionsResponse {
  
  inline def apply(Errors: BatchDeleteRumMetricDefinitionsErrors): BatchDeleteRumMetricDefinitionsResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteRumMetricDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchDeleteRumMetricDefinitionsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchDeleteRumMetricDefinitionsError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setMetricDefinitionIds(value: MetricDefinitionIds): Self = StObject.set(x, "MetricDefinitionIds", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionIdsUndefined: Self = StObject.set(x, "MetricDefinitionIds", js.undefined)
    
    inline def setMetricDefinitionIdsVarargs(value: MetricDefinitionId*): Self = StObject.set(x, "MetricDefinitionIds", js.Array(value*))
  }
}
