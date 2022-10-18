package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsInput extends StObject {
  
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: LoadBalancerNamesMax20
}
object DescribeTagsInput {
  
  inline def apply(LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  
  extension [Self <: DescribeTagsInput](x: Self) {
    
    inline def setLoadBalancerNames(value: LoadBalancerNamesMax20): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value*))
  }
}
