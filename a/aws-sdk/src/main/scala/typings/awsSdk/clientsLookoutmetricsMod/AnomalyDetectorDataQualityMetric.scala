package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetectorDataQualityMetric extends StObject {
  
  /**
    * An array of DataQualityMetricList objects. Each object in the array contains information about a data quality metric.
    */
  var MetricSetDataQualityMetricList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetDataQualityMetricList] = js.undefined
  
  /**
    * The start time for the data quality metrics collection.
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AnomalyDetectorDataQualityMetric {
  
  inline def apply(): AnomalyDetectorDataQualityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorDataQualityMetric]
  }
  
  extension [Self <: AnomalyDetectorDataQualityMetric](x: Self) {
    
    inline def setMetricSetDataQualityMetricList(value: MetricSetDataQualityMetricList): Self = StObject.set(x, "MetricSetDataQualityMetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDataQualityMetricListUndefined: Self = StObject.set(x, "MetricSetDataQualityMetricList", js.undefined)
    
    inline def setMetricSetDataQualityMetricListVarargs(value: MetricSetDataQualityMetric*): Self = StObject.set(x, "MetricSetDataQualityMetricList", js.Array(value*))
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
  }
}
