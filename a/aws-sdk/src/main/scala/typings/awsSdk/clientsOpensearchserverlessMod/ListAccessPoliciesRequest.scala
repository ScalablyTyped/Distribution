package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPoliciesRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results. The default is 20.
    */
  var maxResults: js.UndefOr[ListAccessPoliciesRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListAccessPolicies operation returns a nextToken, you can include the returned nextToken in subsequent ListAccessPolicies operations, which returns results in the next page. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Resource filters (can be collections or indexes) that policies can apply to.
    */
  var resource: js.UndefOr[ListAccessPoliciesRequestResourceList] = js.undefined
  
  /**
    * The type of access policy.
    */
  var `type`: AccessPolicyType
}
object ListAccessPoliciesRequest {
  
  inline def apply(`type`: AccessPolicyType): ListAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListAccessPoliciesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResource(value: ListAccessPoliciesRequestResourceList): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: Resource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setType(value: AccessPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
