package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottleSettings extends StObject {
  
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.undefined
}
object ThrottleSettings {
  
  @scala.inline
  def apply(): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleSettings]
  }
  
  @scala.inline
  implicit class ThrottleSettingsMutableBuilder[Self <: ThrottleSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBurstLimit(value: Integer): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
  }
}
