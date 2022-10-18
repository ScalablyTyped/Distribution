package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerRequest extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName
}
object GetLoadBalancerRequest {
  
  inline def apply(loadBalancerName: ResourceName): GetLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerRequest]
  }
  
  extension [Self <: GetLoadBalancerRequest](x: Self) {
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
