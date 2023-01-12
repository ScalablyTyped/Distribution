package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDatum extends StObject {
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[AutoMLMetricEnum] = js.undefined
  
  /**
    * The dataset split from which the AutoML job produced the metric.
    */
  var Set: js.UndefOr[MetricSetSource] = js.undefined
  
  /**
    * The name of the standard metric.   For definitions of the standard metrics, see  Autopilot candidate metrics . 
    */
  var StandardMetricName: js.UndefOr[AutoMLMetricExtendedEnum] = js.undefined
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.undefined
}
object MetricDatum {
  
  inline def apply(): MetricDatum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDatum] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: AutoMLMetricEnum): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setSet(value: MetricSetSource): Self = StObject.set(x, "Set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "Set", js.undefined)
    
    inline def setStandardMetricName(value: AutoMLMetricExtendedEnum): Self = StObject.set(x, "StandardMetricName", value.asInstanceOf[js.Any])
    
    inline def setStandardMetricNameUndefined: Self = StObject.set(x, "StandardMetricName", js.undefined)
    
    inline def setValue(value: Float): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
