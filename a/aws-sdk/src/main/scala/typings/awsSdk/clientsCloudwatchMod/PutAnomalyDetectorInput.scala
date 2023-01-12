package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAnomalyDetectorInput extends StObject {
  
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined
  
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The metric math anomaly detector to be created. When using MetricMathAnomalyDetector, you cannot include the following parameters in the same operation:    Dimensions     MetricName     Namespace     Stat    the SingleMetricAnomalyDetector parameters of PutAnomalyDetectorInput    Instead, specify the metric math anomaly detector attributes as part of the property MetricMathAnomalyDetector.
    */
  var MetricMathAnomalyDetector: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricMathAnomalyDetector] = js.undefined
  
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
  
  /**
    * A single metric anomaly detector to be created. When using SingleMetricAnomalyDetector, you cannot include the following parameters in the same operation:    Dimensions     MetricName     Namespace     Stat    the MetricMatchAnomalyDetector parameters of PutAnomalyDetectorInput    Instead, specify the single metric anomaly detector attributes as part of the property SingleMetricAnomalyDetector.
    */
  var SingleMetricAnomalyDetector: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.SingleMetricAnomalyDetector] = js.undefined
  
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
}
object PutAnomalyDetectorInput {
  
  inline def apply(): PutAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAnomalyDetectorInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: AnomalyDetectorConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
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
