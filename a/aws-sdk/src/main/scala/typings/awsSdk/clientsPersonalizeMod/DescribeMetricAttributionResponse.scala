package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricAttributionResponse extends StObject {
  
  /**
    * The details of the metric attribution.
    */
  var metricAttribution: js.UndefOr[MetricAttribution] = js.undefined
}
object DescribeMetricAttributionResponse {
  
  inline def apply(): DescribeMetricAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricAttributionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMetricAttributionResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricAttribution(value: MetricAttribution): Self = StObject.set(x, "metricAttribution", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionUndefined: Self = StObject.set(x, "metricAttribution", js.undefined)
  }
}
