package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerTlsPoliciesResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetLoadBalancerTlsPolicies request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that describe the TLS security policies that are available.
    */
  var tlsPolicies: js.UndefOr[LoadBalancerTlsPolicyList] = js.undefined
}
object GetLoadBalancerTlsPoliciesResult {
  
  inline def apply(): GetLoadBalancerTlsPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerTlsPoliciesResult]
  }
  
  extension [Self <: GetLoadBalancerTlsPoliciesResult](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTlsPolicies(value: LoadBalancerTlsPolicyList): Self = StObject.set(x, "tlsPolicies", value.asInstanceOf[js.Any])
    
    inline def setTlsPoliciesUndefined: Self = StObject.set(x, "tlsPolicies", js.undefined)
    
    inline def setTlsPoliciesVarargs(value: LoadBalancerTlsPolicy*): Self = StObject.set(x, "tlsPolicies", js.Array(value*))
  }
}
