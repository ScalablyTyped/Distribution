package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketMetricDataResult extends StObject {
  
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.undefined
  
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[BucketMetricName] = js.undefined
}
object GetBucketMetricDataResult {
  
  inline def apply(): GetBucketMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetricDataResult]
  }
  
  extension [Self <: GetBucketMetricDataResult](x: Self) {
    
    inline def setMetricData(value: MetricDatapointList): Self = StObject.set(x, "metricData", value.asInstanceOf[js.Any])
    
    inline def setMetricDataUndefined: Self = StObject.set(x, "metricData", js.undefined)
    
    inline def setMetricDataVarargs(value: MetricDatapoint*): Self = StObject.set(x, "metricData", js.Array(value*))
    
    inline def setMetricName(value: BucketMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
