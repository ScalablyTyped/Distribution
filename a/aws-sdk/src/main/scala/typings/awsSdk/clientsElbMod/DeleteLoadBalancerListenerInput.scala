package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoadBalancerListenerInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports
}
object DeleteLoadBalancerListenerInput {
  
  inline def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPorts = LoadBalancerPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLoadBalancerListenerInput] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPorts(value: Ports): Self = StObject.set(x, "LoadBalancerPorts", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPortsVarargs(value: AccessPointPort*): Self = StObject.set(x, "LoadBalancerPorts", js.Array(value*))
  }
}
