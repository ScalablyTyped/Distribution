package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundTripTime extends StObject {
  
  /**
    * RTT at the 50th percentile (p50).
    */
  var P50: js.UndefOr[Double] = js.undefined
  
  /**
    * RTT at the 90th percentile (p90). 
    */
  var P90: js.UndefOr[Double] = js.undefined
  
  /**
    * RTT at the 95th percentile (p95). 
    */
  var P95: js.UndefOr[Double] = js.undefined
}
object RoundTripTime {
  
  inline def apply(): RoundTripTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundTripTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundTripTime] (val x: Self) extends AnyVal {
    
    inline def setP50(value: Double): Self = StObject.set(x, "P50", value.asInstanceOf[js.Any])
    
    inline def setP50Undefined: Self = StObject.set(x, "P50", js.undefined)
    
    inline def setP90(value: Double): Self = StObject.set(x, "P90", value.asInstanceOf[js.Any])
    
    inline def setP90Undefined: Self = StObject.set(x, "P90", js.undefined)
    
    inline def setP95(value: Double): Self = StObject.set(x, "P95", value.asInstanceOf[js.Any])
    
    inline def setP95Undefined: Self = StObject.set(x, "P95", js.undefined)
  }
}
