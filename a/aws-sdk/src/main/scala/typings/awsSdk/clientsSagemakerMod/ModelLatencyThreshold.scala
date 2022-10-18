package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelLatencyThreshold extends StObject {
  
  /**
    * The model latency percentile threshold.
    */
  var Percentile: js.UndefOr[String64] = js.undefined
  
  /**
    * The model latency percentile value in milliseconds.
    */
  var ValueInMilliseconds: js.UndefOr[Integer] = js.undefined
}
object ModelLatencyThreshold {
  
  inline def apply(): ModelLatencyThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelLatencyThreshold]
  }
  
  extension [Self <: ModelLatencyThreshold](x: Self) {
    
    inline def setPercentile(value: String64): Self = StObject.set(x, "Percentile", value.asInstanceOf[js.Any])
    
    inline def setPercentileUndefined: Self = StObject.set(x, "Percentile", js.undefined)
    
    inline def setValueInMilliseconds(value: Integer): Self = StObject.set(x, "ValueInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setValueInMillisecondsUndefined: Self = StObject.set(x, "ValueInMilliseconds", js.undefined)
  }
}
