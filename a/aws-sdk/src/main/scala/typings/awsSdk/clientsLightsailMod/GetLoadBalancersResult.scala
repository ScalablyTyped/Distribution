package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancersResult extends StObject {
  
  /**
    * An array of LoadBalancer objects describing your load balancers.
    */
  var loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetLoadBalancers request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetLoadBalancersResult {
  
  inline def apply(): GetLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancersResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLoadBalancersResult] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancers(value: LoadBalancerList): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
