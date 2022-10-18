package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LBCookieStickinessPolicy extends StObject {
  
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsSdk.clientsElbMod.CookieExpirationPeriod] = js.undefined
  
  /**
    * The name of the policy. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.clientsElbMod.PolicyName] = js.undefined
}
object LBCookieStickinessPolicy {
  
  inline def apply(): LBCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LBCookieStickinessPolicy]
  }
  
  extension [Self <: LBCookieStickinessPolicy](x: Self) {
    
    inline def setCookieExpirationPeriod(value: CookieExpirationPeriod): Self = StObject.set(x, "CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    inline def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "CookieExpirationPeriod", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
