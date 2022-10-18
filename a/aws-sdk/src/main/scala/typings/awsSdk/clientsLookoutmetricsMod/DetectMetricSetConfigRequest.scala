package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMetricSetConfigRequest extends StObject {
  
  /**
    * An anomaly detector ARN.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * A data source.
    */
  var AutoDetectionMetricSource: typings.awsSdk.clientsLookoutmetricsMod.AutoDetectionMetricSource
}
object DetectMetricSetConfigRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AutoDetectionMetricSource: AutoDetectionMetricSource): DetectMetricSetConfigRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AutoDetectionMetricSource = AutoDetectionMetricSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectMetricSetConfigRequest]
  }
  
  extension [Self <: DetectMetricSetConfigRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectionMetricSource(value: AutoDetectionMetricSource): Self = StObject.set(x, "AutoDetectionMetricSource", value.asInstanceOf[js.Any])
  }
}
