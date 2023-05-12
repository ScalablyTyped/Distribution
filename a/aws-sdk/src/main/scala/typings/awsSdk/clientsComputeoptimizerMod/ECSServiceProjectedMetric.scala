package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceProjectedMetric extends StObject {
  
  /**
    *  The lower bound values for the projected metric. 
    */
  var lowerBoundValues: js.UndefOr[MetricValues] = js.undefined
  
  /**
    *  The name of the projected metric.  The following metrics are available:    Cpu — The percentage of allocated compute units that are currently in use on the service tasks.    Memory — The percentage of memory that's currently in use on the service tasks.  
    */
  var name: js.UndefOr[ECSServiceMetricName] = js.undefined
  
  /**
    *  The timestamps of the projected metric. 
    */
  var timestamps: js.UndefOr[Timestamps] = js.undefined
  
  /**
    *  The upper bound values for the projected metric. 
    */
  var upperBoundValues: js.UndefOr[MetricValues] = js.undefined
}
object ECSServiceProjectedMetric {
  
  inline def apply(): ECSServiceProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceProjectedMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceProjectedMetric] (val x: Self) extends AnyVal {
    
    inline def setLowerBoundValues(value: MetricValues): Self = StObject.set(x, "lowerBoundValues", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundValuesUndefined: Self = StObject.set(x, "lowerBoundValues", js.undefined)
    
    inline def setLowerBoundValuesVarargs(value: MetricValue*): Self = StObject.set(x, "lowerBoundValues", js.Array(value*))
    
    inline def setName(value: ECSServiceMetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimestamps(value: Timestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "timestamps", js.Array(value*))
    
    inline def setUpperBoundValues(value: MetricValues): Self = StObject.set(x, "upperBoundValues", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundValuesUndefined: Self = StObject.set(x, "upperBoundValues", js.undefined)
    
    inline def setUpperBoundValuesVarargs(value: MetricValue*): Self = StObject.set(x, "upperBoundValues", js.Array(value*))
  }
}
