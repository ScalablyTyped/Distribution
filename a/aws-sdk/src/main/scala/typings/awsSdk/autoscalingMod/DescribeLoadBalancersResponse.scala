package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancersResponse extends StObject {
  
  /**
    * The load balancers.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerStates] = js.undefined
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeLoadBalancersResponse {
  
  inline def apply(): DescribeLoadBalancersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersResponse]
  }
  
  extension [Self <: DescribeLoadBalancersResponse](x: Self) {
    
    inline def setLoadBalancers(value: LoadBalancerStates): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancerState*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
