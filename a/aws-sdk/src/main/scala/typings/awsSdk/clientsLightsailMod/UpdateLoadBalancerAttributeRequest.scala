package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoadBalancerAttributeRequest extends StObject {
  
  /**
    * The name of the attribute you want to update.
    */
  var attributeName: LoadBalancerAttributeName
  
  /**
    * The value that you want to specify for the attribute name. The following values are supported depending on what you specify for the attributeName request parameter:   If you specify HealthCheckPath for the attributeName request parameter, then the attributeValue request parameter must be the path to ping on the target (for example, /weather/us/wa/seattle).   If you specify SessionStickinessEnabled for the attributeName request parameter, then the attributeValue request parameter must be true to activate session stickiness or false to deactivate session stickiness.   If you specify SessionStickiness_LB_CookieDurationSeconds for the attributeName request parameter, then the attributeValue request parameter must be an interger that represents the cookie duration in seconds.   If you specify HttpsRedirectionEnabled for the attributeName request parameter, then the attributeValue request parameter must be true to activate HTTP to HTTPS redirection or false to deactivate HTTP to HTTPS redirection.   If you specify TlsPolicyName for the attributeName request parameter, then the attributeValue request parameter must be the name of the TLS policy. Use the GetLoadBalancerTlsPolicies action to get a list of TLS policy names that you can specify.  
    */
  var attributeValue: StringMax256
  
  /**
    * The name of the load balancer that you want to modify (e.g., my-load-balancer.
    */
  var loadBalancerName: ResourceName
}
object UpdateLoadBalancerAttributeRequest {
  
  inline def apply(
    attributeName: LoadBalancerAttributeName,
    attributeValue: StringMax256,
    loadBalancerName: ResourceName
  ): UpdateLoadBalancerAttributeRequest = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeValue = attributeValue.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoadBalancerAttributeRequest]
  }
  
  extension [Self <: UpdateLoadBalancerAttributeRequest](x: Self) {
    
    inline def setAttributeName(value: LoadBalancerAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: StringMax256): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
