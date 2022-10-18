package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleMetricAnomalyDetector extends StObject {
  
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
  
  /**
    * The statistic to use for the metric and anomaly detection model.
    */
  var Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
}
object SingleMetricAnomalyDetector {
  
  inline def apply(): SingleMetricAnomalyDetector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMetricAnomalyDetector]
  }
  
  extension [Self <: SingleMetricAnomalyDetector](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setStat(value: AnomalyDetectorMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setStatUndefined: Self = StObject.set(x, "Stat", js.undefined)
  }
}
