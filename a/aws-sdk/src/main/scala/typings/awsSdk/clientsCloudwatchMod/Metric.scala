package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * The dimensions for the metric.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The name of the metric. This is a required field.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * The namespace of the metric.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
}
object Metric {
  
  inline def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
