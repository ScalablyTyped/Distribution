package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricFiltersResponse extends StObject {
  
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeMetricFiltersResponse {
  
  inline def apply(): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
  
  extension [Self <: DescribeMetricFiltersResponse](x: Self) {
    
    inline def setMetricFilters(value: MetricFilters): Self = StObject.set(x, "metricFilters", value.asInstanceOf[js.Any])
    
    inline def setMetricFiltersUndefined: Self = StObject.set(x, "metricFilters", js.undefined)
    
    inline def setMetricFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "metricFilters", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
