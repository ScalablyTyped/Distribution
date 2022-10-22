package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRumMetricDefinitionsResponse extends StObject {
  
  /**
    * An array of structures that display information about the metrics that are sent by the specified app monitor to the specified destination.
    */
  var MetricDefinitions: js.UndefOr[typings.awsSdk.clientsRumMod.MetricDefinitions] = js.undefined
  
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object BatchGetRumMetricDefinitionsResponse {
  
  inline def apply(): BatchGetRumMetricDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRumMetricDefinitionsResponse]
  }
  
  extension [Self <: BatchGetRumMetricDefinitionsResponse](x: Self) {
    
    inline def setMetricDefinitions(value: MetricDefinitions): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
