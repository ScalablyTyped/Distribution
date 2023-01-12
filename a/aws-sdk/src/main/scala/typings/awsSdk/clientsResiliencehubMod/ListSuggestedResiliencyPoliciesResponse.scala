package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuggestedResiliencyPoliciesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The suggested resiliency policies for the Resilience Hub applications.
    */
  var resiliencyPolicies: ResiliencyPolicies
}
object ListSuggestedResiliencyPoliciesResponse {
  
  inline def apply(resiliencyPolicies: ResiliencyPolicies): ListSuggestedResiliencyPoliciesResponse = {
    val __obj = js.Dynamic.literal(resiliencyPolicies = resiliencyPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSuggestedResiliencyPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSuggestedResiliencyPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResiliencyPolicies(value: ResiliencyPolicies): Self = StObject.set(x, "resiliencyPolicies", value.asInstanceOf[js.Any])
    
    inline def setResiliencyPoliciesVarargs(value: ResiliencyPolicy*): Self = StObject.set(x, "resiliencyPolicies", js.Array(value*))
  }
}
