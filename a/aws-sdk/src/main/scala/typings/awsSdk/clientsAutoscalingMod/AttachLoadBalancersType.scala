package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancersType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The names of the load balancers. You can specify up to 10 load balancers.
    */
  var LoadBalancerNames: typings.awsSdk.clientsAutoscalingMod.LoadBalancerNames
}
object AttachLoadBalancersType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, LoadBalancerNames: LoadBalancerNames): AttachLoadBalancersType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancersType]
  }
  
  extension [Self <: AttachLoadBalancersType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value*))
  }
}
