package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDatum extends StObject {
  
  /**
    *  Internal only. The dimensions associated with the metric.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsMwaaMod.Dimensions] = js.undefined
  
  /**
    *  Internal only. The name of the metric.
    */
  var MetricName: String
  
  /**
    *  Internal only. The statistical values for the metric.
    */
  var StatisticValues: js.UndefOr[StatisticSet] = js.undefined
  
  /**
    *  Internal only. The time the metric data was received.
    */
  var Timestamp: js.Date
  
  /**
    *  Internal only. The unit used to store the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.clientsMwaaMod.Unit] = js.undefined
  
  /**
    *  Internal only. The value for the metric.
    */
  var Value: js.UndefOr[Double] = js.undefined
}
object MetricDatum {
  
  inline def apply(MetricName: String, Timestamp: js.Date): MetricDatum = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatum]
  }
  
  extension [Self <: MetricDatum](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: String): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setStatisticValues(value: StatisticSet): Self = StObject.set(x, "StatisticValues", value.asInstanceOf[js.Any])
    
    inline def setStatisticValuesUndefined: Self = StObject.set(x, "StatisticValues", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
