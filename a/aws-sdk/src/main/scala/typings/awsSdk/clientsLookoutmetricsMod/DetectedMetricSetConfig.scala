package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedMetricSetConfig extends StObject {
  
  /**
    * The dataset's interval.
    */
  var MetricSetFrequency: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The dataset's data source.
    */
  var MetricSource: js.UndefOr[DetectedMetricSource] = js.undefined
  
  /**
    * The dataset's offset.
    */
  var Offset: js.UndefOr[DetectedField] = js.undefined
}
object DetectedMetricSetConfig {
  
  inline def apply(): DetectedMetricSetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedMetricSetConfig]
  }
  
  extension [Self <: DetectedMetricSetConfig](x: Self) {
    
    inline def setMetricSetFrequency(value: DetectedField): Self = StObject.set(x, "MetricSetFrequency", value.asInstanceOf[js.Any])
    
    inline def setMetricSetFrequencyUndefined: Self = StObject.set(x, "MetricSetFrequency", js.undefined)
    
    inline def setMetricSource(value: DetectedMetricSource): Self = StObject.set(x, "MetricSource", value.asInstanceOf[js.Any])
    
    inline def setMetricSourceUndefined: Self = StObject.set(x, "MetricSource", js.undefined)
    
    inline def setOffset(value: DetectedField): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
  }
}
