package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedEntityDefinitionMetric extends StObject {
  
  /**
    * The aggregation of a named entity. Valid values for this structure are SUM, MIN, MAX, COUNT, AVERAGE, DISTINCT_COUNT, STDEV, STDEVP, VAR, VARP, PERCENTILE, MEDIAN, and CUSTOM.
    */
  var Aggregation: js.UndefOr[NamedEntityAggType] = js.undefined
  
  /**
    * The additional parameters for an aggregation function.
    */
  var AggregationFunctionParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AggregationFunctionParameters] = js.undefined
}
object NamedEntityDefinitionMetric {
  
  inline def apply(): NamedEntityDefinitionMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedEntityDefinitionMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedEntityDefinitionMetric] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: NamedEntityAggType): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionParameters(value: AggregationFunctionParameters): Self = StObject.set(x, "AggregationFunctionParameters", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionParametersUndefined: Self = StObject.set(x, "AggregationFunctionParameters", js.undefined)
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
  }
}
