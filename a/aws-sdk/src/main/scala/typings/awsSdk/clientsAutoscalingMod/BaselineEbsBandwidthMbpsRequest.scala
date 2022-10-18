package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineEbsBandwidthMbpsRequest extends StObject {
  
  /**
    * The maximum value in Mbps.
    */
  var Max: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The minimum value in Mbps.
    */
  var Min: js.UndefOr[NullablePositiveInteger] = js.undefined
}
object BaselineEbsBandwidthMbpsRequest {
  
  inline def apply(): BaselineEbsBandwidthMbpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineEbsBandwidthMbpsRequest]
  }
  
  extension [Self <: BaselineEbsBandwidthMbpsRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveInteger): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveInteger): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
