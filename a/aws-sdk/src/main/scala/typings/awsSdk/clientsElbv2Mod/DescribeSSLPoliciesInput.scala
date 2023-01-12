package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSSLPoliciesInput extends StObject {
  
  /**
    *  The type of load balancer. The default lists the SSL policies for all load balancers.
    */
  var LoadBalancerType: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Marker] = js.undefined
  
  /**
    * The names of the policies.
    */
  var Names: js.UndefOr[SslPolicyNames] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.clientsElbv2Mod.PageSize] = js.undefined
}
object DescribeSSLPoliciesInput {
  
  inline def apply(): DescribeSSLPoliciesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSSLPoliciesInput] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerType(value: LoadBalancerTypeEnum): Self = StObject.set(x, "LoadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "LoadBalancerType", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNames(value: SslPolicyNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: SslPolicyName*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
