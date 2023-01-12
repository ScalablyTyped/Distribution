package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoadBalancerOutput extends StObject {
  
  /**
    * Information about the load balancer.
    */
  var LoadBalancers: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancers] = js.undefined
}
object CreateLoadBalancerOutput {
  
  inline def apply(): CreateLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoadBalancerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLoadBalancerOutput] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
  }
}
