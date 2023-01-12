package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachLoadBalancerFromSubnetsOutput extends StObject {
  
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.clientsElbMod.Subnets] = js.undefined
}
object DetachLoadBalancerFromSubnetsOutput {
  
  inline def apply(): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachLoadBalancerFromSubnetsOutput] (val x: Self) extends AnyVal {
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
