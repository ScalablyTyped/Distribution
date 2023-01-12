package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoadBalancerInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.clientsElbv2Mod.LoadBalancerArn
}
object DeleteLoadBalancerInput {
  
  inline def apply(LoadBalancerArn: LoadBalancerArn): DeleteLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLoadBalancerInput] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
  }
}
