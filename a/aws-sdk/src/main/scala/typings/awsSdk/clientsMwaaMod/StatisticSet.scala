package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticSet extends StObject {
  
  /**
    *  Internal only. The maximum value of the sample set.
    */
  var Maximum: js.UndefOr[Double] = js.undefined
  
  /**
    *  Internal only. The minimum value of the sample set.
    */
  var Minimum: js.UndefOr[Double] = js.undefined
  
  /**
    *  Internal only. The number of samples used for the statistic set.
    */
  var SampleCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Internal only. The sum of values for the sample set.
    */
  var Sum: js.UndefOr[Double] = js.undefined
}
object StatisticSet {
  
  inline def apply(): StatisticSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatisticSet] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
    
    inline def setSampleCount(value: Integer): Self = StObject.set(x, "SampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "SampleCount", js.undefined)
    
    inline def setSum(value: Double): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
  }
}
