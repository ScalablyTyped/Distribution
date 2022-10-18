package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityMetricsResponse extends StObject {
  
  /**
    * A list of the data quality metrics for the AnomalyDetectorArn that you requested.
    */
  var AnomalyDetectorDataQualityMetricList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorDataQualityMetricList] = js.undefined
}
object GetDataQualityMetricsResponse {
  
  inline def apply(): GetDataQualityMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataQualityMetricsResponse]
  }
  
  extension [Self <: GetDataQualityMetricsResponse](x: Self) {
    
    inline def setAnomalyDetectorDataQualityMetricList(value: AnomalyDetectorDataQualityMetricList): Self = StObject.set(x, "AnomalyDetectorDataQualityMetricList", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDataQualityMetricListUndefined: Self = StObject.set(x, "AnomalyDetectorDataQualityMetricList", js.undefined)
    
    inline def setAnomalyDetectorDataQualityMetricListVarargs(value: AnomalyDetectorDataQualityMetric*): Self = StObject.set(x, "AnomalyDetectorDataQualityMetricList", js.Array(value*))
  }
}
