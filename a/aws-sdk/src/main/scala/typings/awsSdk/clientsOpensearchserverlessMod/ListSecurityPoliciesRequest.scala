package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityPoliciesRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results. The default is 20.
    */
  var maxResults: js.UndefOr[ListSecurityPoliciesRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListSecurityPolicies operation returns a nextToken, you can include the returned nextToken in subsequent ListSecurityPolicies operations, which returns results in the next page. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Resource filters (can be collection or indexes) that policies can apply to. 
    */
  var resource: js.UndefOr[ListSecurityPoliciesRequestResourceList] = js.undefined
  
  /**
    * The type of policy.
    */
  var `type`: SecurityPolicyType
}
object ListSecurityPoliciesRequest {
  
  inline def apply(`type`: SecurityPolicyType): ListSecurityPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSecurityPoliciesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResource(value: ListSecurityPoliciesRequestResourceList): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: Resource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setType(value: SecurityPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
