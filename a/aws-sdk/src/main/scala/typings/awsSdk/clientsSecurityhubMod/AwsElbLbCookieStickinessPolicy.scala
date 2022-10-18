package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLbCookieStickinessPolicy extends StObject {
  
  /**
    * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the policy. The name must be unique within the set of policies for the load balancer.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLbCookieStickinessPolicy {
  
  inline def apply(): AwsElbLbCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLbCookieStickinessPolicy]
  }
  
  extension [Self <: AwsElbLbCookieStickinessPolicy](x: Self) {
    
    inline def setCookieExpirationPeriod(value: Long): Self = StObject.set(x, "CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    inline def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "CookieExpirationPeriod", js.undefined)
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
