package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerPolicies extends StObject {
  
  /**
    * The stickiness policies that are created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[AwsElbAppCookieStickinessPolicies] = js.undefined
  
  /**
    * The stickiness policies that are created using CreateLBCookieStickinessPolicy.
    */
  var LbCookieStickinessPolicies: js.UndefOr[AwsElbLbCookieStickinessPolicies] = js.undefined
  
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[StringList] = js.undefined
}
object AwsElbLoadBalancerPolicies {
  
  inline def apply(): AwsElbLoadBalancerPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerPolicies]
  }
  
  extension [Self <: AwsElbLoadBalancerPolicies](x: Self) {
    
    inline def setAppCookieStickinessPolicies(value: AwsElbAppCookieStickinessPolicies): Self = StObject.set(x, "AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAppCookieStickinessPoliciesUndefined: Self = StObject.set(x, "AppCookieStickinessPolicies", js.undefined)
    
    inline def setAppCookieStickinessPoliciesVarargs(value: AwsElbAppCookieStickinessPolicy*): Self = StObject.set(x, "AppCookieStickinessPolicies", js.Array(value*))
    
    inline def setLbCookieStickinessPolicies(value: AwsElbLbCookieStickinessPolicies): Self = StObject.set(x, "LbCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    inline def setLbCookieStickinessPoliciesUndefined: Self = StObject.set(x, "LbCookieStickinessPolicies", js.undefined)
    
    inline def setLbCookieStickinessPoliciesVarargs(value: AwsElbLbCookieStickinessPolicy*): Self = StObject.set(x, "LbCookieStickinessPolicies", js.Array(value*))
    
    inline def setOtherPolicies(value: StringList): Self = StObject.set(x, "OtherPolicies", value.asInstanceOf[js.Any])
    
    inline def setOtherPoliciesUndefined: Self = StObject.set(x, "OtherPolicies", js.undefined)
    
    inline def setOtherPoliciesVarargs(value: NonEmptyString*): Self = StObject.set(x, "OtherPolicies", js.Array(value*))
  }
}
