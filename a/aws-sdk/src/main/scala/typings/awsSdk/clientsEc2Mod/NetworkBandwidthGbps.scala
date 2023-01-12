package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkBandwidthGbps extends StObject {
  
  /**
    * The maximum amount of network bandwidth, in Gbps. If this parameter is not specified, there is no maximum limit.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum amount of network bandwidth, in Gbps. If this parameter is not specified, there is no minimum limit.
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object NetworkBandwidthGbps {
  
  inline def apply(): NetworkBandwidthGbps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBandwidthGbps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkBandwidthGbps] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
