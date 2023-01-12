package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDimensionGroups extends StObject {
  
  /**
    * The available dimension groups for a metric type.
    */
  var Groups: js.UndefOr[DimensionGroupDetailList] = js.undefined
  
  /**
    * The metric type to which the dimension information belongs.
    */
  var Metric: js.UndefOr[String] = js.undefined
}
object MetricDimensionGroups {
  
  inline def apply(): MetricDimensionGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDimensionGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDimensionGroups] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: DimensionGroupDetailList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: DimensionGroupDetail*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
  }
}
