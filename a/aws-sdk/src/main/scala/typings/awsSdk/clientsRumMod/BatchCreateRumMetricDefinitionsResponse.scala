package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRumMetricDefinitionsResponse extends StObject {
  
  /**
    * An array of error objects, if the operation caused any errors.
    */
  var Errors: BatchCreateRumMetricDefinitionsErrors
  
  /**
    * An array of structures that define the extended metrics.
    */
  var MetricDefinitions: js.UndefOr[typings.awsSdk.clientsRumMod.MetricDefinitions] = js.undefined
}
object BatchCreateRumMetricDefinitionsResponse {
  
  inline def apply(Errors: BatchCreateRumMetricDefinitionsErrors): BatchCreateRumMetricDefinitionsResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRumMetricDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateRumMetricDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchCreateRumMetricDefinitionsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchCreateRumMetricDefinitionsError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setMetricDefinitions(value: MetricDefinitions): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value*))
  }
}
