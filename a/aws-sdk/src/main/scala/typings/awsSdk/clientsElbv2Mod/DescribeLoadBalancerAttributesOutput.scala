package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerAttributesOutput extends StObject {
  
  /**
    * Information about the load balancer attributes.
    */
  var Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
}
object DescribeLoadBalancerAttributesOutput {
  
  inline def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  
  extension [Self <: DescribeLoadBalancerAttributesOutput](x: Self) {
    
    inline def setAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: LoadBalancerAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
