package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerAttributesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.clientsElbv2Mod.LoadBalancerArn
}
object DescribeLoadBalancerAttributesInput {
  
  inline def apply(LoadBalancerArn: LoadBalancerArn): DescribeLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
  }
  
  extension [Self <: DescribeLoadBalancerAttributesInput](x: Self) {
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
  }
}
