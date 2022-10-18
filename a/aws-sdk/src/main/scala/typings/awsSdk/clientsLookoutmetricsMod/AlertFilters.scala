package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertFilters extends StObject {
  
  /**
    * The list of DimensionFilter objects that are used for dimension-based filtering.
    */
  var DimensionFilterList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionFilterList] = js.undefined
  
  /**
    * The list of measures that you want to get alerts for.
    */
  var MetricList: js.UndefOr[MetricNameList] = js.undefined
}
object AlertFilters {
  
  inline def apply(): AlertFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertFilters]
  }
  
  extension [Self <: AlertFilters](x: Self) {
    
    inline def setDimensionFilterList(value: DimensionFilterList): Self = StObject.set(x, "DimensionFilterList", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterListUndefined: Self = StObject.set(x, "DimensionFilterList", js.undefined)
    
    inline def setDimensionFilterListVarargs(value: DimensionFilter*): Self = StObject.set(x, "DimensionFilterList", js.Array(value*))
    
    inline def setMetricList(value: MetricNameList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
    
    inline def setMetricListVarargs(value: MetricName*): Self = StObject.set(x, "MetricList", js.Array(value*))
  }
}
