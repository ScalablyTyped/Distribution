package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentileAggregation extends StObject {
  
  /**
    * The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the median value of the measure.
    */
  var PercentileValue: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PercentileValue] = js.undefined
}
object PercentileAggregation {
  
  inline def apply(): PercentileAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentileAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PercentileAggregation] (val x: Self) extends AnyVal {
    
    inline def setPercentileValue(value: PercentileValue): Self = StObject.set(x, "PercentileValue", value.asInstanceOf[js.Any])
    
    inline def setPercentileValueUndefined: Self = StObject.set(x, "PercentileValue", js.undefined)
  }
}
