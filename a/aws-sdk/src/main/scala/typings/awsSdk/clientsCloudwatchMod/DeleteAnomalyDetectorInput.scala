package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnomalyDetectorInput extends StObject {
  
  /**
    * The metric dimensions associated with the anomaly detection model to delete.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The metric math anomaly detector to be deleted. When using MetricMathAnomalyDetector, you cannot include following parameters in the same operation:    Dimensions,    MetricName     Namespace     Stat    the SingleMetricAnomalyDetector parameters of DeleteAnomalyDetectorInput    Instead, specify the metric math anomaly detector attributes as part of the MetricMathAnomalyDetector property.
    */
  var MetricMathAnomalyDetector: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricMathAnomalyDetector] = js.undefined
  
  /**
    * The metric name associated with the anomaly detection model to delete.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * The namespace associated with the anomaly detection model to delete.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
  
  /**
    * A single metric anomaly detector to be deleted. When using SingleMetricAnomalyDetector, you cannot include the following parameters in the same operation:    Dimensions,    MetricName     Namespace     Stat    the MetricMathAnomalyDetector parameters of DeleteAnomalyDetectorInput    Instead, specify the single metric anomaly detector attributes as part of the SingleMetricAnomalyDetector property.
    */
  var SingleMetricAnomalyDetector: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.SingleMetricAnomalyDetector] = js.undefined
  
  /**
    * The statistic associated with the anomaly detection model to delete.
    */
  var Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
}
object DeleteAnomalyDetectorInput {
  
  inline def apply(): DeleteAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAnomalyDetectorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnomalyDetectorInput] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricMathAnomalyDetector(value: MetricMathAnomalyDetector): Self = StObject.set(x, "MetricMathAnomalyDetector", value.asInstanceOf[js.Any])
    
    inline def setMetricMathAnomalyDetectorUndefined: Self = StObject.set(x, "MetricMathAnomalyDetector", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setSingleMetricAnomalyDetector(value: SingleMetricAnomalyDetector): Self = StObject.set(x, "SingleMetricAnomalyDetector", value.asInstanceOf[js.Any])
    
    inline def setSingleMetricAnomalyDetectorUndefined: Self = StObject.set(x, "SingleMetricAnomalyDetector", js.undefined)
    
    inline def setStat(value: AnomalyDetectorMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setStatUndefined: Self = StObject.set(x, "Stat", js.undefined)
  }
}
