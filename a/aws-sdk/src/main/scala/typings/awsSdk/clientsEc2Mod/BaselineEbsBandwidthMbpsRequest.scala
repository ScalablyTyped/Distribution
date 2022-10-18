package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineEbsBandwidthMbpsRequest extends StObject {
  
  /**
    * The maximum baseline bandwidth, in Mbps. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum baseline bandwidth, in Mbps. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object BaselineEbsBandwidthMbpsRequest {
  
  inline def apply(): BaselineEbsBandwidthMbpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineEbsBandwidthMbpsRequest]
  }
  
  extension [Self <: BaselineEbsBandwidthMbpsRequest](x: Self) {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
