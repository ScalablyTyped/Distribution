package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricValuesResponse extends StObject {
  
  /**
    * The data the thing reports for the metric during the specified time period.
    */
  var metricDatumList: js.UndefOr[MetricDatumList] = js.undefined
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMetricValuesResponse {
  
  inline def apply(): ListMetricValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricValuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricValuesResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricDatumList(value: MetricDatumList): Self = StObject.set(x, "metricDatumList", value.asInstanceOf[js.Any])
    
    inline def setMetricDatumListUndefined: Self = StObject.set(x, "metricDatumList", js.undefined)
    
    inline def setMetricDatumListVarargs(value: MetricDatum*): Self = StObject.set(x, "metricDatumList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
