package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachLoadBalancerFromSubnetsInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The IDs of the subnets.
    */
  var Subnets: typings.awsSdk.clientsElbMod.Subnets
}
object DetachLoadBalancerFromSubnetsInput {
  
  inline def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): DetachLoadBalancerFromSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachLoadBalancerFromSubnetsInput] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
