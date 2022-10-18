package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancersInput extends StObject {
  
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancerArns] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Marker] = js.undefined
  
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.clientsElbv2Mod.PageSize] = js.undefined
}
object DescribeLoadBalancersInput {
  
  inline def apply(): DescribeLoadBalancersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersInput]
  }
  
  extension [Self <: DescribeLoadBalancersInput](x: Self) {
    
    inline def setLoadBalancerArns(value: LoadBalancerArns): Self = StObject.set(x, "LoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnsUndefined: Self = StObject.set(x, "LoadBalancerArns", js.undefined)
    
    inline def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = StObject.set(x, "LoadBalancerArns", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNames(value: LoadBalancerNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: LoadBalancerName*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
