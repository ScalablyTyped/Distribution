package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancersOutput extends StObject {
  
  /**
    * Information about the load balancers.
    */
  var LoadBalancers: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancers] = js.undefined
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeLoadBalancersOutput {
  
  inline def apply(): DescribeLoadBalancersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersOutput]
  }
  
  extension [Self <: DescribeLoadBalancersOutput](x: Self) {
    
    inline def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
