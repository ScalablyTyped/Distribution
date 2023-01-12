package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkBandwidthGbpsRequest extends StObject {
  
  /**
    * The maximum amount of network bandwidth, in gigabits per second (Gbps).
    */
  var Max: js.UndefOr[NullablePositiveDouble] = js.undefined
  
  /**
    * The minimum amount of network bandwidth, in gigabits per second (Gbps).
    */
  var Min: js.UndefOr[NullablePositiveDouble] = js.undefined
}
object NetworkBandwidthGbpsRequest {
  
  inline def apply(): NetworkBandwidthGbpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBandwidthGbpsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkBandwidthGbpsRequest] (val x: Self) extends AnyVal {
    
    inline def setMax(value: NullablePositiveDouble): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveDouble): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
