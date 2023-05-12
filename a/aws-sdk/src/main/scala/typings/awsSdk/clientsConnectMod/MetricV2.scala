package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricV2 extends StObject {
  
  /**
    * Contains the filters to be used when returning data.
    */
  var MetricFilters: js.UndefOr[MetricFiltersV2List] = js.undefined
  
  /**
    * The name of the metric.  This parameter is required. The following Required = No is incorrect. 
    */
  var Name: js.UndefOr[MetricNameV2] = js.undefined
  
  /**
    * Contains information about the threshold for service level metrics.
    */
  var Threshold: js.UndefOr[ThresholdCollections] = js.undefined
}
object MetricV2 {
  
  inline def apply(): MetricV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricV2] (val x: Self) extends AnyVal {
    
    inline def setMetricFilters(value: MetricFiltersV2List): Self = StObject.set(x, "MetricFilters", value.asInstanceOf[js.Any])
    
    inline def setMetricFiltersUndefined: Self = StObject.set(x, "MetricFilters", js.undefined)
    
    inline def setMetricFiltersVarargs(value: MetricFilterV2*): Self = StObject.set(x, "MetricFilters", js.Array(value*))
    
    inline def setName(value: MetricNameV2): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setThreshold(value: ThresholdCollections): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    inline def setThresholdVarargs(value: ThresholdV2*): Self = StObject.set(x, "Threshold", js.Array(value*))
  }
}
