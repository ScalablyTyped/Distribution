package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerToSubnetsInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The IDs of the subnets to add. You can add only one subnet per Availability Zone.
    */
  var Subnets: typings.awsSdk.clientsElbMod.Subnets
}
object AttachLoadBalancerToSubnetsInput {
  
  inline def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): AttachLoadBalancerToSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsInput]
  }
  
  extension [Self <: AttachLoadBalancerToSubnetsInput](x: Self) {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
