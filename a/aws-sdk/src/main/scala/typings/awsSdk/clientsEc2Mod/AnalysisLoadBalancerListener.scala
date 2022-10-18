package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLoadBalancerListener extends StObject {
  
  /**
    * [Classic Load Balancers] The back-end port for the listener.
    */
  var InstancePort: js.UndefOr[Port] = js.undefined
  
  /**
    * The port on which the load balancer is listening.
    */
  var LoadBalancerPort: js.UndefOr[Port] = js.undefined
}
object AnalysisLoadBalancerListener {
  
  inline def apply(): AnalysisLoadBalancerListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisLoadBalancerListener]
  }
  
  extension [Self <: AnalysisLoadBalancerListener](x: Self) {
    
    inline def setInstancePort(value: Port): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    inline def setInstancePortUndefined: Self = StObject.set(x, "InstancePort", js.undefined)
    
    inline def setLoadBalancerPort(value: Port): Self = StObject.set(x, "LoadBalancerPort", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPortUndefined: Self = StObject.set(x, "LoadBalancerPort", js.undefined)
  }
}
