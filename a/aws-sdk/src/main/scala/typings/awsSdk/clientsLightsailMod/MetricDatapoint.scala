package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDatapoint extends StObject {
  
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.undefined
  
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.undefined
  
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.undefined
  
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.undefined
  
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.undefined
  
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.undefined
}
object MetricDatapoint {
  
  inline def apply(): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatapoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDatapoint] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setMaximum(value: double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setSampleCount(value: double): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    
    inline def setSum(value: double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
