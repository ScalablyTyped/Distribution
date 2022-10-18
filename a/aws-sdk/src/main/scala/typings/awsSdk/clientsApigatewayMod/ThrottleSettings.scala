package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottleSettings extends StObject {
  
  /**
    * The API target request burst rate limit. This allows more requests through for a period of time than the target rate limit.
    */
  var burstLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The API target request rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.undefined
}
object ThrottleSettings {
  
  inline def apply(): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleSettings]
  }
  
  extension [Self <: ThrottleSettings](x: Self) {
    
    inline def setBurstLimit(value: Integer): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
    
    inline def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
    
    inline def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
  }
}
