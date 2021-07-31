package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachLoadBalancersType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The names of the load balancers. You can specify up to 10 load balancers.
    */
  var LoadBalancerNames: typings.awsSdk.autoscalingMod.LoadBalancerNames
}
object DetachLoadBalancersType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LoadBalancerNames: LoadBalancerNames): DetachLoadBalancersType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancersType]
  }
  
  @scala.inline
  implicit class DetachLoadBalancersTypeMutableBuilder[Self <: DetachLoadBalancersType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
  }
}
