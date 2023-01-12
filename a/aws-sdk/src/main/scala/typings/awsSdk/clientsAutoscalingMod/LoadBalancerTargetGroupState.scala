package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerTargetGroupState extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.undefined
  
  /**
    * The state of the target group.    Adding - The Auto Scaling instances are being registered with the target group.    Added - All Auto Scaling instances are registered with the target group.    InService - At least one Auto Scaling instance passed an ELB health check.    Removing - The Auto Scaling instances are being deregistered from the target group. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the target group.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object LoadBalancerTargetGroupState {
  
  inline def apply(): LoadBalancerTargetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTargetGroupState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadBalancerTargetGroupState] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerTargetGroupARN(value: XmlStringMaxLen511): Self = StObject.set(x, "LoadBalancerTargetGroupARN", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTargetGroupARNUndefined: Self = StObject.set(x, "LoadBalancerTargetGroupARN", js.undefined)
    
    inline def setState(value: XmlStringMaxLen255): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
