package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerState extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * One of the following load balancer states:    Adding - The Auto Scaling instances are being registered with the load balancer.    Added - All Auto Scaling instances are registered with the load balancer.    InService - At least one Auto Scaling instance passed an ELB health check.    Removing - The Auto Scaling instances are being deregistered from the load balancer. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the load balancer.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object LoadBalancerState {
  
  inline def apply(): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerState]
  }
  
  extension [Self <: LoadBalancerState](x: Self) {
    
    inline def setLoadBalancerName(value: XmlStringMaxLen255): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    inline def setState(value: XmlStringMaxLen255): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
