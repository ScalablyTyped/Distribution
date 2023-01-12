package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemizedMetricStats extends StObject {
  
  /**
    * The name of the measure.
    */
  var MetricName: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * The number of times that the measure appears.
    */
  var OccurrenceCount: js.UndefOr[Integer] = js.undefined
}
object ItemizedMetricStats {
  
  inline def apply(): ItemizedMetricStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemizedMetricStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemizedMetricStats] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: ColumnName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setOccurrenceCount(value: Integer): Self = StObject.set(x, "OccurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCountUndefined: Self = StObject.set(x, "OccurrenceCount", js.undefined)
  }
}
