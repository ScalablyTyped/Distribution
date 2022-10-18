package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of a specific data quality metric set.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
}
object GetDataQualityMetricsRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): GetDataQualityMetricsRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataQualityMetricsRequest]
  }
  
  extension [Self <: GetDataQualityMetricsRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
  }
}
