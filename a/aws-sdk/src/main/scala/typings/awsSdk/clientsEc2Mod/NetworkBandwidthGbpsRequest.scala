package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkBandwidthGbpsRequest extends StObject {
  
  /**
    * The maximum amount of network bandwidth, in Gbps. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum amount of network bandwidth, in Gbps. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object NetworkBandwidthGbpsRequest {
  
  inline def apply(): NetworkBandwidthGbpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBandwidthGbpsRequest]
  }
  
  extension [Self <: NetworkBandwidthGbpsRequest](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
